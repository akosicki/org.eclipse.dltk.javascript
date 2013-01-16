package org.eclipse.dltk.javascript.core.tests.contentassist;

import static org.eclipse.dltk.javascript.internal.core.codeassist.JavaScriptCompletionUtil.evaluateExpressionType;
import static org.eclipse.dltk.javascript.internal.core.codeassist.JavaScriptCompletionUtil.ExpressionType.OBJECT_INITIALIZER;

import junit.framework.TestCase;

import org.eclipse.dltk.annotations.NonNull;
import org.eclipse.dltk.annotations.Nullable;
import org.eclipse.dltk.javascript.internal.core.codeassist.JavaScriptCompletionUtil;
import org.eclipse.dltk.javascript.internal.core.codeassist.JavaScriptCompletionUtil.ExpressionType;

import com.google.common.base.Preconditions;

@SuppressWarnings("restriction")
public class JavaScriptCompletionUtilTest extends TestCase {

	/**
	 * Asserts that the cursor at the given position in the given program has
	 * the given {@link ExpressionType}
	 * 
	 * @param code
	 * @param position
	 *            end of the first occurrence of this string in the code marks
	 *            the cursor position
	 * @return
	 */
	private static ExpressionType getExpressionType(@NonNull String code,
			@NonNull String position) {
		int index = code.indexOf(position);
		Preconditions.checkArgument(index != -1,
				"Cannot find given position in the code");
		return JavaScriptCompletionUtil.evaluateExpressionType(null, code,
				index + position.length());
	}

	/**
	 * Asserts that all and only fields selected by the pattern have given
	 * {@link ExpressionType}
	 * 
	 * @param code
	 *            valid JavaScript program
	 * @param pattern
	 *            consisting of spaces and '^' character, one character longer
	 *            than the program code
	 * @param expectedType
	 */
	private static void assertExpressionType(@NonNull String code,
			@NonNull String pattern, @Nullable ExpressionType expectedType) {
		Preconditions.checkArgument(code.length() + 1 == pattern.length(),
				"Pattern must be one character longer than the program code");
		Preconditions.checkArgument(pattern.matches("[ ^]*"),
				"Only \"^\" and \" \" characters allowed in the pattern");
		for (int index = 0; index <= code.length(); index++) {
			ExpressionType actualType = evaluateExpressionType(null, code,
					index);
			if (pattern.charAt(index) == '^' ? expectedType != actualType
					: expectedType == actualType) {
				assertEquals(pattern, pattern.substring(0, index) + "#"
						+ pattern.substring(index + 1));
			}
		}
	}

	public void testEvaluateExpressionType_SimpleObjectInitializer() {
		final String program = "var a = { };";
		assertNotSame(OBJECT_INITIALIZER, getExpressionType(program, "a = "));
		assertSame(OBJECT_INITIALIZER, getExpressionType(program, "{"));
		assertSame(OBJECT_INITIALIZER, getExpressionType(program, "{ "));
		assertNotSame(OBJECT_INITIALIZER, getExpressionType(program, "{ }"));
	}

	public void testEvaluateExpressionType_ObjectInitializerWithNewLines() {
		final String program = "var a = { \n };";
		assertNotSame(OBJECT_INITIALIZER, getExpressionType(program, "a = "));
		assertSame(OBJECT_INITIALIZER, getExpressionType(program, "{"));
		assertSame(OBJECT_INITIALIZER, getExpressionType(program, "{ "));
		assertSame(OBJECT_INITIALIZER, getExpressionType(program, "{ \n"));
		assertNotSame(OBJECT_INITIALIZER, getExpressionType(program, "{ \n }"));
		assertNotSame(OBJECT_INITIALIZER, getExpressionType(program, "{ \n };"));
	}

	public void testEvaluateExpressionType_ComplexObjectInitializer() {
		String code = "var object = {    name   :   'Aleksander '  ,   surname  :  'Kosicki'    };";
		String hits = "              ^^^^^                       ^^^^^^^                    ^^^^^  ";
		assertExpressionType(code, hits, OBJECT_INITIALIZER);
	}

	public void testEvaluateExpressionType_NestedObjectInitializer() {
		String code = "var object = { a : { c : 'd', e : [{ }], f: [[ { g:[]  , h :{} }, { }, {}   ]]}, b : {} };";
		String hits = "              ^^    ^^      ^^^     ^^ ^^^      ^^   ^^^^^   ^^^   ^^   ^     ^^^^    ^^^  ";
		assertExpressionType(code, hits, OBJECT_INITIALIZER);
	}
}
