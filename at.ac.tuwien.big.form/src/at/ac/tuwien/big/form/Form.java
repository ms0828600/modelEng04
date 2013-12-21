/**
 */
package at.ac.tuwien.big.form;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.form.Form#getPages <em>Pages</em>}</li>
 *   <li>{@link at.ac.tuwien.big.form.Form#getWelcomePage <em>Welcome Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.form.FormPackage#getForm()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='WelcomePageHasNoPreviousPage'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot WelcomePageHasNoPreviousPage='welcomePage.previousPage = null'"
 * @generated
 */
public interface Form extends EObject {
	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.form.Page}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see at.ac.tuwien.big.form.FormPackage#getForm_Pages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Page> getPages();

	/**
	 * Returns the value of the '<em><b>Welcome Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Welcome Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Welcome Page</em>' reference.
	 * @see #setWelcomePage(Page)
	 * @see at.ac.tuwien.big.form.FormPackage#getForm_WelcomePage()
	 * @model required="true"
	 * @generated
	 */
	Page getWelcomePage();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.form.Form#getWelcomePage <em>Welcome Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Welcome Page</em>' reference.
	 * @see #getWelcomePage()
	 * @generated
	 */
	void setWelcomePage(Page value);

} // Form
