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

import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinference.ReferenceKind;

public class AnonymousValue extends AbstractReference {

	public AnonymousValue() {
		this(false);
	}

	private final boolean isReference;

	public AnonymousValue(boolean isReference) {
		this.isReference = isReference;
	}

	private final Value value = new Value();

	public boolean isReference() {
		return isReference || getKind() == ReferenceKind.THIS;
	}

	@Override
	public Value getValue() {
		return value;
	}

	@Override
	public Value createValue() {
		return getValue();
	}

	public void delete() {
	}

	public String getName() {
		return "";
	}

	public IValueReference getParent() {
		return null;
	}

	protected String getToStringPrefix() {
		return "AnonymousValue";
	}

	@Override
	public String toString() {
		return getToStringPrefix() + "@" + System.identityHashCode(value);
	}

}
