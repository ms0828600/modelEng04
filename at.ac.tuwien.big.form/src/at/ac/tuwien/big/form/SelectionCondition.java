/**
 */
package at.ac.tuwien.big.form;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.form.SelectionCondition#getItem <em>Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.form.FormPackage#getSelectionCondition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='concernsOnlyElementsInNextPages'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot concernsOnlyElementsInNextPages='concernsElements\n\t\t\t->forAll(e | e.page <> item.field.page and not item.field.page.allPreviousPages\n\t\t\t\t->includes(e.page))'"
 * @generated
 */
public interface SelectionCondition extends VisibilityCondition {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' reference.
	 * @see #setItem(SelectionItem)
	 * @see at.ac.tuwien.big.form.FormPackage#getSelectionCondition_Item()
	 * @model required="true"
	 * @generated
	 */
	SelectionItem getItem();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.form.SelectionCondition#getItem <em>Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(SelectionItem value);

} // SelectionCondition
