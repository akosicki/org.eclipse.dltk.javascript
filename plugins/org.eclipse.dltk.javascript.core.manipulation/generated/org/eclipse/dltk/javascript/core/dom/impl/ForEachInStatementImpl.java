/**
 * <copyright>
 * </copyright>
 *
 * $Id: ForEachInStatementImpl.java,v 1.2 2010/12/01 09:31:18 apanchenk Exp $
 */
package org.eclipse.dltk.javascript.core.dom.impl;

import org.eclipse.dltk.javascript.core.dom.DomPackage;
import org.eclipse.dltk.javascript.core.dom.Expression;
import org.eclipse.dltk.javascript.core.dom.ForEachInStatement;
import org.eclipse.dltk.javascript.core.dom.IForInitializer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Each In Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.dltk.javascript.core.dom.impl.ForEachInStatementImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.core.dom.impl.ForEachInStatementImpl#getCollection <em>Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForEachInStatementImpl extends IterationStatementImpl implements ForEachInStatement {
	/**
     * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getItem()
     * @generated
     * @ordered
     */
	protected IForInitializer item;

	/**
     * The cached value of the '{@link #getCollection() <em>Collection</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCollection()
     * @generated
     * @ordered
     */
	protected Expression collection;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ForEachInStatementImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return DomPackage.Literals.FOR_EACH_IN_STATEMENT;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public IForInitializer getItem() {
        return item;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetItem(IForInitializer newItem, NotificationChain msgs) {
        IForInitializer oldItem = item;
        item = newItem;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomPackage.FOR_EACH_IN_STATEMENT__ITEM, oldItem, newItem);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setItem(IForInitializer newItem) {
        if (newItem != item) {
            NotificationChain msgs = null;
            if (item != null)
                msgs = ((InternalEObject)item).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomPackage.FOR_EACH_IN_STATEMENT__ITEM, null, msgs);
            if (newItem != null)
                msgs = ((InternalEObject)newItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomPackage.FOR_EACH_IN_STATEMENT__ITEM, null, msgs);
            msgs = basicSetItem(newItem, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DomPackage.FOR_EACH_IN_STATEMENT__ITEM, newItem, newItem));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Expression getCollection() {
        return collection;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetCollection(Expression newCollection, NotificationChain msgs) {
        Expression oldCollection = collection;
        collection = newCollection;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomPackage.FOR_EACH_IN_STATEMENT__COLLECTION, oldCollection, newCollection);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCollection(Expression newCollection) {
        if (newCollection != collection) {
            NotificationChain msgs = null;
            if (collection != null)
                msgs = ((InternalEObject)collection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomPackage.FOR_EACH_IN_STATEMENT__COLLECTION, null, msgs);
            if (newCollection != null)
                msgs = ((InternalEObject)newCollection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomPackage.FOR_EACH_IN_STATEMENT__COLLECTION, null, msgs);
            msgs = basicSetCollection(newCollection, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DomPackage.FOR_EACH_IN_STATEMENT__COLLECTION, newCollection, newCollection));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DomPackage.FOR_EACH_IN_STATEMENT__ITEM:
                return basicSetItem(null, msgs);
            case DomPackage.FOR_EACH_IN_STATEMENT__COLLECTION:
                return basicSetCollection(null, msgs);
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
            case DomPackage.FOR_EACH_IN_STATEMENT__ITEM:
                return getItem();
            case DomPackage.FOR_EACH_IN_STATEMENT__COLLECTION:
                return getCollection();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case DomPackage.FOR_EACH_IN_STATEMENT__ITEM:
                setItem((IForInitializer)newValue);
                return;
            case DomPackage.FOR_EACH_IN_STATEMENT__COLLECTION:
                setCollection((Expression)newValue);
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
            case DomPackage.FOR_EACH_IN_STATEMENT__ITEM:
                setItem((IForInitializer)null);
                return;
            case DomPackage.FOR_EACH_IN_STATEMENT__COLLECTION:
                setCollection((Expression)null);
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
            case DomPackage.FOR_EACH_IN_STATEMENT__ITEM:
                return item != null;
            case DomPackage.FOR_EACH_IN_STATEMENT__COLLECTION:
                return collection != null;
        }
        return super.eIsSet(featureID);
    }

} //ForEachInStatementImpl
