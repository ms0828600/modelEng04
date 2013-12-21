package at.ac.tuwien.big.form.htmlgen

import at.ac.tuwien.big.form.Form
import at.ac.tuwien.big.form.Heading
import at.ac.tuwien.big.form.InputField
import at.ac.tuwien.big.form.List
import at.ac.tuwien.big.form.PageElement
import at.ac.tuwien.big.form.Paragraph
import at.ac.tuwien.big.form.SelectionCondition
import at.ac.tuwien.big.form.SelectionField
import at.ac.tuwien.big.form.SelectionFieldType
import at.ac.tuwien.big.form.TextArea
import at.ac.tuwien.big.form.TextField
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import at.ac.tuwien.big.form.SelectionItem

class Form2HTMLGenerator implements IGenerator {

	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (EObject object : resource.contents) object.generateFile(fsa)
	}
	
	def void generateFile(EObject object, IFileSystemAccess fsa) {
		if (object instanceof Form) {
			var form = object as Form
			fsa.generateFile('''«form.welcomePage.title».html''', form.generateCode)
		}
	}
	
	def CharSequence generateCode(Form form) '''
<!DOCTYPE html>
<html lang="en">
<head>
	<title>«form.welcomePage.title»</title>
   	<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8"/>
    <link href="../assets/form.css" rel="stylesheet" media="screen"/>
    <script src="../assets/jquery-1.10.2.min.js" type="text/javascript"></script>
    <script src="../assets/form.js" type="text/javascript"></script>
    <script type="text/javascript">
    $(document).ready(
		function(){
			form.init();
			«FOR p : form.pages»
				«FOR e : p.elements»
					«IF e instanceof InputField»
						«IF (e as InputField).mandatory»
							form.registerMandatory('«(e as InputField).elementId»');
						«ELSE»
							form.registerOptional('«(e as InputField).elementId»');
						«ENDIF»
					«ENDIF»
				«ENDFOR»
			«ENDFOR»

			«FOR p : form.pages»
				«FOR e : p.elements»
					form.registerElement('«e.elementId»');
				«ENDFOR»
			«ENDFOR»
			
			«FOR p : form.pages»
				«FOR v : p.visibilityConditions»
					«IF v instanceof SelectionCondition»
						form.registerConditional('«((v as SelectionCondition).item.eContainer as PageElement).elementId»',
						'«(v as SelectionCondition).item.label»', 
						[
							«FOR ce : (v as SelectionCondition).concernsElements»
								'«ce.elementId»',
							«ENDFOR»
						]);
					«ENDIF»
				«ENDFOR»
			«ENDFOR»
			
		}
	);
    </script>
</head>
<body>
<div class="container">
«FOR p : form.pages»
	<div class="page">
		<div class="well">
			<form action="#">
				<fieldset>
					«FOR e : p.elements»
						«e.generateElement»
					«ENDFOR»
				</fieldset>
			</form>
		</div>
	</div>
«ENDFOR»
</div>
</body>
</html>
	'''
	
	def CharSequence generateElement(PageElement element) {
		if (element instanceof Heading) {
			var heading = element as Heading
			heading.generateHeading
		}
		else if (element instanceof Paragraph) {
			var paragraph = element as Paragraph
			paragraph.generateParagraph
		}
		else if (element instanceof List) {
			var list = element as List
			if (list.ordered) {
				list.generateOrderedList
			}
			else {
				list.generateUnOrderedList
			}
		}
		else if (element instanceof TextField) {
			var textfield = element as TextField
			textfield.generateTextField
		}
		else if (element instanceof TextArea) {
			var textarea = element as TextArea
			textarea.generateTextArea
		}
		else if (element instanceof SelectionField) {
			var selectionfield = element as SelectionField
			selectionfield.generateSelectionField
		}
	}
	
	def CharSequence generateParagraph(Paragraph paragraph) '''
		<p id="«paragraph.elementId»">«paragraph.content»</p>
	'''
	
	def CharSequence generateHeading(Heading heading) '''
		<h«heading.level» id="«heading.elementId»">«heading.content»</h«heading.level»>
	'''
	
	def CharSequence generateOrderedList(List list) '''
		<ol id="«list.elementId»">
		«FOR i : list.items»
			<li>«i.label»</li>
		«ENDFOR»
		</ol>
	'''
	
	def CharSequence generateUnOrderedList(List list) '''
		<ul id="«list.elementId»">
		«FOR i : list.items»
			<li>«i.label»</li>
		«ENDFOR»
		</ul>
	'''
	
	def CharSequence generateTextField(TextField field) '''
		<div class="control-group">
			<label for="«field.elementId»">«field.label»</label>
			<div class="controls">
				«IF field.encrypted»
				<input type="password" id="«field.elementId»"/>
				«ELSE»
				<input type="text" id="«field.elementId»"/>
				«ENDIF»
			</div>
		</div>
	'''
	
	def CharSequence generateTextArea(TextArea area) '''
		<div class="control-group">
			<label for="«area.elementId»">«area.label»</label>
			<div class="controls">
				<textarea id="«area.elementId»"></textarea>
			</div>
		</div>
	'''
	
	def CharSequence generateSelectionField(SelectionField field) '''
		<div class="control-group">
			<label class="lone" id="label_for_«field.elementId»">«field.label»</label>
			<div class="controls" id="«field.elementId»">
			« var idx = 0 »
			«FOR i : field.items»
				«IF field.selectionFieldType.equals(SelectionFieldType.RADIO)»
					<label class="radio" for="«field.elementId»_«idx»">
						<input type="radio" value="«i.label»" name="«field.elementId»"
						«IF i.selected»
							checked="checked"
						«ENDIF»
						id="«field.elementId»_«idx»" /> «i.label»
					</label>
				«ELSE»
					<label class="checkbox" for="«field.elementId»_«idx»">
						<input type="checkbox" value="«i.label»" name="«field.elementId»"
						«IF i.selected»
							checked="checked"
						«ENDIF» 
						id="«field.elementId»_«idx»" /> «i.label»
					</label>
				«ENDIF»
				<!-- TODO: dont print out « idx = idx + 1 » -->
			«ENDFOR»
			</div>
		</div>
	'''
}
