/**
 */
package at.ac.tuwien.big.form.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import at.ac.tuwien.big.form.FormPackage;
import at.ac.tuwien.big.form.SelectionField;
import at.ac.tuwien.big.form.SelectionFieldType;
import at.ac.tuwien.big.form.SelectionItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.form.impl.SelectionFieldImpl#getItems <em>Items</em>}</li>
 *   <li>{@link at.ac.tuwien.big.form.impl.SelectionFieldImpl#getSelectionFieldType <em>Selection Field Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectionFieldImpl extends InputFieldImpl implements SelectionField {
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectionItem> items;

	/**
	 * The default value of the '{@link #getSelectionFieldType() <em>Selection Field Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionFieldType()
	 * @generated
	 * @ordered
	 */
	protected static final SelectionFieldType SELECTION_FIELD_TYPE_EDEFAULT = SelectionFieldType.RADIO;

	/**
	 * The cached value of the '{@link #getSelectionFieldType() <em>Selection Field Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionFieldType()
	 * @generated
	 * @ordered
	 */
	protected SelectionFieldType selectionFieldType = SELECTION_FIELD_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.Literals.SELECTION_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectionItem> getItems() {
		if (items == null) {
			items = new EObjectContainmentWithInverseEList<SelectionItem>(SelectionItem.class, this, FormPackage.SELECTION_FIELD__ITEMS, FormPackage.SELECTION_ITEM__FIELD);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionFieldType getSelectionFieldType() {
		return selectionFieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionFieldType(SelectionFieldType newSelectionFieldType) {
		SelectionFieldType oldSelectionFieldType = selectionFieldType;
		selectionFieldType = newSelectionFieldType == null ? SELECTION_FIELD_TYPE_EDEFAULT : newSelectionFieldType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.SELECTION_FIELD__SELECTION_FIELD_TYPE, oldSelectionFieldType, selectionFieldType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.SELECTION_FIELD__ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getItems()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.SELECTION_FIELD__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
			case FormPackage.SELECTION_FIELD__ITEMS:
				return getItems();
			case FormPackage.SELECTION_FIELD__SELECTION_FIELD_TYPE:
				return getSelectionFieldType();
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
			case FormPackage.SELECTION_FIELD__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends SelectionItem>)newValue);
				return;
			case FormPackage.SELECTION_FIELD__SELECTION_FIELD_TYPE:
				setSelectionFieldType((SelectionFieldType)newValue);
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
			case FormPackage.SELECTION_FIELD__ITEMS:
				getItems().clear();
				return;
			case FormPackage.SELECTION_FIELD__SELECTION_FIELD_TYPE:
				setSelectionFieldType(SELECTION_FIELD_TYPE_EDEFAULT);
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
			case FormPackage.SELECTION_FIELD__ITEMS:
				return items != null && !items.isEmpty();
			case FormPackage.SELECTION_FIELD__SELECTION_FIELD_TYPE:
				return selectionFieldType != SELECTION_FIELD_TYPE_EDEFAULT;
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
		result.append(" (selectionFieldType: ");
		result.append(selectionFieldType);
		result.append(')');
		return result.toString();
	}

} //SelectionFieldImpl
