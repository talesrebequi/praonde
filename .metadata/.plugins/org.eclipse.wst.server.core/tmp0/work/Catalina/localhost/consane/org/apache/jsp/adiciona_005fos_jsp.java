package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;

public final class adiciona_005fos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t     <body onload=\"return dataAtual()\">\r\n");
      out.write("\t     <script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("\t     function alta(valor) {\r\n");
      out.write("\t\t\t\tvalor.value=valor.value.toUpperCase();\t\r\n");
      out.write("\t\t }\r\n");
      out.write("\t \tfunction valida() {\r\n");
      out.write("\t \t\tcliente = document.form1.cliente.value;\r\n");
      out.write("\t \t\t\r\n");
      out.write("\t \t\tif(cliente==\"\") {\r\n");
      out.write("\t \t\t\talert(\"Insira ao menos o nome fantasia do cliente!\");\r\n");
      out.write("\t \t\t\tdocument.form1.cliente.focus();\r\n");
      out.write("\t \t\t\treturn false;\r\n");
      out.write("\t \t\t}else{\r\n");
      out.write("\t \t\t\treturn true;\r\n");
      out.write("\t \t\t}\r\n");
      out.write("\t \t}\r\n");
      out.write("\t \tfunction mascara(src, mask){\r\n");
      out.write("\t\t \tvar i = src.value.length;\r\n");
      out.write("\t\t \tvar saida = mask.substring(0,1);\r\n");
      out.write("\t\t \tvar texto = mask.substring(i);\r\n");
      out.write("\t\t \tif (texto.substring(0,1) != saida){\r\n");
      out.write("\t\t \t\tsrc.value += texto.substring(0,1);\r\n");
      out.write("\t\t \t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t \tfunction dataAtual(){\r\n");
      out.write("\t \t\tvar d=new Date();  \r\n");
      out.write("            var monthname=new Array(\"01\",\"02\",\"03\",\"04\",\"05\",\"06\",\"07\",\"08\",\"09\",\"10\",\"11\",\"12\");  \r\n");
      out.write("            var TODAY = d.getDate() + \"/\" +monthname[d.getMonth()] +  \"/\" + d.getFullYear();  \r\n");
      out.write("\t \t\tform1.data_lancamento.value = TODAY;\r\n");
      out.write("\t \t} \r\n");
      out.write("\t     </script>\r\n");
      out.write("\t     \t<center>\r\n");
      out.write("\t     \t<form name=\"form1\" action=\"adicionaOS\" onSubmit=\"return (valida())\">\r\n");
      out.write("\t     \t<font color=\"purple\"><b>Adicionar OS</b></font>\r\n");
      out.write("\t     \t<table width=\"350\" border=\"3\" cellpadding=\"1\" cellspacing=\"1\"> \r\n");
      out.write("\t     \t<tr >\r\n");
      out.write("\t     \t<td width=\"350\">Lançamento de OS: </td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr valign=\"top\">\r\n");
      out.write("\t     \t<td >\r\n");
      out.write("\t     \t<table cellspacing=\"1\" cellpadding=\"1\" border=\"0\"> \r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Cliente: </td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t  <select name=\"cliente\">\r\n");
      out.write("\t     \t  ");

	     		ClienteDAO cdao = new ClienteDAO();
	     		List<Cliente> clientes = cdao.getLista();
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
      out.write("     \t      </select>\r\n");
      out.write("     \t    </td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\tData de lançamento:\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\t<input type = \"text\" name = \"data_lancamento\"  onKeyPress=\"mascara(this, '##/##/####')\" maxlength=10  />\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\tCondição de Pagamento:\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\t<select name=\"condPag\">\r\n");
      out.write("\t\t     \t  \t");

		     		Condicao_PagamentoDAO cpdao = new Condicao_PagamentoDAO();
		     		List<Condicao_Pagamento> condicoes = cpdao.getLista();
		     		for (Condicao_Pagamento cp : condicoes){
		     		
      out.write("\r\n");
      out.write("\t\t     \t    <option value=");
      out.print(cp.getIdCondicao_Pagamento());
      out.write('>');
      out.print(cp.getCondicao_pagamento());
      out.write("</option>\r\n");
      out.write("\t\t\t     \t");

			     		}
			     	
      out.write("\t     \t    \r\n");
      out.write("\t     \t    </select>\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Ordenar por: </td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t  <select name=\"ordenar\">\r\n");
      out.write("\t     \t  <option value=\"lanc\">Por Lançamento</option>\r\n");
      out.write("\t     \t  <option value=\"instr_c\">Por Instrumento - Crescente</option>\r\n");
      out.write("\t     \t  <option value=\"instr_d\">Por Instrumento - Decrescente</option>\r\n");
      out.write("\t     \t  <option value=\"patr_c\">Por Patrimônio - Crescente</option>\r\n");
      out.write("\t     \t  <option value=\"patr_d\">Por Patrimônio - Decrescente</option>\r\n");
      out.write("\t     \t  </select>\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\tObservação:\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\t<input type = \"text\" name = \"observacao\" onkeyup=\"javascript:alta(this);\"/>\r\n");
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
