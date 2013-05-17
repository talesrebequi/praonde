package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;

public final class adiciona_005fsem_005fconserto_005fpre_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');
 
	int quantidade_maxima = Integer.parseInt(request.getParameter("quantidade"));
	int idOS_has_Produtos = Integer.parseInt(request.getParameter("idOsHasProdutos"));	

      out.write("\r\n");
      out.write("\t<html>\r\n");
      out.write("\t     <body>\r\n");
      out.write("\t     <script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("\t \tfunction valida() {\r\n");
      out.write("\t \t\tif(form1.quantidade.value>");
      out.print(quantidade_maxima);
      out.write(") {\r\n");
      out.write("\t \t\t\talert(\"Há mais produtos quebrados do que existentes na caixa!\");\r\n");
      out.write("\t \t\t\tdocument.form1.quantidade.focus();\r\n");
      out.write("\t \t\t\treturn false;\r\n");
      out.write("\t \t\t}else if (form1.quantidade.value==\"\"||form1.quantidade.value==\"0\"){\r\n");
      out.write("\t \t\t\talert(\"Informe a quantidade de peças sem conserto!\");\r\n");
      out.write("\t \t\t\tdocument.form1.quantidade.focus();\r\n");
      out.write("\t \t\t\treturn false;\r\n");
      out.write("\t \t\t}else{\r\n");
      out.write("\t \t\t\treturn true;\r\n");
      out.write("\t \t\t}\r\n");
      out.write("\t \t}\r\n");
      out.write("\t \t</script>\r\n");
      out.write("\t     <center>\r\n");
      out.write("\t     \t<form name=\"form1\" action=\"adiciona_sem_conserto.jsp\" onSubmit=\"return (valida())\">\r\n");
      out.write("\t\t     \t<font color=\"blue\"><b>Adicionar Sinalização de Não-Conserto</b></font>\r\n");
      out.write("\t\t\t     \t<table width=\"278\" border=\"3\" cellpadding=\"1\" cellspacing=\"1\"> \r\n");
      out.write("\t\t\t     \t<tr >\r\n");
      out.write("\t\t\t     \t\t<td width=\"239\">Dados gerais: </td>\r\n");
      out.write("\t\t\t     \t</tr>\r\n");
      out.write("\t\t\t     \t<tr valign=\"top\">\r\n");
      out.write("\t\t\t     \t\t<td >\r\n");
      out.write("\t\t\t\t\t     \t<table cellspacing=\"1\" cellpadding=\"1\" border=\"0\"> \r\n");
      out.write("\t\t\t\t\t     \t<tr>\r\n");
      out.write("\t\t\t\t\t     \t\t<td nowrap>\r\n");
      out.write("\t\t\t\t\t     \t\t\tQuantidade de peças sem conserto: \r\n");
      out.write("\t\t\t\t\t     \t\t</td>\r\n");
      out.write("\t\t\t\t\t     \t\t<td>\r\n");
      out.write("\t\t\t\t\t     \t \t\t<input type=\"text\" name=\"quantidade\" size=\"3\">\r\n");
      out.write("\t\t\t\t\t     \t \t</td>\r\n");
      out.write("\t\t\t\t\t     \t</tr>\r\n");
      out.write("\t\t\t\t\t     \t</table>\r\n");
      out.write("\t\t\t\t     \t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<br /><br />\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" value=\"");
      out.print(idOS_has_Produtos);
      out.write("\" name=\"idOS_has_Produtos\" />\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"Gravar\" />\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t</center>\r\n");
      out.write("      </body>\r\n");
      out.write("   </html>");
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
