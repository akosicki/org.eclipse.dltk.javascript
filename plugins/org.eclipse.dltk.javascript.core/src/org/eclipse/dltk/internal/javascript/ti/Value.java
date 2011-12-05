/*******************************************************************************
 * Copyright (c) 2010 xored software, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.ti;

import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.dltk.javascript.typeinference.IValueCollection;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinference.ReferenceKind;
import org.eclipse.dltk.javascript.typeinference.ReferenceLocation;
import org.eclipse.dltk.javascript.typeinfo.IRType;
import org.eclipse.dltk.javascript.typeinfo.ITypeSystem;
import org.eclipse.dltk.javascript.typeinfo.JSTypeSet;

public class Value extends ImmutableValue {

	@Override
	protected ITypeSystem getTypeSystem() {
		return TypeInferencer2.DELEGATING_TYPE_SYSTEM;
	}

	public void setDeclaredType(IRType declaredType) {
		this.declaredType = declaredType;
	}

	@Override
	public void addType(IRType type) {
		if (type != null) {
			this.types.add(type);
		}
	}

	public void setKind(ReferenceKind kind) {
		this.kind = kind;
	}

	public void setLocation(ReferenceLocation location) {
		this.location = location;
	}

	public void setAttribute(String key, Object value) {
		if (value != null) {
			if (attributes == null) {
				attributes = new HashMap<String, Object>();
			}
			attributes.put(key, value);
		} else {
			if (attributes != null) {
				attributes.remove(key);
			}
		}
	}

	public void deleteChild(String name) {
		if (deletedChildren == null) {
			deletedChildren = new HashSet<String>();
		}
		deletedChildren.add(name);
	}

	public void putChild(String name, IValue value) {
		inherited.put(name, value);
	}

	private static class CreateChildOperation implements Handler<Set<IValue>> {

		private final String childName;

		public CreateChildOperation(String childName) {
			this.childName = childName;
		}

		public void process(ImmutableValue value, Set<IValue> result) {
			if (result.isEmpty() && !value.hasReferences()) {
				result.add(value.createChild(childName));
			}
		}

	}

	public IValue createChild(String name) {
		IValue child = children.get(name);
		if (child == null) {
			child = inherited.get(name);
			if (child == null) {
				// creating new child, so ignore external elements
				child = findMember(name, false);
				if (child != null) {
					return child;
				}
				if (hasReferences()) {
					Set<IValue> result = new HashSet<IValue>();
					execute(this, new CreateChildOperation(name), result,
							new HashSet<IValue>());
					if (!result.isEmpty()) {
						return result.iterator().next();
					}
				}
				child = new Value();
				children.put(name, (Value) child);
				childCreated(name);
			}
		}
		return child;
	}

	public void clear() {
		references.clear();
		children.clear();
		inherited.clear();
		types.clear();
	}

	public void addValue(IValue src) {
		if (src instanceof ImmutableValue) {
			final IdentityHashMap<ImmutableValue, ImmutableValue> processing = new IdentityHashMap<ImmutableValue, ImmutableValue>();
			addValueRecursive((ImmutableValue) src, processing, 0);
			// translate references, so they point to the new value
			for (Map.Entry<ImmutableValue, ImmutableValue> entry : processing
					.entrySet()) {
				final ImmutableValue input = entry.getKey();
				final ImmutableValue output = entry.getValue();
				for (IValue ref : input.references) {
					IValue refOut = processing.get(ref);
					if (refOut == null) {
						refOut = ref;
					}
					output.references.add(refOut);
				}
			}
		} else {
			if (src.getDeclaredType() != null) {
				types.add(src.getDeclaredType());
			}
			types.addAll(src.getTypes());
			if (src.getKind() == ReferenceKind.METHOD) {
				final Object element = src.getAttribute(
						IReferenceAttributes.ELEMENT, false);
				if (element != null) {
					setAttribute(IReferenceAttributes.ELEMENT, element);
				}
				final IValue returnType = src.getChild(
						IValueReference.FUNCTION_OP, false);
				if (returnType != null) {
					final JSTypeSet myReturnTypes = createChild(
							IValueReference.FUNCTION_OP).getTypes();
					myReturnTypes.addAll(returnType.getTypes());
					myReturnTypes.addAll(returnType.getDeclaredTypes());
				}
			}
		}
	}

	public void addReference(IValue src) {
		assert src != null;
		if (src == this)
			return;
		references.add(src);
	}

	private void addValueRecursive(ImmutableValue src,
			Map<ImmutableValue, ImmutableValue> processing, int depth) {
		if (!processing.containsKey(src)) {
			processing.put(src, this);
			if (depth > 8) {
				// TODO logging?
				return;
			}
			if (src.declaredType != null) {
				types.add(src.declaredType);
			}
			types.addAll(src.types);
			// (references will be copied later)
			if (src.attributes != null) {
				if (attributes == null) {
					attributes = new HashMap<String, Object>();
				}
				attributes.putAll(src.attributes);
			}
			for (Map.Entry<String, ImmutableValue> entry : src.children
					.entrySet()) {
				IValue child = createChild(entry.getKey());
				if (child instanceof Value) {
					((Value) child).addValueRecursive(entry.getValue(),
							processing, depth + 1);
				}
			}
			if (src.kind != ReferenceKind.UNKNOWN
					&& kind == ReferenceKind.UNKNOWN) {
				kind = src.kind;
			}
			if (src.location != ReferenceLocation.UNKNOWN
					&& location == ReferenceLocation.UNKNOWN) {
				location = src.location;
			}
		}
	}

	public void putDirectChild(String name, ImmutableValue value) {
		children.put(name, value);
	}

	public void resolveLazyValues(Set<Value> visited) {
		if (visited.add(this)) {
			for (IValue value : references) {
				if (value instanceof ILazyValue
						&& !((ILazyValue) value).isResolved()) {
					((ILazyValue) value).setFinalResolve();
				} else if (value instanceof Value) {
					((Value) value).resolveLazyValues(visited);
				}
			}
			for (ImmutableValue value : children.values()) {
				if (value instanceof Value)
					((Value) value).resolveLazyValues(visited);
			}

			if (attributes != null) {
				for (Object attibute : attributes.values()) {
					if (attibute instanceof IValueProvider) {
						IValue value = ((IValueProvider) attibute).getValue();
						if (value instanceof Value) {
							((Value) value).resolveLazyValues(visited);
						}
					}
				}
			}
		}
	}

	public ImmutableValue getImmutableValue(Map<Object, Object> visited) {
		ImmutableValue immutableValue = (ImmutableValue) visited.get(this);
		if (immutableValue != null)
			return immutableValue;

		if (this instanceof ILazyValue) {
			((ILazyValue) this).resolve();
		}

		JSTypeSet typeSet = JSTypeSet.create();
		typeSet.addAll(types);
		Set<String> deletedChilds = null;
		if (deletedChildren != null) {
			deletedChilds = new HashSet<String>(deletedChildren.size(), 0.9f);
			deletedChilds.addAll(deletedChildren);
		}

		Map<String, ImmutableValue> childs = new HashMap<String, ImmutableValue>(
				children.size(), 0.9f);
		Map<String, IValue> inherits = new HashMap<String, IValue>(
				inherited.size(), 0.9f);
		Set<IValue> refers = new HashSet<IValue>(references.size(), 0.9f);
		Map<String, Object> atts = null;
		if (attributes != null) {
			atts = new HashMap<String, Object>(attributes.size(), 0.9f);
			for (Map.Entry<String, Object> entry : attributes.entrySet()) {
				if (entry.getValue() instanceof Value) {
					atts.put(entry.getKey(), ((Value) entry.getValue())
							.getImmutableValue(visited));
				} else if (entry.getValue() instanceof IValueCollection) {
					atts.put(entry.getKey(), ImmutableValueCollection
							.getImmutableValueCollection(
									(IValueCollection) entry.getValue(),
									visited));

				} else {
					atts.put(entry.getKey(), entry.getValue());
				}
			}
		}
		immutableValue = new ImmutableValue(declaredType, typeSet,
				deletedChilds, kind, location, childs, inherits, refers, atts);
		visited.put(this, immutableValue);

		for (IValue value : references) {
			if (value instanceof Value) {
				refers.add(((Value) value).getImmutableValue(visited));
			} else {
				refers.add(value);
			}
		}

		for (Map.Entry<String, ImmutableValue> entry : children.entrySet()) {
			if (entry.getValue() instanceof Value) {
				childs.put(entry.getKey(),
						((Value) entry.getValue()).getImmutableValue(visited));
			} else {
				childs.put(entry.getKey(), entry.getValue());
			}
		}

		for (Map.Entry<String, IValue> entry : inherited.entrySet()) {
			if (entry.getValue() instanceof Value)
				inherits.put(entry.getKey(),
						((Value) entry.getValue()).getImmutableValue(visited));
			else
				inherits.put(entry.getKey(), entry.getValue());
		}
		return immutableValue;
	}

}
