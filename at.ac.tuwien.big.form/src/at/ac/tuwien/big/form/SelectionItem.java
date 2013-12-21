/**
 */
package at.ac.tuwien.big.form;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.form.SelectionItem#getLabel <em>Label</em>}</li>
 *   <li>{@link at.ac.tuwien.big.form.SelectionItem#isSelected <em>Selected</em>}</li>
 *   <li>{@link at.ac.tuwien.big.form.SelectionItem#getField <em>Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.form.FormPackage#getSelectionItem()
 * @model
 * @generated
 */
public interface SelectionItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see at.ac.tuwien.big.form.FormPackage#getSelectionItem_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.form.SelectionItem#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see #setSelected(boolean)
	 * @see at.ac.tuwien.big.form.FormPackage#getSelectionItem_Selected()
	 * @model default="false"
	 * @generated
	 */
	boolean isSelected();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.form.SelectionItem#isSelected <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' attribute.
	 * @see #isSelected()
	 * @generated
	 */
	void setSelected(boolean value);

	/**
	 * Returns the value of the '<em><b>Field</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link at.ac.tuwien.big.form.SelectionField#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' container reference.
	 * @see #setField(SelectionField)
	 * @see at.ac.tuwien.big.form.FormPackage#getSelectionItem_Field()
	 * @see at.ac.tuwien.big.form.SelectionField#getItems
	 * @model opposite="items" required="true" transient="false"
	 * @generated
	 */
	SelectionField getField();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.form.SelectionItem#getField <em>Field</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' container reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(SelectionField value);

} // SelectionItem
