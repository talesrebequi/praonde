package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class adiciona_005freferencia_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<head>\r\n");
      out.write("\t<script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("\tfunction valida() {\r\n");
      out.write("\t\tvalor = document.form1.valor.value;\r\n");
      out.write("\t\treferencia = document.form1.referencia.value;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(valor==\"\") {\r\n");
      out.write("\t\t\talert(\"Insira o valor!\");\r\n");
      out.write("\t\t\tdocument.form1.valor.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}else if(referencia==\"\") {\r\n");
      out.write("\t\t\talert(\"Insira a referência!\");\r\n");
      out.write("\t\t\tdocument.form1.referencia.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</head>\r\n");
      out.write("\t     <body>\r\n");
      out.write(" \t     <script>\r\n");
      out.write("\t     function troca(c){\r\n");
      out.write("\t\t     campo=c;\r\n");
      out.write("\t\t     setTimeout(\"exec_troca()\",1);\r\n");
      out.write("\t\t }\r\n");
      out.write("\t\t function exec_troca(){\r\n");
      out.write("\t\t\t campo.value=virgula(campo.value);\r\n");
      out.write("\t\t }\r\n");
      out.write("\t\t function virgula(texto){\r\n");
      out.write("\t\t\t texto=texto.replace(\",\",\".\");\r\n");
      out.write("\t\t\t return texto;\r\n");
      out.write("\t\t }\r\n");
      out.write("\t     </script> \r\n");


List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
FornecedorDAO fdao = new FornecedorDAO();
fornecedores = fdao.getLista();


      out.write("\r\n");
      out.write("\t     \t<form name=\"form1\" action=\"adicionaReferencia\" onSubmit=\"return (valida())\">\r\n");
      out.write("\t     \t<table cellspacing=\"1\" cellpadding=\"1\" border=\"3\"> \r\n");
      out.write("\t     \t<tr >\r\n");
      out.write("\t     \t  <td height=\"24\" colspan=\"2\" align=\"center\"><h3>Cadastro de referências: </h3></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("            <td>Fornecedor:</td>\r\n");
      out.write("            <td><label for=\"idFornecedor\"></label>\r\n");
      out.write("              <select name=\"idFornecedor\" size=\"1\" id=\"idFornecedor\">\r\n");
      out.write("                ");
for (Fornecedor f : fornecedores){ 
      out.write("\r\n");
      out.write("                <option value=");
      out.print(f.getIdFornecedor() );
      out.write('>');
      out.print(f.getDescricao() );
      out.write("</option>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("              </select>\r\n");
      out.write("            </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("            <td>\r\n");
      out.write("            Referência:\r\n");
      out.write("            </td>\r\n");
      out.write("            <td>\r\n");
      out.write("            <input type=\"text\" name=\"referencia\" />\r\n");
      out.write("            </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("            <td>\r\n");
      out.write("            Valor:\r\n");
      out.write("            </td>\r\n");
      out.write("            <td>\r\n");
      out.write("            <input type=\"text\" name=\"valor\" onkeypress=\"troca(this)\"/>\r\n");
      out.write("            </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"Avançar\"/>\r\n");
      out.write("\t\t\t</form>\r\n");
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
