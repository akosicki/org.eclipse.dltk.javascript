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
package org.eclipse.dltk.javascript.typeinfo;

import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.javascript.typeinfo.model.SimpleType;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeKind;

public interface ITypeInfoContext extends ITypeSystem {

	/**
	 * Returns the {@link Type} with the specified name. If there is already an
	 * active call to the {@link ITypeProvider} then a proxy is returned. If
	 * type couldn't be found then {@link TypeKind#UNKNOWN} type is returned.
	 * 
	 * @param typeName
	 * @return
	 */
	Type getType(String typeName);

	/**
	 * Calls {@link #getType(String)} and wraps the result as {@link SimpleType}
	 * 
	 * @param typeName
	 * @return
	 */
	SimpleType getTypeRef(String typeName);

	/**
	 * Returns the {@link Type} with the specified name. The only difference if
	 * compared to {@link #getType(String)} is that this function returns
	 * <code>null</code> instead of {@link TypeKind#UNKNOWN} type.
	 * 
	 * @param typeName
	 *            the name of the type
	 * @param mode
	 *            the mode or <code>null</code> if unknown
	 * @since 3.0
	 */
	Type getKnownType(String typeName, TypeMode mode);

	/**
	 * Returns the model element being processed or <code>null</code>
	 * 
	 * @return
	 */
	IModelElement getModelElement();

	/**
	 * Returns the source being processed or <code>null</code>
	 * 
	 * @return
	 */
	ReferenceSource getSource();

	/**
	 * Adds value for the specified attribute.
	 * 
	 * Current value of the attribute can be retrieved with
	 * {@link ITypeSystem#getAttribute(AttributeKey)}.
	 * 
	 * @param key
	 * @param value
	 */
	<T> void pushAttribute(AttributeKey<T> key, T value);

	/**
	 * Removes last added value for the specified attribute.
	 * 
	 * @param key
	 * @return
	 */
	<T> T popAttribute(AttributeKey<T> key);
}
