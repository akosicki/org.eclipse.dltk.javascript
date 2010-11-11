/**
 * <copyright>
 * </copyright>
 *
 * $Id: ParenthesizedExpression.java,v 1.1 2010/11/08 00:20:21 apanchenk Exp $
 */
package org.eclipse.dltk.javascript.core.dom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parenthesized Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.dltk.javascript.core.dom.ParenthesizedExpression#getEnclosed <em>Enclosed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.dltk.javascript.core.dom.DomPackage#getParenthesizedExpression()
 * @model
 * @generated
 */
public interface ParenthesizedExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Enclosed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enclosed</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enclosed</em>' containment reference.
	 * @see #setEnclosed(Expression)
	 * @see org.eclipse.dltk.javascript.core.dom.DomPackage#getParenthesizedExpression_Enclosed()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getEnclosed();

	/**
	 * Sets the value of the '{@link org.eclipse.dltk.javascript.core.dom.ParenthesizedExpression#getEnclosed <em>Enclosed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enclosed</em>' containment reference.
	 * @see #getEnclosed()
	 * @generated
	 */
	void setEnclosed(Expression value);

} // ParenthesizedExpression