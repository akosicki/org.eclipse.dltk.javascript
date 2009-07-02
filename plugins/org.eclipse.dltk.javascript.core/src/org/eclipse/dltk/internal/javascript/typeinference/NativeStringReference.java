/**
 * 
 */
package org.eclipse.dltk.internal.javascript.typeinference;

/**
 * @author jcompagner
 * 
 */
public class NativeStringReference extends StandardSelfCompletingReference {

	private static StandardSelfCompletingReference toString = new NativeStringReference(
			"toString").setFunctionRef();
	private static StandardSelfCompletingReference toSource = new NativeStringReference(
			"toSource").setFunctionRef();
	private static StandardSelfCompletingReference valueOf = new NativeStringReference(
			"valueOf").setFunctionRef();
	private static StandardSelfCompletingReference charAt = new NativeStringReference("charAt")
			.setFunctionRef();
	private static StandardSelfCompletingReference charCodeAt = new NativeNumberReference(
			"charCodeAt").setFunctionRef();
	private static StandardSelfCompletingReference indexOf = new NativeNumberReference(
			"indexOf").setFunctionRef();
	private static StandardSelfCompletingReference lastIndexOf = new NativeNumberReference(
			"lastIndexOf").setFunctionRef();
	private static StandardSelfCompletingReference split = new NativeArrayReference("split")
			.setFunctionRef();
	private static StandardSelfCompletingReference substring = new NativeStringReference(
			"substring").setFunctionRef();
	private static StandardSelfCompletingReference toLowerCase = new NativeStringReference(
			"toLowerCase").setFunctionRef();
	private static StandardSelfCompletingReference toUpperCase = new NativeStringReference(
			"toUpperCase").setFunctionRef();
	private static StandardSelfCompletingReference substr = new NativeStringReference("substr")
			.setFunctionRef();
	private static StandardSelfCompletingReference concat = new NativeStringReference("concat")
			.setFunctionRef();
	private static StandardSelfCompletingReference slice = new NativeStringReference("slice")
			.setFunctionRef();
	private static StandardSelfCompletingReference bold = new NativeStringReference("bold")
			.setFunctionRef();
	private static StandardSelfCompletingReference italics = new NativeStringReference(
			"italics").setFunctionRef();
	private static StandardSelfCompletingReference fixed = new NativeStringReference("fixed")
			.setFunctionRef();
	private static StandardSelfCompletingReference strike = new NativeStringReference("strike")
			.setFunctionRef();
	private static StandardSelfCompletingReference small = new NativeStringReference("small")
			.setFunctionRef();
	private static StandardSelfCompletingReference big = new NativeStringReference("big")
			.setFunctionRef();
	private static StandardSelfCompletingReference blink = new NativeStringReference("blink")
			.setFunctionRef();
	private static StandardSelfCompletingReference sup = new NativeStringReference("sup")
			.setFunctionRef();
	private static StandardSelfCompletingReference sub = new NativeStringReference("sub")
			.setFunctionRef();
	private static StandardSelfCompletingReference fontsize = new NativeStringReference(
			"fontsize").setFunctionRef();
	private static StandardSelfCompletingReference fontcolor = new NativeStringReference(
			"fontcolor").setFunctionRef();
	private static StandardSelfCompletingReference link = new NativeStringReference("link")
			.setFunctionRef();
	private static StandardSelfCompletingReference anchor = new NativeStringReference("anchor")
			.setFunctionRef();
	private static StandardSelfCompletingReference equals = new NativeBooleanReference(
			"equals").setFunctionRef();
	private static StandardSelfCompletingReference equalsIgnoreCase = new NativeBooleanReference(
			"equalsIgnoreCase").setFunctionRef();
	private static StandardSelfCompletingReference match = new NativeStringReference("match")
			.setFunctionRef();
	private static StandardSelfCompletingReference search = new NativeNumberReference("search")
			.setFunctionRef();
	private static StandardSelfCompletingReference replace = new NativeStringReference(
			"replace").setFunctionRef();
	private static StandardSelfCompletingReference localeCompare = new NativeNumberReference(
			"localeCompare").setFunctionRef();
	private static StandardSelfCompletingReference toLocaleLowerCase = new NativeStringReference(
			"toLocaleLowerCase").setFunctionRef();
	private static StandardSelfCompletingReference toLocaleUpperCase = new NativeStringReference(
			"toLocaleUpperCase").setFunctionRef();

	/**
	 * @param paramOrVarName
	 * @param childIsh
	 */
	public NativeStringReference(String paramOrVarName) {
		super(paramOrVarName, false);
	}

	/**
	 * @see org.eclipse.dltk.internal.javascript.typeinference.StandardSelfCompletingReference#createChilds()
	 */
	protected void createChilds() {

		setChild("toString", toString);
		setChild("toSource", toSource);
		setChild("valueOf", valueOf);
		setChild("charAt", charAt);
		setChild("charCodeAt", charCodeAt);
		setChild("indexOf", indexOf);
		setChild("lastIndexOf", lastIndexOf);
		setChild("split", split);
		setChild("substring", substring);
		setChild("toLowerCase", toLowerCase);
		setChild("toUpperCase", toUpperCase);
		setChild("substr", substr);
		setChild("concat", concat);
		setChild("slice", slice);
		setChild("bold", bold);
		setChild("italics", italics);
		setChild("fixed", fixed);
		setChild("strike", strike);
		setChild("small", small);
		setChild("big", big);
		setChild("blink", blink);
		setChild("sup", sup);
		setChild("sub", sub);
		setChild("fontsize", fontsize);
		setChild("fontcolor", fontcolor);
		setChild("link", link);
		setChild("anchor", anchor);
		setChild("equals", equals);
		setChild("equalsIgnoreCase", equalsIgnoreCase);
		setChild("match", match);
		setChild("search", search);
		setChild("replace", replace);
		setChild("localeCompare", localeCompare);
		setChild("toLocaleLowerCase", toLocaleLowerCase);
		setChild("toLocaleUpperCase", toLocaleUpperCase);
	}

