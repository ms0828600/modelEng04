package at.ac.tuwien.big.form.htmlgen;

import at.ac.tuwien.big.form.Form;
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
import at.ac.tuwien.big.form.TextArea;
import at.ac.tuwien.big.form.TextField;
import at.ac.tuwien.big.form.VisibilityCondition;
import java.io.File;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

@SuppressWarnings("all")
public class Form2HTMLGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    URI _uRI = resource.getURI();
    String _fileString = _uRI.toFileString();
    File _file = new File(_fileString);
    File file = _file;
    EList<EObject> _contents = resource.getContents();
    for (final EObject object : _contents) {
      String _name = file.getName();
      String _name_1 = file.getName();
      int _lastIndexOf = _name_1.lastIndexOf(".");
      String _substring = _name.substring(0, _lastIndexOf);
      this.generateFile(object, fsa, _substring);
    }
  }
  
  public void generateFile(final EObject object, final IFileSystemAccess fsa, final String filename) {
    if ((object instanceof Form)) {
      Form form = ((Form) object);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(filename, "");
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
    _builder.append("$(document).ready(");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("function(){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("form.init();");
    _builder.newLine();
    {
      EList<Page> _pages = form.getPages();
      for(final Page p : _pages) {
        {
          EList<PageElement> _elements = p.getElements();
          for(final PageElement e : _elements) {
            {
              if ((e instanceof InputField)) {
                {
                  boolean _isMandatory = ((InputField) e).isMandatory();
                  if (_isMandatory) {
                    _builder.append("\t\t\t");
                    _builder.append("form.registerMandatory(\'");
                    String _elementId = ((InputField) e).getElementId();
                    _builder.append(_elementId, "			");
                    _builder.append("\');");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("\t\t\t");
                    _builder.append("form.registerOptional(\'");
                    String _elementId_1 = ((InputField) e).getElementId();
                    _builder.append(_elementId_1, "			");
                    _builder.append("\');");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
      }
    }
    _builder.newLine();
    {
      EList<Page> _pages_1 = form.getPages();
      for(final Page p_1 : _pages_1) {
        {
          EList<PageElement> _elements_1 = p_1.getElements();
          for(final PageElement e_1 : _elements_1) {
            _builder.append("\t\t\t");
            _builder.append("form.registerElement(\'");
            String _elementId_2 = e_1.getElementId();
            _builder.append(_elementId_2, "			");
            _builder.append("\');");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t\t");
    _builder.newLine();
    {
      EList<Page> _pages_2 = form.getPages();
      for(final Page p_2 : _pages_2) {
        {
          EList<VisibilityCondition> _visibilityConditions = p_2.getVisibilityConditions();
          for(final VisibilityCondition v : _visibilityConditions) {
            {
              if ((v instanceof SelectionCondition)) {
                _builder.append("\t\t\t");
                _builder.append("form.registerConditional(\'");
                SelectionItem _item = ((SelectionCondition) v).getItem();
                EObject _eContainer = _item.eContainer();
                String _elementId_3 = ((PageElement) _eContainer).getElementId();
                _builder.append(_elementId_3, "			");
                _builder.append("\',");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t\t");
                _builder.append("\'");
                SelectionItem _item_1 = ((SelectionCondition) v).getItem();
                String _label = _item_1.getLabel();
                _builder.append(_label, "			");
                _builder.append("\', ");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t\t");
                _builder.append("[");
                _builder.newLine();
                {
                  EList<PageElement> _concernsElements = ((SelectionCondition) v).getConcernsElements();
                  for(final PageElement ce : _concernsElements) {
                    _builder.append("\t\t\t");
                    _builder.append("\t");
                    _builder.append("\'");
                    String _elementId_4 = ce.getElementId();
                    _builder.append(_elementId_4, "				");
                    _builder.append("\',");
                    _builder.newLineIfNotEmpty();
                  }
                }
                _builder.append("\t\t\t");
                _builder.append("]);");
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(");");
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
      EList<Page> _pages_3 = form.getPages();
      for(final Page p_3 : _pages_3) {
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
          EList<PageElement> _elements_2 = p_3.getElements();
          for(final PageElement e_2 : _elements_2) {
            _builder.append("\t\t\t\t");
            CharSequence _generateElement = this.generateElement(e_2);
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
        } else {
          CharSequence _xifexpression_3 = null;
          if ((element instanceof TextField)) {
            CharSequence _xblockexpression_3 = null;
            {
              TextField textfield = ((TextField) element);
              CharSequence _generateTextField = this.generateTextField(textfield);
              _xblockexpression_3 = (_generateTextField);
            }
            _xifexpression_3 = _xblockexpression_3;
          } else {
            CharSequence _xifexpression_4 = null;
            if ((element instanceof TextArea)) {
              CharSequence _xblockexpression_4 = null;
              {
                TextArea textarea = ((TextArea) element);
                CharSequence _generateTextArea = this.generateTextArea(textarea);
                _xblockexpression_4 = (_generateTextArea);
              }
              _xifexpression_4 = _xblockexpression_4;
            } else {
              CharSequence _xifexpression_5 = null;
              if ((element instanceof SelectionField)) {
                CharSequence _xblockexpression_5 = null;
                {
                  SelectionField selectionfield = ((SelectionField) element);
                  CharSequence _generateSelectionField = this.generateSelectionField(selectionfield);
                  _xblockexpression_5 = (_generateSelectionField);
                }
                _xifexpression_5 = _xblockexpression_5;
              }
              _xifexpression_4 = _xifexpression_5;
            }
            _xifexpression_3 = _xifexpression_4;
          }
          _xifexpression_2 = _xifexpression_3;
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
  
  public CharSequence generateTextField(final TextField field) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div class=\"control-group\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<label for=\"");
    String _elementId = field.getElementId();
    _builder.append(_elementId, "	");
    _builder.append("\">");
    String _label = field.getLabel();
    _builder.append(_label, "	");
    _builder.append("</label>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<div class=\"controls\">");
    _builder.newLine();
    {
      boolean _isEncrypted = field.isEncrypted();
      if (_isEncrypted) {
        _builder.append("\t\t");
        _builder.append("<input type=\"password\" id=\"");
        String _elementId_1 = field.getElementId();
        _builder.append(_elementId_1, "		");
        _builder.append("\"/>");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("\t\t");
        _builder.append("<input type=\"text\" id=\"");
        String _elementId_2 = field.getElementId();
        _builder.append(_elementId_2, "		");
        _builder.append("\"/>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("</div>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateTextArea(final TextArea area) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div class=\"control-group\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<label for=\"");
    String _elementId = area.getElementId();
    _builder.append(_elementId, "	");
    _builder.append("\">");
    String _label = area.getLabel();
    _builder.append(_label, "	");
    _builder.append("</label>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<div class=\"controls\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<textarea id=\"");
    String _elementId_1 = area.getElementId();
    _builder.append(_elementId_1, "		");
    _builder.append("\"></textarea>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("</div>");
    _builder.newLine();
    return _builder;
  }
  
  public Integer getIndex(final EList<SelectionItem> list, final EObject object) {
    return Integer.valueOf(list.indexOf(object));
  }
  
  public CharSequence generateSelectionField(final SelectionField field) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div class=\"control-group\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<label class=\"lone\" id=\"label_for_");
    String _elementId = field.getElementId();
    _builder.append(_elementId, "	");
    _builder.append("\">");
    String _label = field.getLabel();
    _builder.append(_label, "	");
    _builder.append("</label>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<div class=\"controls\" id=\"");
    String _elementId_1 = field.getElementId();
    _builder.append(_elementId_1, "	");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    {
      EList<SelectionItem> _items = field.getItems();
      for(final SelectionItem i : _items) {
        _builder.append("\t");
        EList<SelectionItem> _items_1 = field.getItems();
        Integer idx = this.getIndex(_items_1, i);
        _builder.newLineIfNotEmpty();
        {
          SelectionFieldType _selectionFieldType = field.getSelectionFieldType();
          boolean _equals = _selectionFieldType.equals(SelectionFieldType.RADIO);
          if (_equals) {
            _builder.append("\t");
            _builder.append("<label class=\"radio\" for=\"");
            String _elementId_2 = field.getElementId();
            _builder.append(_elementId_2, "	");
            _builder.append("_");
            _builder.append(idx, "	");
            _builder.append("\">");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<input type=\"radio\" value=\"");
            String _label_1 = i.getLabel();
            _builder.append(_label_1, "		");
            _builder.append("\" name=\"");
            String _elementId_3 = field.getElementId();
            _builder.append(_elementId_3, "		");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            {
              boolean _isSelected = i.isSelected();
              if (_isSelected) {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("checked=\"checked\"");
                _builder.newLine();
              }
            }
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("id=\"");
            String _elementId_4 = field.getElementId();
            _builder.append(_elementId_4, "		");
            _builder.append("_");
            _builder.append(idx, "		");
            _builder.append("\" /> ");
            String _label_2 = i.getLabel();
            _builder.append(_label_2, "		");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("</label>");
            _builder.newLine();
          } else {
            _builder.append("\t");
            _builder.append("<label class=\"checkbox\" for=\"");
            String _elementId_5 = field.getElementId();
            _builder.append(_elementId_5, "	");
            _builder.append("_");
            _builder.append(idx, "	");
            _builder.append("\">");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<input type=\"checkbox\" value=\"");
            String _label_3 = i.getLabel();
            _builder.append(_label_3, "		");
            _builder.append("\" name=\"");
            String _elementId_6 = field.getElementId();
            _builder.append(_elementId_6, "		");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            {
              boolean _isSelected_1 = i.isSelected();
              if (_isSelected_1) {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("checked=\"checked\"");
                _builder.newLine();
              }
            }
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("id=\"");
            String _elementId_7 = field.getElementId();
            _builder.append(_elementId_7, "		");
            _builder.append("_");
            _builder.append(idx, "		");
            _builder.append("\" /> ");
            String _label_4 = i.getLabel();
            _builder.append(_label_4, "		");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("</label>");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("</div>");
    _builder.newLine();
    return _builder;
  }
}
