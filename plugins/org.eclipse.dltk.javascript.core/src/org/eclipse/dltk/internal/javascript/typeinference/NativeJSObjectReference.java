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
package org.eclipse.dltk.internal.javascript.typeinference;

import java.util.Collections;
import java.util.Set;

import org.eclipse.dltk.javascript.typeinfo.ITypeNames;

public class NativeJSObjectReference extends StandardSelfCompletingReference {

	/**
	 * @param paramOrVarName
	 */
	public NativeJSObjectReference(String paramOrVarName) {
		super(paramOrVarName, false);
	}

	@Override
	public Set<String> getTypes() {
		return Collections.singleton(ITypeNames.OBJECT);
	}

	@Override
	protected void createChilds() {
		addChildren(ReferenceModelLoader.getInstance().getChildren(
				ITypeNames.OBJECT));
	}

}