	public void setChild(String key, IReference ref) {

		if (ref instanceof StandardSelfCompletingReference) {
			StandardSelfCompletingReference ur = (StandardSelfCompletingReference) ref;
			String name = ref.getName();
			if (name.equals("toString")) {
				ur.setProposalInfo("Returns a String value for this object.");
			} else if (name.equals("toSource")) {
				ur
						.setProposalInfo("The toSource() method represents the source code of an object.");
			} else if (name.equals("valueOf")) {
				ur
						.setProposalInfo("Returns the primitive value of a String object.");
			} else if (name.equals("anchor")) {
				ur.setProposalInfo("Creates an HTML anchor.");
				ur
						.setParameterNames(new char[][] { "anchorname"
								.toCharArray() });
			} else if (name.equals("big")) {
				ur.setProposalInfo("Returns a string in a big font.");
			} else if (name.equals("blink")) {
				ur.setProposalInfo("Returns a blinking string.");
			} else if (name.equals("bold")) {
				ur.setProposalInfo("Returns a string in bold.");
			} else if (name.equals("charAt")) {
				ur
						.setProposalInfo("Returns the character at a specified position.");
			} else if (name.equals("charCodeAt")) {
				ur
						.setProposalInfo("Returns the Unicode of the character at a specified position.");
				ur.setParameterNames(new char[][] { "index".toCharArray() });
			} else if (name.equals("concat")) {

				ur.setProposalInfo("Joins two or more strings.");
				ur.setParameterNames(new char[][] { "stringN".toCharArray(),
						"[StringX]".toCharArray() });
			} else if (name.equals("fixed")) {
				ur.setProposalInfo("Returns a string as teletype text.");
			} else if (name.equals("fontcolor")) {
				ur.setProposalInfo("Returns a string in a specified color.");
				ur.setParameterNames(new char[][] { "color".toCharArray() });

			} else if (name.equals("fontsize")) {
				ur.setProposalInfo("Returns a string in a specified size.");
				ur.setParameterNames(new char[][] { "size".toCharArray() });
			} else if (name.equals("fromCharCode")) {
				ur
						.setProposalInfo("Takes the specified Unicode values and returns a string.");
				ur.setParameterNames(new char[][] { "numN".toCharArray(),
						"[numX]".toCharArray() });
			} else if (name.equals("indexOf")) {
				ur
						.setProposalInfo("Returns the position of the first occurrence of a specified string value in a string.");
				ur.setParameterNames(new char[][] {
						"searchValue".toCharArray(),
						"[fromIndex]".toCharArray() });
			} else if (name.equals("italics")) {
				ur.setProposalInfo("Returns a string in italic.");
			} else if (name.equals("lastIndexOf")) {
				ur
						.setProposalInfo("Returns the position of the last occurrence of a specified string value, searching backwards from the specified position in a string.");
				ur.setParameterNames(new char[][] {
						"searchValue".toCharArray(),
						"[fromIndex]".toCharArray() });
			} else if (name.equals("link")) {
				ur.setProposalInfo("Returns a string as a hyperlink.");
				ur.setParameterNames(new char[][] { "url".toCharArray() });
			} else if (name.equals("match")) {
				ur
						.setProposalInfo("Searches for a specified value in a string.");
				ur
						.setParameterNames(new char[][] { "searchvalue"
								.toCharArray() });
			} else if (name.equals("replace")) {
				ur
						.setProposalInfo("Replaces some characters with some other characters in a string.");
				ur.setParameterNames(new char[][] { "findString".toCharArray(),
						"newString".toCharArray() });
			} else if (name.equals("search")) {
				ur.setProposalInfo("Searches a string for a specified value.");
				ur.setParameterNames(new char[][] { "searchstring"
						.toCharArray() });
			} else if (name.equals("slice")) {
				ur
						.setProposalInfo("Extracts a part of a string and returns the extracted part in a new string.");
				ur.setParameterNames(new char[][] { "start".toCharArray(),
						"[end]".toCharArray() });

			} else if (name.equals("small")) {
				ur.setProposalInfo("Returns a string in a small font.");
			} else if (name.equals("split")) {
				ur.setProposalInfo("Splits a string into an array of strings.");
				ur.setParameterNames(new char[][] { "separator".toCharArray(),
						"[howmany]".toCharArray() });
			} else if (name.equals("strike")) {
				ur.setProposalInfo("Returns a string with a strikethrough.");
			} else if (name.equals("sub")) {
				ur.setProposalInfo("Returns a string as subscript.");
			} else if (name.equals("substr")) {
				ur
						.setProposalInfo("Extracts a specified number of characters in a string, from a start index");
				ur.setParameterNames(new char[][] { "start".toCharArray(),
						"[length]".toCharArray() });
			} else if (name.equals("substring")) {
				ur
						.setProposalInfo("Extracts the characters in a string between two specified indices");
				ur.setParameterNames(new char[][] { "start".toCharArray(),
						"[stop]".toCharArray() });
			} else if (name.equals("sup")) {
				ur.setProposalInfo("Returns a string as superscript.");
			} else if (name.equals("toLowerCase")) {
				ur.setProposalInfo("Returns a string in lowercase letters.");
			} else if (name.equals("toUpperCase")) {
				ur.setProposalInfo("Returns a string in uppercase letters.");
			}
		}
		super.setChild(key, ref);
	}

}
