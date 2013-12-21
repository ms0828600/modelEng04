/**
 */
package at.ac.tuwien.big.form;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visibility Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.form.VisibilityCondition#getPage <em>Page</em>}</li>
 *   <li>{@link at.ac.tuwien.big.form.VisibilityCondition#getConcernsElements <em>Concerns Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.form.FormPackage#getVisibilityCondition()
 * @model abstract="true"
 * @generated
 */
public interface VisibilityCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Page</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link at.ac.tuwien.big.form.Page#getVisibilityConditions <em>Visibility Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' container reference.
	 * @see #setPage(Page)
	 * @see at.ac.tuwien.big.form.FormPackage#getVisibilityCondition_Page()
	 * @see at.ac.tuwien.big.form.Page#getVisibilityConditions
	 * @model opposite="visibilityConditions" required="true" transient="false"
	 * @generated
	 */
	Page getPage();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.form.VisibilityCondition#getPage <em>Page</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page</em>' container reference.
	 * @see #getPage()
	 * @generated
	 */
	void setPage(Page value);

	/**
	 * Returns the value of the '<em><b>Concerns Elements</b></em>' reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.form.PageElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerns Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerns Elements</em>' reference list.
	 * @see at.ac.tuwien.big.form.FormPackage#getVisibilityCondition_ConcernsElements()
	 * @model
	 * @generated
	 */
	EList<PageElement> getConcernsElements();

} // VisibilityCondition
