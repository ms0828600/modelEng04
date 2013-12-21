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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import at.ac.tuwien.big.form.FormPackage;
import at.ac.tuwien.big.form.Page;
import at.ac.tuwien.big.form.PageElement;
import at.ac.tuwien.big.form.VisibilityCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visibility Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.form.impl.VisibilityConditionImpl#getPage <em>Page</em>}</li>
 *   <li>{@link at.ac.tuwien.big.form.impl.VisibilityConditionImpl#getConcernsElements <em>Concerns Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VisibilityConditionImpl extends MinimalEObjectImpl.Container implements VisibilityCondition {
	/**
	 * The cached value of the '{@link #getConcernsElements() <em>Concerns Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcernsElements()
	 * @generated
	 * @ordered
	 */
	protected EList<PageElement> concernsElements;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisibilityConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.Literals.VISIBILITY_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getPage() {
		if (eContainerFeatureID() != FormPackage.VISIBILITY_CONDITION__PAGE) return null;
		return (Page)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPage(Page newPage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPage, FormPackage.VISIBILITY_CONDITION__PAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPage(Page newPage) {
		if (newPage != eInternalContainer() || (eContainerFeatureID() != FormPackage.VISIBILITY_CONDITION__PAGE && newPage != null)) {
			if (EcoreUtil.isAncestor(this, newPage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPage != null)
				msgs = ((InternalEObject)newPage).eInverseAdd(this, FormPackage.PAGE__VISIBILITY_CONDITIONS, Page.class, msgs);
			msgs = basicSetPage(newPage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.VISIBILITY_CONDITION__PAGE, newPage, newPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageElement> getConcernsElements() {
		if (concernsElements == null) {
			concernsElements = new EObjectResolvingEList<PageElement>(PageElement.class, this, FormPackage.VISIBILITY_CONDITION__CONCERNS_ELEMENTS);
		}
		return concernsElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.VISIBILITY_CONDITION__PAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPage((Page)otherEnd, msgs);
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
			case FormPackage.VISIBILITY_CONDITION__PAGE:
				return basicSetPage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case FormPackage.VISIBILITY_CONDITION__PAGE:
				return eInternalContainer().eInverseRemove(this, FormPackage.PAGE__VISIBILITY_CONDITIONS, Page.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormPackage.VISIBILITY_CONDITION__PAGE:
				return getPage();
			case FormPackage.VISIBILITY_CONDITION__CONCERNS_ELEMENTS:
				return getConcernsElements();
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
			case FormPackage.VISIBILITY_CONDITION__PAGE:
				setPage((Page)newValue);
				return;
			case FormPackage.VISIBILITY_CONDITION__CONCERNS_ELEMENTS:
				getConcernsElements().clear();
				getConcernsElements().addAll((Collection<? extends PageElement>)newValue);
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
			case FormPackage.VISIBILITY_CONDITION__PAGE:
				setPage((Page)null);
				return;
			case FormPackage.VISIBILITY_CONDITION__CONCERNS_ELEMENTS:
				getConcernsElements().clear();
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
			case FormPackage.VISIBILITY_CONDITION__PAGE:
				return getPage() != null;
			case FormPackage.VISIBILITY_CONDITION__CONCERNS_ELEMENTS:
				return concernsElements != null && !concernsElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VisibilityConditionImpl
