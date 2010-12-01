/**
 * <copyright>
 * </copyright>
 *
 * $Id: LabeledStatement.java,v 1.2 2010/12/01 09:31:18 apanchenk Exp $
 */
package org.eclipse.dltk.javascript.core.dom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labeled Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.dltk.javascript.core.dom.LabeledStatement#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.core.dom.LabeledStatement#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.dltk.javascript.core.dom.DomPackage#getLabeledStatement()
 * @model
 * @generated
 */
public interface LabeledStatement extends Statement {
	/**
     * Returns the value of the '<em><b>Label</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' containment reference.
     * @see #setLabel(Label)
     * @see org.eclipse.dltk.javascript.core.dom.DomPackage#getLabeledStatement_Label()
     * @model containment="true" required="true"
     * @generated
     */
	Label getLabel();

	/**
     * Sets the value of the '{@link org.eclipse.dltk.javascript.core.dom.LabeledStatement#getLabel <em>Label</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' containment reference.
     * @see #getLabel()
     * @generated
     */
	void setLabel(Label value);

	/**
     * Returns the value of the '<em><b>Statement</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Statement</em>' containment reference.
     * @see #setStatement(Statement)
     * @see org.eclipse.dltk.javascript.core.dom.DomPackage#getLabeledStatement_Statement()
     * @model containment="true" required="true"
     * @generated
     */
	Statement getStatement();

	/**
     * Sets the value of the '{@link org.eclipse.dltk.javascript.core.dom.LabeledStatement#getStatement <em>Statement</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Statement</em>' containment reference.
     * @see #getStatement()
     * @generated
     */
	void setStatement(Statement value);

} // LabeledStatement
