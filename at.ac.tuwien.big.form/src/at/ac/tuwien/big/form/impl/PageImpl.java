/**
 */
package at.ac.tuwien.big.form.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import at.ac.tuwien.big.form.FormPackage;
import at.ac.tuwien.big.form.Page;
import at.ac.tuwien.big.form.PageElement;
import at.ac.tuwien.big.form.VisibilityCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.form.impl.PageImpl#getAllPreviousPages <em>All Previous Pages</em>}</li>
 *   <li>{@link at.ac.tuwien.big.form.impl.PageImpl#getAllNextPages <em>All Next Pages</em>}</li>
 *   <li>{@link at.ac.tuwien.big.form.impl.PageImpl#getNextPage <em>Next Page</em>}</li>
 *   <li>{@link at.ac.tuwien.big.form.impl.PageImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link at.ac.tuwien.big.form.impl.PageImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link at.ac.tuwien.big.form.impl.PageImpl#getPreviousPage <em>Previous Page</em>}</li>
 *   <li>{@link at.ac.tuwien.big.form.impl.PageImpl#getVisibilityConditions <em>Visibility Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageImpl extends MinimalEObjectImpl.Container implements Page {
	/**
	 * The cached setting delegate for the '{@link #getAllPreviousPages() <em>All Previous Pages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllPreviousPages()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ALL_PREVIOUS_PAGES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)FormPackage.Literals.PAGE__ALL_PREVIOUS_PAGES).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getAllNextPages() <em>All Next Pages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllNextPages()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ALL_NEXT_PAGES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)FormPackage.Literals.PAGE__ALL_NEXT_PAGES).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getNextPage() <em>Next Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextPage()
	 * @generated
	 * @ordered
	 */
	protected Page nextPage;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<PageElement> elements;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPreviousPage() <em>Previous Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousPage()
	 * @generated
	 * @ordered
	 */
	protected Page previousPage;

	/**
	 * The cached value of the '{@link #getVisibilityConditions() <em>Visibility Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibilityConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<VisibilityCondition> visibilityConditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Page> getAllPreviousPages() {
		return (EList<Page>)ALL_PREVIOUS_PAGES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Page> getAllNextPages() {
		return (EList<Page>)ALL_NEXT_PAGES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getNextPage() {
		if (nextPage != null && nextPage.eIsProxy()) {
			InternalEObject oldNextPage = (InternalEObject)nextPage;
			nextPage = (Page)eResolveProxy(oldNextPage);
			if (nextPage != oldNextPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormPackage.PAGE__NEXT_PAGE, oldNextPage, nextPage));
			}
		}
		return nextPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetNextPage() {
		return nextPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextPage(Page newNextPage, NotificationChain msgs) {
		Page oldNextPage = nextPage;
		nextPage = newNextPage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.PAGE__NEXT_PAGE, oldNextPage, newNextPage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextPage(Page newNextPage) {
		if (newNextPage != nextPage) {
			NotificationChain msgs = null;
			if (nextPage != null)
				msgs = ((InternalEObject)nextPage).eInverseRemove(this, FormPackage.PAGE__PREVIOUS_PAGE, Page.class, msgs);
			if (newNextPage != null)
				msgs = ((InternalEObject)newNextPage).eInverseAdd(this, FormPackage.PAGE__PREVIOUS_PAGE, Page.class, msgs);
			msgs = basicSetNextPage(newNextPage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.PAGE__NEXT_PAGE, newNextPage, newNextPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentWithInverseEList<PageElement>(PageElement.class, this, FormPackage.PAGE__ELEMENTS, FormPackage.PAGE_ELEMENT__PAGE);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.PAGE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getPreviousPage() {
		if (previousPage != null && previousPage.eIsProxy()) {
			InternalEObject oldPreviousPage = (InternalEObject)previousPage;
			previousPage = (Page)eResolveProxy(oldPreviousPage);
			if (previousPage != oldPreviousPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormPackage.PAGE__PREVIOUS_PAGE, oldPreviousPage, previousPage));
			}
		}
		return previousPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetPreviousPage() {
		return previousPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreviousPage(Page newPreviousPage, NotificationChain msgs) {
		Page oldPreviousPage = previousPage;
		previousPage = newPreviousPage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.PAGE__PREVIOUS_PAGE, oldPreviousPage, newPreviousPage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousPage(Page newPreviousPage) {
		if (newPreviousPage != previousPage) {
			NotificationChain msgs = null;
			if (previousPage != null)
				msgs = ((InternalEObject)previousPage).eInverseRemove(this, FormPackage.PAGE__NEXT_PAGE, Page.class, msgs);
			if (newPreviousPage != null)
				msgs = ((InternalEObject)newPreviousPage).eInverseAdd(this, FormPackage.PAGE__NEXT_PAGE, Page.class, msgs);
			msgs = basicSetPreviousPage(newPreviousPage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.PAGE__PREVIOUS_PAGE, newPreviousPage, newPreviousPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VisibilityCondition> getVisibilityConditions() {
		if (visibilityConditions == null) {
			visibilityConditions = new EObjectContainmentWithInverseEList<VisibilityCondition>(VisibilityCondition.class, this, FormPackage.PAGE__VISIBILITY_CONDITIONS, FormPackage.VISIBILITY_CONDITION__PAGE);
		}
		return visibilityConditions;
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
			case FormPackage.PAGE__NEXT_PAGE:
				if (nextPage != null)
					msgs = ((InternalEObject)nextPage).eInverseRemove(this, FormPackage.PAGE__PREVIOUS_PAGE, Page.class, msgs);
				return basicSetNextPage((Page)otherEnd, msgs);
			case FormPackage.PAGE__ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElements()).basicAdd(otherEnd, msgs);
			case FormPackage.PAGE__PREVIOUS_PAGE:
				if (previousPage != null)
					msgs = ((InternalEObject)previousPage).eInverseRemove(this, FormPackage.PAGE__NEXT_PAGE, Page.class, msgs);
				return basicSetPreviousPage((Page)otherEnd, msgs);
			case FormPackage.PAGE__VISIBILITY_CONDITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVisibilityConditions()).basicAdd(otherEnd, msgs);
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
			case FormPackage.PAGE__NEXT_PAGE:
				return basicSetNextPage(null, msgs);
			case FormPackage.PAGE__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case FormPackage.PAGE__PREVIOUS_PAGE:
				return basicSetPreviousPage(null, msgs);
			case FormPackage.PAGE__VISIBILITY_CONDITIONS:
				return ((InternalEList<?>)getVisibilityConditions()).basicRemove(otherEnd, msgs);
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
			case FormPackage.PAGE__ALL_PREVIOUS_PAGES:
				return getAllPreviousPages();
			case FormPackage.PAGE__ALL_NEXT_PAGES:
				return getAllNextPages();
			case FormPackage.PAGE__NEXT_PAGE:
				if (resolve) return getNextPage();
				return basicGetNextPage();
			case FormPackage.PAGE__ELEMENTS:
				return getElements();
			case FormPackage.PAGE__TITLE:
				return getTitle();
			case FormPackage.PAGE__PREVIOUS_PAGE:
				if (resolve) return getPreviousPage();
				return basicGetPreviousPage();
			case FormPackage.PAGE__VISIBILITY_CONDITIONS:
				return getVisibilityConditions();
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
			case FormPackage.PAGE__NEXT_PAGE:
				setNextPage((Page)newValue);
				return;
			case FormPackage.PAGE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends PageElement>)newValue);
				return;
			case FormPackage.PAGE__TITLE:
				setTitle((String)newValue);
				return;
			case FormPackage.PAGE__PREVIOUS_PAGE:
				setPreviousPage((Page)newValue);
				return;
			case FormPackage.PAGE__VISIBILITY_CONDITIONS:
				getVisibilityConditions().clear();
				getVisibilityConditions().addAll((Collection<? extends VisibilityCondition>)newValue);
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
			case FormPackage.PAGE__NEXT_PAGE:
				setNextPage((Page)null);
				return;
			case FormPackage.PAGE__ELEMENTS:
				getElements().clear();
				return;
			case FormPackage.PAGE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case FormPackage.PAGE__PREVIOUS_PAGE:
				setPreviousPage((Page)null);
				return;
			case FormPackage.PAGE__VISIBILITY_CONDITIONS:
				getVisibilityConditions().clear();
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
			case FormPackage.PAGE__ALL_PREVIOUS_PAGES:
				return ALL_PREVIOUS_PAGES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case FormPackage.PAGE__ALL_NEXT_PAGES:
				return ALL_NEXT_PAGES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case FormPackage.PAGE__NEXT_PAGE:
				return nextPage != null;
			case FormPackage.PAGE__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case FormPackage.PAGE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case FormPackage.PAGE__PREVIOUS_PAGE:
				return previousPage != null;
			case FormPackage.PAGE__VISIBILITY_CONDITIONS:
				return visibilityConditions != null && !visibilityConditions.isEmpty();
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
		result.append(" (title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //PageImpl
