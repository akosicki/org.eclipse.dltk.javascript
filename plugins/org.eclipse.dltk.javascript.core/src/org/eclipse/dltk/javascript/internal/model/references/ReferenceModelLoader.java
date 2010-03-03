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
package org.eclipse.dltk.javascript.internal.model.references;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.dltk.internal.javascript.typeinference.IReference;
import org.eclipse.dltk.internal.javascript.typeinference.NativeArrayReference;
import org.eclipse.dltk.internal.javascript.typeinference.NativeBooleanReference;
import org.eclipse.dltk.internal.javascript.typeinference.NativeDateReference;
import org.eclipse.dltk.internal.javascript.typeinference.NativeJSObjectReference;
import org.eclipse.dltk.internal.javascript.typeinference.NativeNumberReference;
import org.eclipse.dltk.internal.javascript.typeinference.NativeStringReference;
import org.eclipse.dltk.internal.javascript.typeinference.NativeXMLReference;
import org.eclipse.dltk.internal.javascript.typeinference.ReferenceFactory;
import org.eclipse.dltk.internal.javascript.typeinference.StandardSelfCompletingReference;
import org.eclipse.dltk.javascript.core.JavaScriptPlugin;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelLoader;

public class ReferenceModelLoader {

	private static ReferenceModelLoader instance = null;

	public synchronized static ReferenceModelLoader getInstance() {
		if (instance == null) {
			instance = new ReferenceModelLoader();
		}
		return instance;
	}

	private ReferenceModelLoader() {
		registerFactories();
	}

	public Collection<IReference> getChildren(String typeName) {
		final Type type = TypeInfoModelLoader.getInstance().getType(typeName);
		if (type != null) {
			return getChildren(type);
		} else {
			return Collections.emptyList();
		}
	}

	private final Map<Type, List<IReference>> referencesByType = new IdentityHashMap<Type, List<IReference>>();

	/**
	 * @param type
	 * @return
	 */
	private Collection<IReference> getChildren(Type type) {
		List<IReference> list = referencesByType.get(type);
		if (list != null) {
			return list;
		}
		list = new ArrayList<IReference>();
		for (Member member : type.getMembers()) {
			if (member.getType() == null) {
				JavaScriptPlugin.error("No type for " + type.getName() + "."
						+ member.getName());
				continue;
			}
			final Factory factory = factories.get(member.getType().getName());
			if (factory == null) {
				JavaScriptPlugin.error("No factory for " + type.getName() + "."
						+ member.getName() + ":" + member.getType().getName());
				continue;
			}
			final StandardSelfCompletingReference reference = factory
					.create(member.getName());
			reference.setProposalInfo(member.getDescription());
			if (member instanceof Method) {
				final Method method = (Method) member;
				if (!method.getParameters().isEmpty()) {
					final int paramCount = method.getParameters().size();
					final String[] params = new String[paramCount];
					for (int i = 0; i < paramCount; ++i) {
						params[i] = method.getParameters().get(i).getName();
					}
					reference.setParameterNames(params);
				}
				reference.setFunctionRef();
			}
			list.add(reference);
		}
		list = Collections.unmodifiableList(list);
		referencesByType.put(type, list);
		return list;
	}

	private static interface Factory {
		StandardSelfCompletingReference create(String name);
	}

	private final Map<String, Factory> factories = new HashMap<String, Factory>();

	private void registerFactories() {
		factories.put(ReferenceFactory.ARRAY, new Factory() {
			public StandardSelfCompletingReference create(String name) {
				return new NativeArrayReference(name);
			}
		});
		factories.put(ReferenceFactory.BOOLEAN, new Factory() {
			public StandardSelfCompletingReference create(String name) {
				return new NativeBooleanReference(name);
			}
		});
		factories.put(ReferenceFactory.NUMBER, new Factory() {
			public StandardSelfCompletingReference create(String name) {
				return new NativeNumberReference(name);
			}
		});
		factories.put(ReferenceFactory.STRING, new Factory() {
			public StandardSelfCompletingReference create(String name) {
				return new NativeStringReference(name);
			}
		});
		factories.put(ReferenceFactory.XML, new Factory() {
			public StandardSelfCompletingReference create(String name) {
				return new NativeXMLReference(name);
			}
		});
		factories.put(ReferenceFactory.DATE, new Factory() {
			public StandardSelfCompletingReference create(String name) {
				return new NativeDateReference(name);
			}
		});
		factories.put(ReferenceFactory.OBJECT, new Factory() {
			public StandardSelfCompletingReference create(String name) {
				return new NativeJSObjectReference(name);
			}
		});
		factories.put("void", new Factory() {
			public StandardSelfCompletingReference create(String name) {
				return new StandardSelfCompletingReference(name, false);
			}
		});
	}

}
