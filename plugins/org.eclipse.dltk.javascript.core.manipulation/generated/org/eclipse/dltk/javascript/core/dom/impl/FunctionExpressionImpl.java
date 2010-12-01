/**
 * <copyright>
 * </copyright>
 *
 * $Id: FunctionExpressionImpl.java,v 1.3 2010/12/01 09:31:17 apanchenk Exp $
 */
package org.eclipse.dltk.javascript.core.dom.impl;

import java.util.Collection;

import org.eclipse.dltk.javascript.core.dom.BlockStatement;
import org.eclipse.dltk.javascript.core.dom.DomPackage;
import org.eclipse.dltk.javascript.core.dom.FunctionExpression;
import org.eclipse.dltk.javascript.core.dom.Identifier;
import org.eclipse.dltk.javascript.core.dom.Parameter;
import org.eclipse.dltk.javascript.core.dom.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.dltk.javascript.core.dom.impl.FunctionExpressionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.core.dom.impl.FunctionExpressionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.core.dom.impl.FunctionExpressionImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.core.dom.impl.FunctionExpressionImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.core.dom.impl.FunctionExpressionImpl#getParametersPosition <em>Parameters Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionExpressionImpl extends ExpressionImpl implements FunctionExpression {
	/**
     * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getIdentifier()
     * @generated
     * @ordered
     */
	protected Identifier identifier;

	/**
     * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getParameters()
     * @generated
     * @ordered
     */
	protected EList<Parameter> parameters;

	/**
     * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getReturnType()
     * @generated
     * @ordered
     */
	protected Type returnType;

	/**
     * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBody()
     * @generated
     * @ordered
     */
	protected BlockStatement body;

	/**
     * The default value of the '{@link #getParametersPosition() <em>Parameters Position</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getParametersPosition()
     * @generated
     * @ordered
     */
	protected static final int PARAMETERS_POSITION_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getParametersPosition() <em>Parameters Position</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getParametersPosition()
     * @generated
     * @ordered
     */
	protected int parametersPosition = PARAMETERS_POSITION_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected FunctionExpressionImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return DomPackage.Literals.FUNCTION_EXPRESSION;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Identifier getIdentifier() {
        return identifier;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
        Identifier oldIdentifier = identifier;
        identifier = newIdentifier;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomPackage.FUNCTION_EXPRESSION__IDENTIFIER, oldIdentifier, newIdentifier);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setIdentifier(Identifier newIdentifier) {
        if (newIdentifier != identifier) {
            NotificationChain msgs = null;
            if (identifier != null)
                msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomPackage.FUNCTION_EXPRESSION__IDENTIFIER, null, msgs);
            if (newIdentifier != null)
                msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomPackage.FUNCTION_EXPRESSION__IDENTIFIER, null, msgs);
            msgs = basicSetIdentifier(newIdentifier, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DomPackage.FUNCTION_EXPRESSION__IDENTIFIER, newIdentifier, newIdentifier));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Parameter> getParameters() {
        if (parameters == null) {
            parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, DomPackage.FUNCTION_EXPRESSION__PARAMETERS);
        }
        return parameters;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Type getReturnType() {
        return returnType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetReturnType(Type newReturnType, NotificationChain msgs) {
        Type oldReturnType = returnType;
        returnType = newReturnType;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomPackage.FUNCTION_EXPRESSION__RETURN_TYPE, oldReturnType, newReturnType);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setReturnType(Type newReturnType) {
        if (newReturnType != returnType) {
            NotificationChain msgs = null;
            if (returnType != null)
                msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomPackage.FUNCTION_EXPRESSION__RETURN_TYPE, null, msgs);
            if (newReturnType != null)
                msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomPackage.FUNCTION_EXPRESSION__RETURN_TYPE, null, msgs);
            msgs = basicSetReturnType(newReturnType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DomPackage.FUNCTION_EXPRESSION__RETURN_TYPE, newReturnType, newReturnType));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BlockStatement getBody() {
        return body;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetBody(BlockStatement newBody, NotificationChain msgs) {
        BlockStatement oldBody = body;
        body = newBody;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomPackage.FUNCTION_EXPRESSION__BODY, oldBody, newBody);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBody(BlockStatement newBody) {
        if (newBody != body) {
            NotificationChain msgs = null;
            if (body != null)
                msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomPackage.FUNCTION_EXPRESSION__BODY, null, msgs);
            if (newBody != null)
                msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomPackage.FUNCTION_EXPRESSION__BODY, null, msgs);
            msgs = basicSetBody(newBody, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DomPackage.FUNCTION_EXPRESSION__BODY, newBody, newBody));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getParametersPosition() {
        return parametersPosition;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setParametersPosition(int newParametersPosition) {
        int oldParametersPosition = parametersPosition;
        parametersPosition = newParametersPosition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DomPackage.FUNCTION_EXPRESSION__PARAMETERS_POSITION, oldParametersPosition, parametersPosition));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DomPackage.FUNCTION_EXPRESSION__IDENTIFIER:
                return basicSetIdentifier(null, msgs);
            case DomPackage.FUNCTION_EXPRESSION__PARAMETERS:
                return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
            case DomPackage.FUNCTION_EXPRESSION__RETURN_TYPE:
                return basicSetReturnType(null, msgs);
            case DomPackage.FUNCTION_EXPRESSION__BODY:
                return basicSetBody(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DomPackage.FUNCTION_EXPRESSION__IDENTIFIER:
                return getIdentifier();
            case DomPackage.FUNCTION_EXPRESSION__PARAMETERS:
                return getParameters();
            case DomPackage.FUNCTION_EXPRESSION__RETURN_TYPE:
                return getReturnType();
            case DomPackage.FUNCTION_EXPRESSION__BODY:
                return getBody();
            case DomPackage.FUNCTION_EXPRESSION__PARAMETERS_POSITION:
                return getParametersPosition();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case DomPackage.FUNCTION_EXPRESSION__IDENTIFIER:
                setIdentifier((Identifier)newValue);
                return;
            case DomPackage.FUNCTION_EXPRESSION__PARAMETERS:
                getParameters().clear();
                getParameters().addAll((Collection<? extends Parameter>)newValue);
                return;
            case DomPackage.FUNCTION_EXPRESSION__RETURN_TYPE:
                setReturnType((Type)newValue);
                return;
            case DomPackage.FUNCTION_EXPRESSION__BODY:
                setBody((BlockStatement)newValue);
                return;
            case DomPackage.FUNCTION_EXPRESSION__PARAMETERS_POSITION:
                setParametersPosition((Integer)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eUnset(int featureID) {
        switch (featureID) {
            case DomPackage.FUNCTION_EXPRESSION__IDENTIFIER:
                setIdentifier((Identifier)null);
                return;
            case DomPackage.FUNCTION_EXPRESSION__PARAMETERS:
                getParameters().clear();
                return;
            case DomPackage.FUNCTION_EXPRESSION__RETURN_TYPE:
                setReturnType((Type)null);
                return;
            case DomPackage.FUNCTION_EXPRESSION__BODY:
                setBody((BlockStatement)null);
                return;
            case DomPackage.FUNCTION_EXPRESSION__PARAMETERS_POSITION:
                setParametersPosition(PARAMETERS_POSITION_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean eIsSet(int featureID) {
        switch (featureID) {
            case DomPackage.FUNCTION_EXPRESSION__IDENTIFIER:
                return identifier != null;
            case DomPackage.FUNCTION_EXPRESSION__PARAMETERS:
                return parameters != null && !parameters.isEmpty();
            case DomPackage.FUNCTION_EXPRESSION__RETURN_TYPE:
                return returnType != null;
            case DomPackage.FUNCTION_EXPRESSION__BODY:
                return body != null;
            case DomPackage.FUNCTION_EXPRESSION__PARAMETERS_POSITION:
                return parametersPosition != PARAMETERS_POSITION_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (parametersPosition: ");
        result.append(parametersPosition);
        result.append(')');
        return result.toString();
    }

} //FunctionExpressionImpl
