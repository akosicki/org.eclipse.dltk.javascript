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
package org.eclipse.dltk.javascript.parser;

import org.eclipse.dltk.ast.parser.IModuleDeclaration;
import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.compiler.problem.IProblemReporter;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.SourceParserUtil;
import org.eclipse.dltk.javascript.ast.Script;

public class JavaScriptParserUtil {

	public static Script parse(ISourceModule module) {
		return parse(module, null);
	}

	public static Script parse(ISourceModule module, IProblemReporter reporter) {
		// TODO pass additional predicate to this call...
		IModuleDeclaration declaration = SourceParserUtil.parse(module,
				reporter);
		if (declaration instanceof Script) {
			return (Script) declaration;
		}
		return new JavaScriptParser().parse((IModuleSource) module, reporter);
	}

	public static Script parse(IModuleSource module, IProblemReporter reporter) {
		if (module instanceof ISourceModule) {
			return parse((ISourceModule) module, reporter);
		}
		return new JavaScriptParser().parse(module, reporter);
	}
}
