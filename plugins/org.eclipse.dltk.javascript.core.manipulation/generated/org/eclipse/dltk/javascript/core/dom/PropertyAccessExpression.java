/**
 * <copyright>
 * </copyright>
 *
 * $Id: PropertyAccessExpression.java,v 1.2 2010/12/01 09:31:18 apanchenk Exp $
 */
package org.eclipse.dltk.javascript.core.dom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Access Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.dltk.javascript.core.dom.PropertyAccessExpression#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.core.dom.PropertyAccessExpression#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.dltk.javascript.core.dom.DomPackage#getPropertyAccessExpression()
 * @model
 * @generated
 */
public interface PropertyAccessExpression extends Expression {
	/**
     * Returns the value of the '<em><b>Object</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Object</em>' containment reference.
     * @see #setObject(Expression)
     * @see org.eclipse.dltk.javascript.core.dom.DomPackage#getPropertyAccessExpression_Object()
     * @model containment="true" required="true"
     * @generated
     */
	Expression getObject();

	/**
     * Sets the value of the '{@link org.eclipse.dltk.javascript.core.dom.PropertyAccessExpression#getObject <em>Object</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Object</em>' containment reference.
     * @see #getObject()
     * @generated
     */
	void setObject(Expression value);

	/**
     * Returns the value of the '<em><b>Property</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Property</em>' containment reference.
     * @see #setProperty(IProperty)
     * @see org.eclipse.dltk.javascript.core.dom.DomPackage#getPropertyAccessExpression_Property()
     * @model containment="true" required="true"
     * @generated
     */
	IProperty getProperty();

	/**
     * Sets the value of the '{@link org.eclipse.dltk.javascript.core.dom.PropertyAccessExpression#getProperty <em>Property</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Property</em>' containment reference.
     * @see #getProperty()
     * @generated
     */
	void setProperty(IProperty value);

} // PropertyAccessExpression
