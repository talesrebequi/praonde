package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;

public final class adiciona_005fcaixa_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t     <script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("\t     function alta(valor) {\r\n");
      out.write("\t\t\t\tvalor.value=valor.value.toUpperCase();\t\r\n");
      out.write("\t\t }\r\n");
      out.write("\t \tfunction valida() {\r\n");
      out.write("\t \t\tcaixa = document.form1.caixa.value;\r\n");
      out.write("\t \t\tpatrimonio = document.form1.patrimonio.value;\r\n");
      out.write("\t \t\t\r\n");
      out.write("\t \t\tif(caixa==\"\") {\r\n");
      out.write("\t \t\t\talert(\"Insira ao menos o nome da caixa!\");\r\n");
      out.write("\t \t\t\tdocument.form1.caixa.focus();\r\n");
      out.write("\t \t\t\treturn false;\r\n");
      out.write("\t \t\t}else if(patrimonio==\"\"){\r\n");
      out.write("\t \t\t\talert(\"Insira a sigla do patrimônio!\");\r\n");
      out.write("\t \t\t\tdocument.form1.caixa.focus();\r\n");
      out.write("\t \t\t\treturn false;\r\n");
      out.write("\t \t\t}else{\r\n");
      out.write("\t \t\t\treturn true;\r\n");
      out.write("\t \t\t}\r\n");
      out.write("\t \t}\r\n");
      out.write("\t \tfunction mascara(src, mask){\r\n");
      out.write("\t \tvar i = src.value.length;\r\n");
      out.write("\t \tvar saida = mask.substring(0,1);\r\n");
      out.write("\t \tvar texto = mask.substring(i);\r\n");
      out.write("\t \tif (texto.substring(0,1) != saida)\r\n");
      out.write("\t \t{\r\n");
      out.write("\t \tsrc.value += texto.substring(0,1);\r\n");
      out.write("\t \t}\r\n");
      out.write("\t \t} \r\n");
      out.write("\t     </script>\r\n");
      out.write("\t     <center>\r\n");
      out.write("\t     \t<form name=\"form2\" action=\"adiciona_caixa.jsp\">\r\n");
      out.write("\t     \t<table cellspacing=\"1\" cellpadding=\"1\" border=\"0\"> \r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\tFiltrar Clientes:\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\t<input type = \"text\" name = \"buscaCli\" onkeyup=\"java script:alta(this);\"/>\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\t<input type = \"submit\" value= \"Filtrar\" />\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t</table>\r\n");
      out.write("\t     \t</form>\r\n");
      out.write("\t     \r\n");
      out.write("\t     \t<form name=\"form1\" action=\"adiciona_contato_caixa.jsp\" onSubmit=\"return (valida())\">\r\n");
      out.write("\t     \t<font color=\"brown\"><b>Adicionar Especialidade</b></font>\r\n");
      out.write("\t     \t<table width=\"278\" border=\"3\" cellpadding=\"1\" cellspacing=\"1\"> \r\n");
      out.write("\t     \t<tr >\r\n");
      out.write("\t     \t<td width=\"239\">Dados gerais: </td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr valign=\"top\">\r\n");
      out.write("\t     \t<td >\r\n");
      out.write("\t     \t<table cellspacing=\"1\" cellpadding=\"1\" border=\"0\"> \r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Especialidade: </td>\r\n");
      out.write("\t     \t<td><input type=\"text\" name=\"caixa\" onkeyup=\"javascript:alta(this);\"/></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Cliente: </td> \r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t  <select name=\"cliente\" onchange=\"document.form1.patrimonioCliente.focus()\">\r\n");
      out.write("\t     \t  ");

	     		
	     		ClienteDAO cdao = new ClienteDAO();
	     		String sql = "";
	     		System.out.println(request.getParameter("buscaCli"));
	     		if(request.getParameter("buscaCli")==null || request.getParameter("buscaCli").equals("null") || request.getParameter("buscaCli")=="" )
	     			sql = "select * from clientes";
	     		else
	     			sql = "select * from clientes where fantasia like '%"+request.getParameter("buscaCli")+"%'";
	     		System.out.println("SQL:" + sql);
	     		List<Cliente> clientes = cdao.getConsulta(sql);
	     		System.out.println("SIZE:" + clientes.size());
	     		for (Cliente c : clientes){
	     		
	     	  
      out.write("\r\n");
      out.write("\t     \t    <option value=");
      out.print(c.getIdCliente());
      out.write('>');
      out.print(c.getFantasia());
      out.write("</option>\r\n");
      out.write("\t     \t");

	     		}
	     	
      out.write("\t     \t    \r\n");
      out.write("     \t      </select></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\tPatrimônio do cliente?\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\t<input type=\"checkbox\" name=\"patrimonioCliente\" onclick=\"document.form1.patrimonio.focus()\"/>  \r\n");
      out.write("\t     \t</td> \r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Sigla do Patrimônio: </td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\t<input type=\"text\" name=\"patrimonio\" onkeyup=\"javascript:alta(this);\"/>\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t</table>\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t\t\t</table>  \r\n");
      out.write("\t\t\t<br /><br />\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"Próximo >>\" />\r\n");
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
