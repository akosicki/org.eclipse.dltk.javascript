/*******************************************************************************
 * Copyright (c) 2011,2012 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.typeinfo;

import static org.eclipse.dltk.javascript.internal.core.TypeSystems.DELEGATING_TYPE_SYSTEM;

import org.eclipse.dltk.javascript.typeinfo.model.Type;

/**
 * Base abstract class of all the {@link IRType} implementations.
 */
public abstract class RType implements IRType {

	static final boolean DEBUG = false;

	protected final ITypeSystem typeSystem;

	protected RType() {
		this(null);
	}

	protected RType(ITypeSystem typeSystem) {
		this.typeSystem = typeSystem;
	}

	public ITypeSystem activeTypeSystem() {
		return typeSystem;
	}

	protected final void checkType(Type type) {
		if (type.isProxy()) {
			System.out.println("PROXY " + type.getName());
		}
	}

	public TypeCompatibility isAssignableFrom(IRType type) {
		if (type == RTypes.undefined() || type == RTypes.any()) {
			return TypeCompatibility.TRUE;
		} else if (type == RTypes.none()) {
			return TypeCompatibility.FALSE;
		} else if (type instanceof RUnionType) {
			for (IRType part : ((RUnionType) type).targets) {
				if (isAssignableFrom(part).ok()) {
					return TypeCompatibility.TRUE;
				}
			}
		}
		return TypeCompatibility.FALSE;
	}

	@Override
	public final String toString() {
		return getName();
	}

	protected TypeCompatibility testAssignableTo(IRType type) {
		return type instanceof IRTypeExtension2 ? ((IRTypeExtension2) type)
				.isAssignableTo(this) : TypeCompatibility.FALSE;
	}

	public boolean isExtensible() {
		return false;
	}

	public boolean isJavaScriptObject() {
		return true;
	}

	public IRType transform(IRTypeTransformer function) {
		return this;
	}

	protected final IRTypeDeclaration convert(Type type) {
		return (typeSystem != null ? typeSystem : DELEGATING_TYPE_SYSTEM)
				.convert(type);
	}

}
