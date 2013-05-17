package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;

public final class adiciona_005fsem_005fconserto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 
	int quantidade = Integer.parseInt(request.getParameter("quantidade"));
	int idOS_has_Produtos = Integer.parseInt(request.getParameter("idOS_has_Produtos"));

      out.write("\r\n");
      out.write("\t<html>\r\n");
      out.write("\t     <body>\r\n");
      out.write("\t     <script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("\t \tfunction valida() {\r\n");
      out.write("\t \t\tif(form1.quantidade.value>");
      out.print(quantidade);
      out.write(") {\r\n");
      out.write("\t \t\t\talert(\"Há mais produtos quebrados do que existentes na caixa!\");\r\n");
      out.write("\t \t\t\tdocument.form1.quantidade.focus();\r\n");
      out.write("\t \t\t\treturn false;\r\n");
      out.write("\t \t\t}else if (form1.quantidade.value==\"\"){\r\n");
      out.write("\t \t\t\talert(\"Informe a quantidade de peças sem conserto!\");\r\n");
      out.write("\t \t\t\tdocument.form1.quantidade.focus();\r\n");
      out.write("\t \t\t\treturn false;\r\n");
      out.write("\t \t\t}else{\r\n");
      out.write("\t \t\t\treturn true;\r\n");
      out.write("\t \t\t}\r\n");
      out.write("\t \t}\r\n");
      out.write("\t \t</script>\r\n");
      out.write("\t     <center>\r\n");
      out.write("\t     \t<form name=\"form1\" action=\"adiciona_sem_consertoServlet\" onSubmit=\"return (valida())\">\r\n");
      out.write("\t\t     \t<font color=\"blue\"><b>Adicionar Sinalização de Não-Conserto</b></font>\r\n");
      out.write("\t\t\t     \t<table width=\"278\" border=\"3\" cellpadding=\"1\" cellspacing=\"1\"> \r\n");
      out.write("\t\t\t     \t<tr >\r\n");
      out.write("\t\t\t     \t\t<td width=\"239\">Dados gerais: </td>\r\n");
      out.write("\t\t\t     \t</tr>\r\n");
      out.write("\t\t\t     \t<tr >\r\n");
      out.write("\t\t\t     \t\t<td width=\"239\">Motivos do não-conserto: </td>\r\n");
      out.write("\t\t\t     \t</tr>\r\n");
      out.write("\t\t\t     \t<tr valign=\"top\">\r\n");
      out.write("\t\t\t     \t\t<td >\r\n");
      out.write("\t\t\t\t\t     \t<table cellspacing=\"1\" cellpadding=\"1\" border=\"0\"> \r\n");
      out.write("\t\t\t\t\t     ");
 for (int contador = 1; contador<=quantidade; contador++){
      out.write("\r\n");
      out.write("\t\t\t\t\t     \t<tr>\r\n");
      out.write("\t\t\t\t\t     \t\t<td nowrap>\r\n");
      out.write("\t\t\t\t\t     \t\t\tPeça ");
      out.print(contador);
      out.write(":\r\n");
      out.write("\t\t\t\t\t     \t\t</td>\r\n");
      out.write("\t\t\t\t\t     \t\t<td>\r\n");
      out.write("\t\t\t\t\t\t     \t\t<select name=\"motivo1");
      out.print(contador);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t     \t\t\t<option value=0></option>\r\n");
      out.write("\t\t\t\t\t\t\t     \t  \t");

							     		MotivoDAO mdao = new MotivoDAO();
							     		List<Motivo> motivos = mdao.getLista();
							     		for (Motivo m : motivos){
							     		
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t     \t    <option value=");
      out.print(m.getIdMotivo());
      out.write('>');
      out.print(m.getMotivo());
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t     \t");

								     		}
								     	
      out.write("\t     \t    \r\n");
      out.write("\t\t\t\t\t\t     \t    </select>\r\n");
      out.write("\t\t\t\t\t\t     \t</td>\r\n");
      out.write("\t\t\t\t\t\t     \t<td>\r\n");
      out.write("\t\t\t\t\t\t     \t\t<select name=\"motivo2");
      out.print(contador);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t     \t\t\t<option value=0></option>\r\n");
      out.write("\t\t\t\t\t\t\t     \t  \t");

							     		for (Motivo m : motivos){
							     		
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t     \t    <option value=");
      out.print(m.getIdMotivo());
      out.write('>');
      out.print(m.getMotivo());
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t     \t");

								     		}
								     	
      out.write("\t     \t    \r\n");
      out.write("\t\t\t\t\t\t     \t    </select>\r\n");
      out.write("\t\t\t\t\t\t     \t</td>\r\n");
      out.write("\t\t\t\t\t\t     \t<td>\r\n");
      out.write("\t\t\t\t\t\t     \t\t<select name=\"motivo3");
      out.print(contador);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t     \t\t\t<option value=0></option>\r\n");
      out.write("\t\t\t\t\t\t\t     \t  \t");

							     		for (Motivo m : motivos){
							     		
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t     \t    <option value=");
      out.print(m.getIdMotivo());
      out.write('>');
      out.print(m.getMotivo());
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t     \t");

								     		}
								     	
      out.write("\t     \t    \r\n");
      out.write("\t\t\t\t\t\t     \t    </select>\r\n");
      out.write("\t\t\t\t\t\t     \t</td>\r\n");
      out.write("\t\t\t\t\t     \t</tr>\r\n");
      out.write("\t\t\t\t\t     \t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t     \t</table>\r\n");
      out.write("\t\t\t\t     \t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<br /><br />\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"quantidade\" value=\"");
      out.print(quantidade);
      out.write("\" />\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"idOS_has_Produtos\" value=\"");
      out.print(idOS_has_Produtos);
      out.write("\" />\r\n");
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
