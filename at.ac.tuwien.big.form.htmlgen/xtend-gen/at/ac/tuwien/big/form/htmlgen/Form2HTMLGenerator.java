package at.ac.tuwien.big.form.htmlgen;

import at.ac.tuwien.big.form.Form;
import at.ac.tuwien.big.form.Heading;
import at.ac.tuwien.big.form.List;
import at.ac.tuwien.big.form.ListItem;
import at.ac.tuwien.big.form.Page;
import at.ac.tuwien.big.form.PageElement;
import at.ac.tuwien.big.form.Paragraph;
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
        {
          EList<PageElement> _elements = p.getElements();
          for(final PageElement e : _elements) {
            _builder.append("\t\t\t\t");
            CharSequence _generateElement = this.generateElement(e);
            _builder.append(_generateElement, "				");
            _builder.newLineIfNotEmpty();
          }
        }
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
  
  public CharSequence generateElement(final PageElement element) {
    CharSequence _xifexpression = null;
    if ((element instanceof Heading)) {
      CharSequence _xblockexpression = null;
      {
        Heading heading = ((Heading) element);
        CharSequence _generateHeading = this.generateHeading(heading);
        _xblockexpression = (_generateHeading);
      }
      _xifexpression = _xblockexpression;
    } else {
      CharSequence _xifexpression_1 = null;
      if ((element instanceof Paragraph)) {
        CharSequence _xblockexpression_1 = null;
        {
          Paragraph paragraph = ((Paragraph) element);
          CharSequence _generateParagraph = this.generateParagraph(paragraph);
          _xblockexpression_1 = (_generateParagraph);
        }
        _xifexpression_1 = _xblockexpression_1;
      } else {
        CharSequence _xifexpression_2 = null;
        if ((element instanceof List)) {
          CharSequence _xblockexpression_2 = null;
          {
            List list = ((List) element);
            CharSequence _xifexpression_3 = null;
            boolean _isOrdered = list.isOrdered();
            if (_isOrdered) {
              CharSequence _generateOrderedList = this.generateOrderedList(list);
              _xifexpression_3 = _generateOrderedList;
            } else {
              CharSequence _generateUnOrderedList = this.generateUnOrderedList(list);
              _xifexpression_3 = _generateUnOrderedList;
            }
            _xblockexpression_2 = (_xifexpression_3);
          }
          _xifexpression_2 = _xblockexpression_2;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public CharSequence generateParagraph(final Paragraph paragraph) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p id=\"");
    String _elementId = paragraph.getElementId();
    _builder.append(_elementId, "");
    _builder.append("\">");
    String _content = paragraph.getContent();
    _builder.append(_content, "");
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateHeading(final Heading heading) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<h");
    int _level = heading.getLevel();
    _builder.append(_level, "");
    _builder.append(" id=\"");
    String _elementId = heading.getElementId();
    _builder.append(_elementId, "");
    _builder.append("\">");
    String _content = heading.getContent();
    _builder.append(_content, "");
    _builder.append("</h");
    int _level_1 = heading.getLevel();
    _builder.append(_level_1, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateOrderedList(final List list) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ol id=\"");
    String _elementId = list.getElementId();
    _builder.append(_elementId, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    {
      EList<ListItem> _items = list.getItems();
      for(final ListItem i : _items) {
        _builder.append("<li>");
        String _label = i.getLabel();
        _builder.append(_label, "");
        _builder.append("</li>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</ol>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateUnOrderedList(final List list) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ul id=\"");
    String _elementId = list.getElementId();
    _builder.append(_elementId, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    {
      EList<ListItem> _items = list.getItems();
      for(final ListItem i : _items) {
        _builder.append("<li>");
        String _label = i.getLabel();
        _builder.append(_label, "");
        _builder.append("</li>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</ul>");
    _builder.newLine();
    return _builder;
  }
}
