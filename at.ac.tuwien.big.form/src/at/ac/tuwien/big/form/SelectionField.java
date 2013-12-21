/**
 */
package at.ac.tuwien.big.form;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.form.SelectionField#getItems <em>Items</em>}</li>
 *   <li>{@link at.ac.tuwien.big.form.SelectionField#getSelectionFieldType <em>Selection Field Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.form.FormPackage#getSelectionField()
 * @model
 * @generated
 */
public interface SelectionField extends InputField {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.form.SelectionItem}.
	 * It is bidirectional and its opposite is '{@link at.ac.tuwien.big.form.SelectionItem#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see at.ac.tuwien.big.form.FormPackage#getSelectionField_Items()
	 * @see at.ac.tuwien.big.form.SelectionItem#getField
	 * @model opposite="field" containment="true" required="true"
	 * @generated
	 */
	EList<SelectionItem> getItems();

	/**
	 * Returns the value of the '<em><b>Selection Field Type</b></em>' attribute.
	 * The literals are from the enumeration {@link at.ac.tuwien.big.form.SelectionFieldType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection Field Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection Field Type</em>' attribute.
	 * @see at.ac.tuwien.big.form.SelectionFieldType
	 * @see #setSelectionFieldType(SelectionFieldType)
	 * @see at.ac.tuwien.big.form.FormPackage#getSelectionField_SelectionFieldType()
	 * @model
	 * @generated
	 */
	SelectionFieldType getSelectionFieldType();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.form.SelectionField#getSelectionFieldType <em>Selection Field Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection Field Type</em>' attribute.
	 * @see at.ac.tuwien.big.form.SelectionFieldType
	 * @see #getSelectionFieldType()
	 * @generated
	 */
	void setSelectionFieldType(SelectionFieldType value);

} // SelectionField
