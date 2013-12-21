/**
 */
package at.ac.tuwien.big.form;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.ac.tuwien.big.form.FormFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore#/'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface FormPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "form";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.big.tuwien.ac.at/form/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "form";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FormPackage eINSTANCE = at.ac.tuwien.big.form.impl.FormPackageImpl.init();

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.form.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.form.impl.FormImpl
	 * @see at.ac.tuwien.big.form.impl.FormPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 0;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__PAGES = 0;

	/**
	 * The feature id for the '<em><b>Welcome Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__WELCOME_PAGE = 1;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.form.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.form.impl.PageImpl
	 * @see at.ac.tuwien.big.form.impl.FormPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 1;

	/**
	 * The feature id for the '<em><b>All Previous Pages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__ALL_PREVIOUS_PAGES = 0;

	/**
	 * The feature id for the '<em><b>All Next Pages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__ALL_NEXT_PAGES = 1;

	/**
	 * The feature id for the '<em><b>Next Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NEXT_PAGE = 2;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__ELEMENTS = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TITLE = 4;

	/**
	 * The feature id for the '<em><b>Previous Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PREVIOUS_PAGE = 5;

	/**
	 * The feature id for the '<em><b>Visibility Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__VISIBILITY_CONDITIONS = 6;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.form.impl.PageElementImpl <em>Page Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.form.impl.PageElementImpl
	 * @see at.ac.tuwien.big.form.impl.FormPackageImpl#getPageElement()
	 * @generated
	 */
	int PAGE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_ELEMENT__ELEMENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_ELEMENT__PAGE = 1;

	/**
	 * The number of structural features of the '<em>Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.form.impl.InputFieldImpl <em>Input Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.form.impl.InputFieldImpl
	 * @see at.ac.tuwien.big.form.impl.FormPackageImpl#getInputField()
	 * @generated
	 */
	int INPUT_FIELD = 3;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FIELD__ELEMENT_ID = PAGE_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FIELD__PAGE = PAGE_ELEMENT__PAGE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FIELD__LABEL = PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FIELD__MANDATORY = PAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Input Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FIELD_FEATURE_COUNT = PAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Input Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FIELD_OPERATION_COUNT = PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.form.impl.TextFieldImpl <em>Text Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.form.impl.TextFieldImpl
	 * @see at.ac.tuwien.big.form.impl.FormPackageImpl#getTextField()
	 * @generated
	 */
	int TEXT_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__ELEMENT_ID = INPUT_FIELD__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__PAGE = INPUT_FIELD__PAGE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__LABEL = INPUT_FIELD__LABEL;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__MANDATORY = INPUT_FIELD__MANDATORY;

	/**
	 * The feature id for the '<em><b>Encrypted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__ENCRYPTED = INPUT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_FEATURE_COUNT = INPUT_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_OPERATION_COUNT = INPUT_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.form.impl.SelectionFieldImpl <em>Selection Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.form.impl.SelectionFieldImpl
	 * @see at.ac.tuwien.big.form.impl.FormPackageImpl#getSelectionField()
	 * @generated
	 */
	int SELECTION_FIELD = 5;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__ELEMENT_ID = INPUT_FIELD__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__PAGE = INPUT_FIELD__PAGE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__LABEL = INPUT_FIELD__LABEL;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__MANDATORY = INPUT_FIELD__MANDATORY;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__ITEMS = INPUT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selection Field Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__SELECTION_FIELD_TYPE = INPUT_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Selection Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD_FEATURE_COUNT = INPUT_FIELD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Selection Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD_OPERATION_COUNT = INPUT_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.form.impl.TextAreaImpl <em>Text Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.form.impl.TextAreaImpl
	 * @see at.ac.tuwien.big.form.impl.FormPackageImpl#getTextArea()
	 * @generated
	 */
	int TEXT_AREA = 6;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__ELEMENT_ID = INPUT_FIELD__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__PAGE = INPUT_FIELD__PAGE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__LABEL = INPUT_FIELD__LABEL;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__MANDATORY = INPUT_FIELD__MANDATORY;

	/**
	 * The number of structural features of the '<em>Text Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_FEATURE_COUNT = INPUT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_OPERATION_COUNT = INPUT_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.form.impl.SelectionItemImpl <em>Selection Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.form.impl.SelectionItemImpl
	 * @see at.ac.tuwien.big.form.impl.FormPackageImpl#getSelectionItem()
	 * @generated
	 */
	int SELECTION_ITEM = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_ITEM__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_ITEM__SELECTED = 1;

	/**
	 * The feature id for the '<em><b>Field</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_ITEM__FIELD = 2;

	/**
	 * The number of structural features of the '<em>Selection Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_ITEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Selection Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.form.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.form.impl.TextImpl
	 * @see at.ac.tuwien.big.form.impl.FormPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 8;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ELEMENT_ID = PAGE_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__PAGE = PAGE_ELEMENT__PAGE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__CONTENT = PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = PAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.form.impl.HeadingImpl <em>Heading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.form.impl.HeadingImpl
	 * @see at.ac.tuwien.big.form.impl.FormPackageImpl#getHeading()
	 * @generated
	 */
	int HEADING = 9;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__ELEMENT_ID = TEXT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__PAGE = TEXT__PAGE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__CONTENT = TEXT__CONTENT;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__LEVEL = TEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Heading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_FEATURE_COUNT = TEXT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Heading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_OPERATION_COUNT = TEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.form.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.form.impl.ParagraphImpl
	 * @see at.ac.tuwien.big.form.impl.FormPackageImpl#getParagraph()
	 * @generated
	 */
	int PARAGRAPH = 10;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__ELEMENT_ID = TEXT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__PAGE = TEXT__PAGE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__CONTENT = TEXT__CONTENT;

	/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = TEXT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_OPERATION_COUNT = TEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.form.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.form.impl.ListImpl
	 * @see at.ac.tuwien.big.form.impl.FormPackageImpl#getList()
	 * @generated
	 */
	int LIST = 11;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ELEMENT_ID = PAGE_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__PAGE = PAGE_ELEMENT__PAGE;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ORDERED = PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ITEMS = PAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = PAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATION_COUNT = PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.form.impl.ListItemImpl <em>List Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.form.impl.ListItemImpl
	 * @see at.ac.tuwien.big.form.impl.FormPackageImpl#getListItem()
	 * @generated
	 */
	int LIST_ITEM = 12;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__LABEL = 0;

	/**
	 * The number of structural features of the '<em>List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.form.impl.VisibilityConditionImpl <em>Visibility Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.form.impl.VisibilityConditionImpl
	 * @see at.ac.tuwien.big.form.impl.FormPackageImpl#getVisibilityCondition()
	 * @generated
	 */
	int VISIBILITY_CONDITION = 13;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_CONDITION__PAGE = 0;

	/**
	 * The feature id for the '<em><b>Concerns Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_CONDITION__CONCERNS_ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Visibility Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_CONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Visibility Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.form.impl.SelectionConditionImpl <em>Selection Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.form.impl.SelectionConditionImpl
	 * @see at.ac.tuwien.big.form.impl.FormPackageImpl#getSelectionCondition()
	 * @generated
	 */
	int SELECTION_CONDITION = 14;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CONDITION__PAGE = VISIBILITY_CONDITION__PAGE;

	/**
	 * The feature id for the '<em><b>Concerns Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CONDITION__CONCERNS_ELEMENTS = VISIBILITY_CONDITION__CONCERNS_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CONDITION__ITEM = VISIBILITY_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Selection Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CONDITION_FEATURE_COUNT = VISIBILITY_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Selection Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CONDITION_OPERATION_COUNT = VISIBILITY_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.form.SelectionFieldType <em>Selection Field Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.form.SelectionFieldType
	 * @see at.ac.tuwien.big.form.impl.FormPackageImpl#getSelectionFieldType()
	 * @generated
	 */
	int SELECTION_FIELD_TYPE = 15;


	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.form.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see at.ac.tuwien.big.form.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.form.Form#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see at.ac.tuwien.big.form.Form#getPages()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Pages();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.form.Form#getWelcomePage <em>Welcome Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Welcome Page</em>'.
	 * @see at.ac.tuwien.big.form.Form#getWelcomePage()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_WelcomePage();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.form.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see at.ac.tuwien.big.form.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the reference list '{@link at.ac.tuwien.big.form.Page#getAllPreviousPages <em>All Previous Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Previous Pages</em>'.
	 * @see at.ac.tuwien.big.form.Page#getAllPreviousPages()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_AllPreviousPages();

	/**
	 * Returns the meta object for the reference list '{@link at.ac.tuwien.big.form.Page#getAllNextPages <em>All Next Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Next Pages</em>'.
	 * @see at.ac.tuwien.big.form.Page#getAllNextPages()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_AllNextPages();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.form.Page#getNextPage <em>Next Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Page</em>'.
	 * @see at.ac.tuwien.big.form.Page#getNextPage()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_NextPage();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.form.Page#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see at.ac.tuwien.big.form.Page#getElements()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Elements();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.form.Page#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see at.ac.tuwien.big.form.Page#getTitle()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Title();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.form.Page#getPreviousPage <em>Previous Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous Page</em>'.
	 * @see at.ac.tuwien.big.form.Page#getPreviousPage()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_PreviousPage();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.form.Page#getVisibilityConditions <em>Visibility Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Visibility Conditions</em>'.
	 * @see at.ac.tuwien.big.form.Page#getVisibilityConditions()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_VisibilityConditions();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.form.PageElement <em>Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Element</em>'.
	 * @see at.ac.tuwien.big.form.PageElement
	 * @generated
	 */
	EClass getPageElement();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.form.PageElement#getElementId <em>Element Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Id</em>'.
	 * @see at.ac.tuwien.big.form.PageElement#getElementId()
	 * @see #getPageElement()
	 * @generated
	 */
	EAttribute getPageElement_ElementId();

	/**
	 * Returns the meta object for the container reference '{@link at.ac.tuwien.big.form.PageElement#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Page</em>'.
	 * @see at.ac.tuwien.big.form.PageElement#getPage()
	 * @see #getPageElement()
	 * @generated
	 */
	EReference getPageElement_Page();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.form.InputField <em>Input Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Field</em>'.
	 * @see at.ac.tuwien.big.form.InputField
	 * @generated
	 */
	EClass getInputField();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.form.InputField#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see at.ac.tuwien.big.form.InputField#getLabel()
	 * @see #getInputField()
	 * @generated
	 */
	EAttribute getInputField_Label();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.form.InputField#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see at.ac.tuwien.big.form.InputField#isMandatory()
	 * @see #getInputField()
	 * @generated
	 */
	EAttribute getInputField_Mandatory();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.form.TextField <em>Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Field</em>'.
	 * @see at.ac.tuwien.big.form.TextField
	 * @generated
	 */
	EClass getTextField();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.form.TextField#isEncrypted <em>Encrypted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encrypted</em>'.
	 * @see at.ac.tuwien.big.form.TextField#isEncrypted()
	 * @see #getTextField()
	 * @generated
	 */
	EAttribute getTextField_Encrypted();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.form.SelectionField <em>Selection Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Field</em>'.
	 * @see at.ac.tuwien.big.form.SelectionField
	 * @generated
	 */
	EClass getSelectionField();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.form.SelectionField#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see at.ac.tuwien.big.form.SelectionField#getItems()
	 * @see #getSelectionField()
	 * @generated
	 */
	EReference getSelectionField_Items();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.form.SelectionField#getSelectionFieldType <em>Selection Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selection Field Type</em>'.
	 * @see at.ac.tuwien.big.form.SelectionField#getSelectionFieldType()
	 * @see #getSelectionField()
	 * @generated
	 */
	EAttribute getSelectionField_SelectionFieldType();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.form.TextArea <em>Text Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Area</em>'.
	 * @see at.ac.tuwien.big.form.TextArea
	 * @generated
	 */
	EClass getTextArea();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.form.SelectionItem <em>Selection Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Item</em>'.
	 * @see at.ac.tuwien.big.form.SelectionItem
	 * @generated
	 */
	EClass getSelectionItem();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.form.SelectionItem#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see at.ac.tuwien.big.form.SelectionItem#getLabel()
	 * @see #getSelectionItem()
	 * @generated
	 */
	EAttribute getSelectionItem_Label();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.form.SelectionItem#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see at.ac.tuwien.big.form.SelectionItem#isSelected()
	 * @see #getSelectionItem()
	 * @generated
	 */
	EAttribute getSelectionItem_Selected();

	/**
	 * Returns the meta object for the container reference '{@link at.ac.tuwien.big.form.SelectionItem#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Field</em>'.
	 * @see at.ac.tuwien.big.form.SelectionItem#getField()
	 * @see #getSelectionItem()
	 * @generated
	 */
	EReference getSelectionItem_Field();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.form.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see at.ac.tuwien.big.form.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.form.Text#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see at.ac.tuwien.big.form.Text#getContent()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Content();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.form.Heading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heading</em>'.
	 * @see at.ac.tuwien.big.form.Heading
	 * @generated
	 */
	EClass getHeading();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.form.Heading#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see at.ac.tuwien.big.form.Heading#getLevel()
	 * @see #getHeading()
	 * @generated
	 */
	EAttribute getHeading_Level();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.form.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see at.ac.tuwien.big.form.Paragraph
	 * @generated
	 */
	EClass getParagraph();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.form.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see at.ac.tuwien.big.form.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.form.List#isOrdered <em>Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordered</em>'.
	 * @see at.ac.tuwien.big.form.List#isOrdered()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_Ordered();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.form.List#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see at.ac.tuwien.big.form.List#getItems()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_Items();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.form.ListItem <em>List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Item</em>'.
	 * @see at.ac.tuwien.big.form.ListItem
	 * @generated
	 */
	EClass getListItem();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.form.ListItem#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see at.ac.tuwien.big.form.ListItem#getLabel()
	 * @see #getListItem()
	 * @generated
	 */
	EAttribute getListItem_Label();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.form.VisibilityCondition <em>Visibility Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visibility Condition</em>'.
	 * @see at.ac.tuwien.big.form.VisibilityCondition
	 * @generated
	 */
	EClass getVisibilityCondition();

	/**
	 * Returns the meta object for the container reference '{@link at.ac.tuwien.big.form.VisibilityCondition#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Page</em>'.
	 * @see at.ac.tuwien.big.form.VisibilityCondition#getPage()
	 * @see #getVisibilityCondition()
	 * @generated
	 */
	EReference getVisibilityCondition_Page();

	/**
	 * Returns the meta object for the reference list '{@link at.ac.tuwien.big.form.VisibilityCondition#getConcernsElements <em>Concerns Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concerns Elements</em>'.
	 * @see at.ac.tuwien.big.form.VisibilityCondition#getConcernsElements()
	 * @see #getVisibilityCondition()
	 * @generated
	 */
	EReference getVisibilityCondition_ConcernsElements();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.form.SelectionCondition <em>Selection Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Condition</em>'.
	 * @see at.ac.tuwien.big.form.SelectionCondition
	 * @generated
	 */
	EClass getSelectionCondition();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.form.SelectionCondition#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item</em>'.
	 * @see at.ac.tuwien.big.form.SelectionCondition#getItem()
	 * @see #getSelectionCondition()
	 * @generated
	 */
	EReference getSelectionCondition_Item();

	/**
	 * Returns the meta object for enum '{@link at.ac.tuwien.big.form.SelectionFieldType <em>Selection Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Selection Field Type</em>'.
	 * @see at.ac.tuwien.big.form.SelectionFieldType
	 * @generated
	 */
	EEnum getSelectionFieldType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FormFactory getFormFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.form.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.form.impl.FormImpl
		 * @see at.ac.tuwien.big.form.impl.FormPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__PAGES = eINSTANCE.getForm_Pages();

		/**
		 * The meta object literal for the '<em><b>Welcome Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__WELCOME_PAGE = eINSTANCE.getForm_WelcomePage();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.form.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.form.impl.PageImpl
		 * @see at.ac.tuwien.big.form.impl.FormPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>All Previous Pages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__ALL_PREVIOUS_PAGES = eINSTANCE.getPage_AllPreviousPages();

		/**
		 * The meta object literal for the '<em><b>All Next Pages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__ALL_NEXT_PAGES = eINSTANCE.getPage_AllNextPages();

		/**
		 * The meta object literal for the '<em><b>Next Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__NEXT_PAGE = eINSTANCE.getPage_NextPage();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__ELEMENTS = eINSTANCE.getPage_Elements();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TITLE = eINSTANCE.getPage_Title();

		/**
		 * The meta object literal for the '<em><b>Previous Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__PREVIOUS_PAGE = eINSTANCE.getPage_PreviousPage();

		/**
		 * The meta object literal for the '<em><b>Visibility Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__VISIBILITY_CONDITIONS = eINSTANCE.getPage_VisibilityConditions();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.form.impl.PageElementImpl <em>Page Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.form.impl.PageElementImpl
		 * @see at.ac.tuwien.big.form.impl.FormPackageImpl#getPageElement()
		 * @generated
		 */
		EClass PAGE_ELEMENT = eINSTANCE.getPageElement();

		/**
		 * The meta object literal for the '<em><b>Element Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE_ELEMENT__ELEMENT_ID = eINSTANCE.getPageElement_ElementId();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_ELEMENT__PAGE = eINSTANCE.getPageElement_Page();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.form.impl.InputFieldImpl <em>Input Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.form.impl.InputFieldImpl
		 * @see at.ac.tuwien.big.form.impl.FormPackageImpl#getInputField()
		 * @generated
		 */
		EClass INPUT_FIELD = eINSTANCE.getInputField();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_FIELD__LABEL = eINSTANCE.getInputField_Label();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_FIELD__MANDATORY = eINSTANCE.getInputField_Mandatory();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.form.impl.TextFieldImpl <em>Text Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.form.impl.TextFieldImpl
		 * @see at.ac.tuwien.big.form.impl.FormPackageImpl#getTextField()
		 * @generated
		 */
		EClass TEXT_FIELD = eINSTANCE.getTextField();

		/**
		 * The meta object literal for the '<em><b>Encrypted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_FIELD__ENCRYPTED = eINSTANCE.getTextField_Encrypted();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.form.impl.SelectionFieldImpl <em>Selection Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.form.impl.SelectionFieldImpl
		 * @see at.ac.tuwien.big.form.impl.FormPackageImpl#getSelectionField()
		 * @generated
		 */
		EClass SELECTION_FIELD = eINSTANCE.getSelectionField();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION_FIELD__ITEMS = eINSTANCE.getSelectionField_Items();

		/**
		 * The meta object literal for the '<em><b>Selection Field Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION_FIELD__SELECTION_FIELD_TYPE = eINSTANCE.getSelectionField_SelectionFieldType();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.form.impl.TextAreaImpl <em>Text Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.form.impl.TextAreaImpl
		 * @see at.ac.tuwien.big.form.impl.FormPackageImpl#getTextArea()
		 * @generated
		 */
		EClass TEXT_AREA = eINSTANCE.getTextArea();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.form.impl.SelectionItemImpl <em>Selection Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.form.impl.SelectionItemImpl
		 * @see at.ac.tuwien.big.form.impl.FormPackageImpl#getSelectionItem()
		 * @generated
		 */
		EClass SELECTION_ITEM = eINSTANCE.getSelectionItem();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION_ITEM__LABEL = eINSTANCE.getSelectionItem_Label();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION_ITEM__SELECTED = eINSTANCE.getSelectionItem_Selected();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION_ITEM__FIELD = eINSTANCE.getSelectionItem_Field();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.form.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.form.impl.TextImpl
		 * @see at.ac.tuwien.big.form.impl.FormPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__CONTENT = eINSTANCE.getText_Content();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.form.impl.HeadingImpl <em>Heading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.form.impl.HeadingImpl
		 * @see at.ac.tuwien.big.form.impl.FormPackageImpl#getHeading()
		 * @generated
		 */
		EClass HEADING = eINSTANCE.getHeading();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADING__LEVEL = eINSTANCE.getHeading_Level();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.form.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.form.impl.ParagraphImpl
		 * @see at.ac.tuwien.big.form.impl.FormPackageImpl#getParagraph()
		 * @generated
		 */
		EClass PARAGRAPH = eINSTANCE.getParagraph();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.form.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.form.impl.ListImpl
		 * @see at.ac.tuwien.big.form.impl.FormPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em><b>Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__ORDERED = eINSTANCE.getList_Ordered();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__ITEMS = eINSTANCE.getList_Items();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.form.impl.ListItemImpl <em>List Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.form.impl.ListItemImpl
		 * @see at.ac.tuwien.big.form.impl.FormPackageImpl#getListItem()
		 * @generated
		 */
		EClass LIST_ITEM = eINSTANCE.getListItem();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_ITEM__LABEL = eINSTANCE.getListItem_Label();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.form.impl.VisibilityConditionImpl <em>Visibility Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.form.impl.VisibilityConditionImpl
		 * @see at.ac.tuwien.big.form.impl.FormPackageImpl#getVisibilityCondition()
		 * @generated
		 */
		EClass VISIBILITY_CONDITION = eINSTANCE.getVisibilityCondition();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISIBILITY_CONDITION__PAGE = eINSTANCE.getVisibilityCondition_Page();

		/**
		 * The meta object literal for the '<em><b>Concerns Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISIBILITY_CONDITION__CONCERNS_ELEMENTS = eINSTANCE.getVisibilityCondition_ConcernsElements();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.form.impl.SelectionConditionImpl <em>Selection Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.form.impl.SelectionConditionImpl
		 * @see at.ac.tuwien.big.form.impl.FormPackageImpl#getSelectionCondition()
		 * @generated
		 */
		EClass SELECTION_CONDITION = eINSTANCE.getSelectionCondition();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION_CONDITION__ITEM = eINSTANCE.getSelectionCondition_Item();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.form.SelectionFieldType <em>Selection Field Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.form.SelectionFieldType
		 * @see at.ac.tuwien.big.form.impl.FormPackageImpl#getSelectionFieldType()
		 * @generated
		 */
		EEnum SELECTION_FIELD_TYPE = eINSTANCE.getSelectionFieldType();

	}

} //FormPackage
