package at.ac.tuwien.big.form.htmlgen;

import at.ac.tuwien.big.form.Form;
import at.ac.tuwien.big.form.Page;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

@SuppressWarnings("all")
public class Form2HTMLGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    for (final EObject object : _contents) {
      this.generateFile(object, fsa);
    }
  }
  
  public void generateFile(final EObject object, final IFileSystemAccess fsa) {
    if ((object instanceof Form)) {
      Form form = ((Form) object);
      StringConcatenation _builder = new StringConcatenation();
      Page _welcomePage = form.getWelcomePage();
      String _title = _welcomePage.getTitle();
      _builder.append(_title, "");
      _builder.append(".html");
      CharSequence _generateCode = this.generateCode(form);
      fsa.generateFile(_builder.toString(), _generateCode);
    }
  }
  
  public CharSequence generateCode(final Form form) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html>");
    _builder.newLine();
    _builder.append("<html lang=\"en\">");
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<title>");
    Page _welcomePage = form.getWelcomePage();
    String _title = _welcomePage.getTitle();
    _builder.append(_title, "	");
    _builder.append("</title>");
    _builder.newLineIfNotEmpty();
    _builder.append("   \t");
    _builder.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\"/>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<link href=\"../assets/form.css\" rel=\"stylesheet\" media=\"screen\"/>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"../assets/jquery-1.10.2.min.js\" type=\"text/javascript\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"../assets/form.js\" type=\"text/javascript\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script type=\"text/javascript\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</script>");
    _builder.newLine();
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("<div class=\"container\">");
    _builder.newLine();
    {
      EList<Page> _pages = form.getPages();
      for(final Page p : _pages) {
        _builder.append("<div class=\"page\">");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<div class=\"well\">");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("<form action=\"#\">");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("<fieldset>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("</fieldset>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("</form>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("</div>");
        _builder.newLine();
        _builder.append("</div>");
        _builder.newLine();
      }
    }
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
}
