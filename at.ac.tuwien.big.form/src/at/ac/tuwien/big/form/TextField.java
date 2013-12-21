/**
 */
package at.ac.tuwien.big.form;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.form.TextField#isEncrypted <em>Encrypted</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.form.FormPackage#getTextField()
 * @model
 * @generated
 */
public interface TextField extends InputField {
	/**
	 * Returns the value of the '<em><b>Encrypted</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encrypted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encrypted</em>' attribute.
	 * @see #setEncrypted(boolean)
	 * @see at.ac.tuwien.big.form.FormPackage#getTextField_Encrypted()
	 * @model default="false"
	 * @generated
	 */
	boolean isEncrypted();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.form.TextField#isEncrypted <em>Encrypted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encrypted</em>' attribute.
	 * @see #isEncrypted()
	 * @generated
	 */
	void setEncrypted(boolean value);

} // TextField
