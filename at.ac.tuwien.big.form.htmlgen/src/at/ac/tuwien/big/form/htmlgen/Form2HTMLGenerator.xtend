package at.ac.tuwien.big.form.htmlgen

import at.ac.tuwien.big.form.Form
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.serializer.sequencer.EmitterNodeFinder

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
    
    </script>
</head>
<body>
<div class="container">
«FOR p : form.pages»
	<div class="page">
		<div class="well">
			<form action="#">
				<fieldset>
				
				</fieldset>
			</form>
		</div>
	</div>
«ENDFOR»
</div>
</body>
</html>
	'''
}
