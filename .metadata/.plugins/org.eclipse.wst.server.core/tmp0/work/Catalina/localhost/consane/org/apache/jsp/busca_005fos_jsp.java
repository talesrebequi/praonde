package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;

public final class busca_005fos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\t<html>\r\n");
      out.write("\t     <body>\r\n");
      out.write("\t     \t<center>\r\n");
      out.write("\t     \t<form action=\"consultaOS\">\r\n");
      out.write("\t\t\t<h3><font color=\"purple\">Consulta de OS's</font></h3>\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\t\tCódigo: <input type=\"text\" size=\"3\" name=\"codigo\"/> <br><br>\r\n");
      out.write("\t\t\tRazão Social: <input type=\"text\" name=\"razao_social\"/><br><br>\r\n");
      out.write("\t\t\tFantasia: <input type=\"text\" name=\"fantasia\"/><br><br>\r\n");
      out.write("\t\t\tEspecialidade: <input type=\"text\" name=\"especialidade\"/><br><br>\r\n");
      out.write("\t\t\tStatus:  \r\n");
      out.write("\t\t\t<select size=\"1\" name=\"status\">\r\n");
      out.write("\t\t\t\t<option value=\"\" />\r\n");
      out.write("\t\t\t\t<option value=\"Aberta\">Aberta</option>\r\n");
      out.write("\t\t\t\t<option value=\"Em Andamento\">Em Andamento</option>\r\n");
      out.write("\t\t\t\t<option value=\"Concluída\">Concluída</option>\r\n");
      out.write("\t\t\t</select><br><br>\r\n");
      out.write("\t\t\t<!--\r\n");
      out.write("\t\t\tMês:  \r\n");
      out.write("\t\t\t<select size=\"1\" name=\"mes\">\r\n");
      out.write("\t\t\t\t<option value=\"\" />\r\n");
      out.write("\t\t\t\t<option value=\"1\">Janeiro</option>\r\n");
      out.write("\t\t\t\t<option value=\"2\">Fevereiro</option>\r\n");
      out.write("\t\t\t\t<option value=\"3\">Março</option>\r\n");
      out.write("\t\t\t\t<option value=\"4\">Abril</option>\r\n");
      out.write("\t\t\t\t<option value=\"5\">Maio</option>\t\t\t\t\r\n");
      out.write("\t\t\t\t<option value=\"6\">Junho</option>\r\n");
      out.write("\t\t\t\t<option value=\"7\">Julho</option>\r\n");
      out.write("\t\t\t\t<option value=\"8\">Agosto</option>\r\n");
      out.write("\t\t\t\t<option value=\"9\">Setembro</option>\r\n");
      out.write("\t\t\t\t<option value=\"10\">Outubro</option>\r\n");
      out.write("\t\t\t\t<option value=\"11\">Novembro</option>\r\n");
      out.write("\t\t\t\t<option value=\"12\">Dezembro</option>\r\n");
      out.write("\t\t\t</select><br><br>!\r\n");
      out.write("\t\t\t-->\r\n");
      out.write("\t\t\tPatrimônio: <input type=\"text\" name=\"patrimonio\"/>    <br><br>\r\n");
      out.write("\t      \t\r\n");
      out.write("\t      \t<input type=\"submit\" value=\"Buscar\" />\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("            </center>       \r\n");
      out.write("\t     \t</body>\r\n");
      out.write("   </html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
