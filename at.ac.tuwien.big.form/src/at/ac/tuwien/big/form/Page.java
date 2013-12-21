/**
 */
package at.ac.tuwien.big.form;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.form.Page#getAllPreviousPages <em>All Previous Pages</em>}</li>
 *   <li>{@link at.ac.tuwien.big.form.Page#getAllNextPages <em>All Next Pages</em>}</li>
 *   <li>{@link at.ac.tuwien.big.form.Page#getNextPage <em>Next Page</em>}</li>
 *   <li>{@link at.ac.tuwien.big.form.Page#getElements <em>Elements</em>}</li>
 *   <li>{@link at.ac.tuwien.big.form.Page#getTitle <em>Title</em>}</li>
 *   <li>{@link at.ac.tuwien.big.form.Page#getPreviousPage <em>Previous Page</em>}</li>
 *   <li>{@link at.ac.tuwien.big.form.Page#getVisibilityConditions <em>Visibility Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.form.FormPackage#getPage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='FirstLetterInTitleIsUpperCase NoCyclicPreviousOrNextPages'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot FirstLetterInTitleIsUpperCase='title.at(1) = title.at(1).toUpperCase()' NoCyclicPreviousOrNextPages='allPreviousPages\n\t\t\t->excludes(self) and allNextPages\n\t\t\t->excludes(self)'"
 * @generated
 */
public interface Page extends EObject {
	/**
	 * Returns the value of the '<em><b>All Previous Pages</b></em>' reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.form.Page}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Previous Pages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Previous Pages</em>' reference list.
	 * @see at.ac.tuwien.big.form.FormPackage#getPage_AllPreviousPages()
	 * @model changeable="false" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='previousPage\n\t\t\t\t->asSet()\n\t\t\t\t->union(previousPage\n\t\t\t\t\t->asSet()\n\t\t\t\t\t->closure(previousPage))'"
	 * @generated
	 */
	EList<Page> getAllPreviousPages();

	/**
	 * Returns the value of the '<em><b>All Next Pages</b></em>' reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.form.Page}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Next Pages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Next Pages</em>' reference list.
	 * @see at.ac.tuwien.big.form.FormPackage#getPage_AllNextPages()
	 * @model changeable="false" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='nextPage\n\t\t\t\t->asSet()\n\t\t\t\t->union(nextPage\n\t\t\t\t\t->asSet()\n\t\t\t\t\t->closure(nextPage))'"
	 * @generated
	 */
	EList<Page> getAllNextPages();

	/**
	 * Returns the value of the '<em><b>Next Page</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link at.ac.tuwien.big.form.Page#getPreviousPage <em>Previous Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Page</em>' reference.
	 * @see #setNextPage(Page)
	 * @see at.ac.tuwien.big.form.FormPackage#getPage_NextPage()
	 * @see at.ac.tuwien.big.form.Page#getPreviousPage
	 * @model opposite="previousPage"
	 * @generated
	 */
	Page getNextPage();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.form.Page#getNextPage <em>Next Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Page</em>' reference.
	 * @see #getNextPage()
	 * @generated
	 */
	void setNextPage(Page value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.form.PageElement}.
	 * It is bidirectional and its opposite is '{@link at.ac.tuwien.big.form.PageElement#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see at.ac.tuwien.big.form.FormPackage#getPage_Elements()
	 * @see at.ac.tuwien.big.form.PageElement#getPage
	 * @model opposite="page" containment="true"
	 * @generated
	 */
	EList<PageElement> getElements();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see at.ac.tuwien.big.form.FormPackage#getPage_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.form.Page#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Previous Page</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link at.ac.tuwien.big.form.Page#getNextPage <em>Next Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Page</em>' reference.
	 * @see #setPreviousPage(Page)
	 * @see at.ac.tuwien.big.form.FormPackage#getPage_PreviousPage()
	 * @see at.ac.tuwien.big.form.Page#getNextPage
	 * @model opposite="nextPage"
	 * @generated
	 */
	Page getPreviousPage();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.form.Page#getPreviousPage <em>Previous Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Page</em>' reference.
	 * @see #getPreviousPage()
	 * @generated
	 */
	void setPreviousPage(Page value);

	/**
	 * Returns the value of the '<em><b>Visibility Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.form.VisibilityCondition}.
	 * It is bidirectional and its opposite is '{@link at.ac.tuwien.big.form.VisibilityCondition#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility Conditions</em>' containment reference list.
	 * @see at.ac.tuwien.big.form.FormPackage#getPage_VisibilityConditions()
	 * @see at.ac.tuwien.big.form.VisibilityCondition#getPage
	 * @model opposite="page" containment="true"
	 * @generated
	 */
	EList<VisibilityCondition> getVisibilityConditions();

} // Page
