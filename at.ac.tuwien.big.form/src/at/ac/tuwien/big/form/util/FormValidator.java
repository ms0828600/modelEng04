/**
 */
package at.ac.tuwien.big.form.util;

import java.util.Map;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import at.ac.tuwien.big.form.Form;
import at.ac.tuwien.big.form.FormPackage;
import at.ac.tuwien.big.form.Heading;
import at.ac.tuwien.big.form.InputField;
import at.ac.tuwien.big.form.List;
import at.ac.tuwien.big.form.ListItem;
import at.ac.tuwien.big.form.Page;
import at.ac.tuwien.big.form.PageElement;
import at.ac.tuwien.big.form.Paragraph;
import at.ac.tuwien.big.form.SelectionCondition;
import at.ac.tuwien.big.form.SelectionField;
import at.ac.tuwien.big.form.SelectionFieldType;
import at.ac.tuwien.big.form.SelectionItem;
import at.ac.tuwien.big.form.Text;
import at.ac.tuwien.big.form.TextArea;
import at.ac.tuwien.big.form.TextField;
import at.ac.tuwien.big.form.VisibilityCondition;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see at.ac.tuwien.big.form.FormPackage
 * @generated
 */
public class FormValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final FormValidator INSTANCE = new FormValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "at.ac.tuwien.big.form";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return FormPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case FormPackage.FORM:
				return validateForm((Form)value, diagnostics, context);
			case FormPackage.PAGE:
				return validatePage((Page)value, diagnostics, context);
			case FormPackage.PAGE_ELEMENT:
				return validatePageElement((PageElement)value, diagnostics, context);
			case FormPackage.INPUT_FIELD:
				return validateInputField((InputField)value, diagnostics, context);
			case FormPackage.TEXT_FIELD:
				return validateTextField((TextField)value, diagnostics, context);
			case FormPackage.SELECTION_FIELD:
				return validateSelectionField((SelectionField)value, diagnostics, context);
			case FormPackage.TEXT_AREA:
				return validateTextArea((TextArea)value, diagnostics, context);
			case FormPackage.SELECTION_ITEM:
				return validateSelectionItem((SelectionItem)value, diagnostics, context);
			case FormPackage.TEXT:
				return validateText((Text)value, diagnostics, context);
			case FormPackage.HEADING:
				return validateHeading((Heading)value, diagnostics, context);
			case FormPackage.PARAGRAPH:
				return validateParagraph((Paragraph)value, diagnostics, context);
			case FormPackage.LIST:
				return validateList((List)value, diagnostics, context);
			case FormPackage.LIST_ITEM:
				return validateListItem((ListItem)value, diagnostics, context);
			case FormPackage.VISIBILITY_CONDITION:
				return validateVisibilityCondition((VisibilityCondition)value, diagnostics, context);
			case FormPackage.SELECTION_CONDITION:
				return validateSelectionCondition((SelectionCondition)value, diagnostics, context);
			case FormPackage.SELECTION_FIELD_TYPE:
				return validateSelectionFieldType((SelectionFieldType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForm(Form form, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(form, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(form, diagnostics, context);
		if (result || diagnostics != null) result &= validateForm_WelcomePageHasNoPreviousPage(form, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the WelcomePageHasNoPreviousPage constraint of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FORM__WELCOME_PAGE_HAS_NO_PREVIOUS_PAGE__EEXPRESSION = "welcomePage.previousPage = null";

	/**
	 * Validates the WelcomePageHasNoPreviousPage constraint of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForm_WelcomePageHasNoPreviousPage(Form form, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormPackage.Literals.FORM,
				 form,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "WelcomePageHasNoPreviousPage",
				 FORM__WELCOME_PAGE_HAS_NO_PREVIOUS_PAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(page, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(page, diagnostics, context);
		if (result || diagnostics != null) result &= validatePage_FirstLetterInTitleIsUpperCase(page, diagnostics, context);
		if (result || diagnostics != null) result &= validatePage_NoCyclicPreviousOrNextPages(page, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the FirstLetterInTitleIsUpperCase constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PAGE__FIRST_LETTER_IN_TITLE_IS_UPPER_CASE__EEXPRESSION = "title.at(1) = title.at(1).toUpperCase()";

	/**
	 * Validates the FirstLetterInTitleIsUpperCase constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage_FirstLetterInTitleIsUpperCase(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormPackage.Literals.PAGE,
				 page,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "FirstLetterInTitleIsUpperCase",
				 PAGE__FIRST_LETTER_IN_TITLE_IS_UPPER_CASE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NoCyclicPreviousOrNextPages constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PAGE__NO_CYCLIC_PREVIOUS_OR_NEXT_PAGES__EEXPRESSION = "allPreviousPages\n" +
		"\t\t\t->excludes(self) and allNextPages\n" +
		"\t\t\t->excludes(self)";

	/**
	 * Validates the NoCyclicPreviousOrNextPages constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage_NoCyclicPreviousOrNextPages(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormPackage.Literals.PAGE,
				 page,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NoCyclicPreviousOrNextPages",
				 PAGE__NO_CYCLIC_PREVIOUS_OR_NEXT_PAGES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageElement(PageElement pageElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pageElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validatePageElement_ElementIdIsUnique(pageElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ElementIdIsUnique constraint of '<em>Page Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PAGE_ELEMENT__ELEMENT_ID_IS_UNIQUE__EEXPRESSION = "PageElement.allInstances()\n" +
		"\t\t\t->select(element | element.elementId = self.elementId)\n" +
		"\t\t\t->excluding(self)\n" +
		"\t\t\t->isEmpty()";

	/**
	 * Validates the ElementIdIsUnique constraint of '<em>Page Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageElement_ElementIdIsUnique(PageElement pageElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormPackage.Literals.PAGE_ELEMENT,
				 pageElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ElementIdIsUnique",
				 PAGE_ELEMENT__ELEMENT_ID_IS_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputField(InputField inputField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(inputField, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(inputField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(inputField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(inputField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(inputField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(inputField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(inputField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(inputField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(inputField, diagnostics, context);
		if (result || diagnostics != null) result &= validatePageElement_ElementIdIsUnique(inputField, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextField(TextField textField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(textField, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validatePageElement_ElementIdIsUnique(textField, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionField(SelectionField selectionField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(selectionField, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(selectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(selectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(selectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(selectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(selectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(selectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(selectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(selectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validatePageElement_ElementIdIsUnique(selectionField, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextArea(TextArea textArea, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(textArea, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(textArea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(textArea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(textArea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(textArea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(textArea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(textArea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(textArea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(textArea, diagnostics, context);
		if (result || diagnostics != null) result &= validatePageElement_ElementIdIsUnique(textArea, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionItem(SelectionItem selectionItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(selectionItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateText(Text text, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(text, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(text, diagnostics, context);
		if (result || diagnostics != null) result &= validatePageElement_ElementIdIsUnique(text, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeading(Heading heading, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(heading, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(heading, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(heading, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(heading, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(heading, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(heading, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(heading, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(heading, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(heading, diagnostics, context);
		if (result || diagnostics != null) result &= validatePageElement_ElementIdIsUnique(heading, diagnostics, context);
		if (result || diagnostics != null) result &= validateHeading_levelGreaterZero(heading, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the levelGreaterZero constraint of '<em>Heading</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HEADING__LEVEL_GREATER_ZERO__EEXPRESSION = "Heading.allInstances() -> select(heading | heading.level < 1) -> isEmpty()";

	/**
	 * Validates the levelGreaterZero constraint of '<em>Heading</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeading_levelGreaterZero(Heading heading, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormPackage.Literals.HEADING,
				 heading,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "levelGreaterZero",
				 HEADING__LEVEL_GREATER_ZERO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParagraph(Paragraph paragraph, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(paragraph, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(paragraph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(paragraph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(paragraph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(paragraph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(paragraph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(paragraph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(paragraph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(paragraph, diagnostics, context);
		if (result || diagnostics != null) result &= validatePageElement_ElementIdIsUnique(paragraph, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateList(List list, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(list, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(list, diagnostics, context);
		if (result || diagnostics != null) result &= validatePageElement_ElementIdIsUnique(list, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListItem(ListItem listItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibilityCondition(VisibilityCondition visibilityCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(visibilityCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionCondition(SelectionCondition selectionCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(selectionCondition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(selectionCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(selectionCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(selectionCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(selectionCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(selectionCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(selectionCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(selectionCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(selectionCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validateSelectionCondition_concernsOnlyElementsInNextPages(selectionCondition, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the concernsOnlyElementsInNextPages constraint of '<em>Selection Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SELECTION_CONDITION__CONCERNS_ONLY_ELEMENTS_IN_NEXT_PAGES__EEXPRESSION = "concernsElements\n" +
		"\t\t\t->forAll(e | e.page <> item.field.page and not item.field.page.allPreviousPages\n" +
		"\t\t\t\t->includes(e.page))";

	/**
	 * Validates the concernsOnlyElementsInNextPages constraint of '<em>Selection Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionCondition_concernsOnlyElementsInNextPages(SelectionCondition selectionCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormPackage.Literals.SELECTION_CONDITION,
				 selectionCondition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "concernsOnlyElementsInNextPages",
				 SELECTION_CONDITION__CONCERNS_ONLY_ELEMENTS_IN_NEXT_PAGES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionFieldType(SelectionFieldType selectionFieldType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //FormValidator
