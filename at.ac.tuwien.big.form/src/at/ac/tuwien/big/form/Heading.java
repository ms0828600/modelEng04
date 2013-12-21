/**
 */
package at.ac.tuwien.big.form;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Heading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.form.Heading#getLevel <em>Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.form.FormPackage#getHeading()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='levelGreaterZero'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot levelGreaterZero='Heading.allInstances() -> select(heading | heading.level < 1) -> isEmpty()'"
 * @generated
 */
public interface Heading extends Text {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see at.ac.tuwien.big.form.FormPackage#getHeading_Level()
	 * @model
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.form.Heading#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

} // Heading
