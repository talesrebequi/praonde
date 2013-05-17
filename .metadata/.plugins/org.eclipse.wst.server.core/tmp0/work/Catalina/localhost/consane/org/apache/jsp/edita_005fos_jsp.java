package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;

public final class edita_005fos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t     ");

	    	
	    	OSDAO dao = new OSDAO ();
	     	int idOS = 0;
	     	if(request.getParameter("idOS") != null)
	     		idOS = Integer.parseInt(request.getParameter("idOS"));

	     	OS os = dao.getOS(idOS);
	     	  		     	   
	    
      out.write(" \r\n");
      out.write("\t     <script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("\t\t\t function valida() {\r\n");
      out.write("\t\t\t \t\tcaixa = document.form1.caixa.value;\r\n");
      out.write("\t\t\t \t\t\r\n");
      out.write("\t\t\t \t\tif(caixa==\"\") {\r\n");
      out.write("\t\t\t \t\t\talert(\"Insira ao menos a caixa!\");\r\n");
      out.write("\t\t\t \t\t\tdocument.form1.caixa.focus();\r\n");
      out.write("\t\t\t \t\t\treturn false;\t\r\n");
      out.write("\t\t\t \t\t}else{\r\n");
      out.write("\t\t\t \t\t\treturn true;\r\n");
      out.write("\t\t\t \t\t}\r\n");
      out.write("\t\t\t }\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t function mascara(src, mask){\r\n");
      out.write("\t\t\t \tvar i = src.value.length;\r\n");
      out.write("\t\t\t \tvar saida = mask.substring(0,1);\r\n");
      out.write("\t\t\t \tvar texto = mask.substring(i);\r\n");
      out.write("\t\t\t \tif (texto.substring(0,1) != saida){\r\n");
      out.write("\t\t\t \t\tsrc.value += texto.substring(0,1);\r\n");
      out.write("\t\t\t \t}\r\n");
      out.write("\t\t\t } \r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t     \t<form name=\"form1\" action=\"editaOS\" onSubmit=\"return (valida())\">\r\n");
      out.write("\t     \t<h3>Editar Ordem de Serviço</h3>\r\n");
      out.write("\t     \t<table width=\"278\" border=\"3\" cellpadding=\"1\" cellspacing=\"1\"> \r\n");
      out.write("\t     \t<tr >\r\n");
      out.write("\t     \t<td width=\"239\">Dados gerais: </td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr valign=\"top\">\r\n");
      out.write("\t     \t<td >\r\n");
      out.write("\t     \t<table cellspacing=\"1\" cellpadding=\"1\" border=\"0\"> \r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\tCliente: \r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\t<select name=\"cliente\">\r\n");
      out.write("\t\t     \t  \t");

		     			ClienteDAO cdao = new ClienteDAO();
		     			List<Cliente> clientes = cdao.getLista();
		     			for (Cliente c : clientes){
		     				if(c.getIdCliente()==os.getIdCliente()){
			     		
      out.write("\r\n");
      out.write("\t\t\t     \t    \t<option value=");
      out.print(c.getIdCliente());
      out.write(" selected>");
      out.print(c.getFantasia());
      out.write("</option>\r\n");
      out.write("\t\t\t     \t\t");

		     				}else{
		     			
      out.write("\t     \t    \r\n");
      out.write("\t\t     \t\t\t\t<option value=");
      out.print(c.getIdCliente());
      out.write('>');
      out.print(c.getFantasia());
      out.write("</option>\r\n");
      out.write("\t\t     \t\t\t");

		     				}
		     			}
		     		
      out.write("\r\n");
      out.write("     \t     \t</select>\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\tData de Lançamento:\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"dataLancamento\" value=\"");
      out.print(os.getDataLancamento());
      out.write("\" onKeyPress=\"mascara(this, '##/##/####')\" maxlength=10/>\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\tData de Entrega:\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"dataEntrega\" value=\"");
      out.print(os.getDataEntrega());
      out.write("\" onKeyPress=\"mascara(this, '##/##/####')\" maxlength=10/>\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\tCondição de Pagamento: \r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\t<select name=\"condicao_pagamento\">\r\n");
      out.write("\t\t     \t  \t");

		     			Condicao_PagamentoDAO cpdao = new Condicao_PagamentoDAO();
		     			List<Condicao_Pagamento> conds = cpdao.getLista();
		     			for (Condicao_Pagamento c : conds){
		     				if(c.getIdCondicao_Pagamento()==os.getIdCondicao_Pagamento()){
			     		
      out.write("\r\n");
      out.write("\t\t\t     \t    \t\t<option value=");
      out.print(c.getIdCondicao_Pagamento());
      out.write(" selected>");
      out.print(c.getCondicao_pagamento());
      out.write("</option>\r\n");
      out.write("\t\t\t     \t\t");

		     				}else{
		     			
      out.write("\r\n");
      out.write("\t\t     \t\t\t\t\t<option value=");
      out.print(c.getIdCondicao_Pagamento());
      out.write('>');
      out.print(c.getCondicao_pagamento());
      out.write("</option>\r\n");
      out.write("\t\t     \t\t\t");
	
		     				}
		     			}
		     		
      out.write("\r\n");
      out.write("     \t     \t</select>\r\n");
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
      out.write("\t\t\t\t<input type=\"text\" name=\"observacao\" value=\"");
      out.print(os.getObservacao());
      out.write("\"/>\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t</table>\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<br /><br />\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"idOS\" value=\"");
      out.print(os.getIdOS());
      out.write("\" />\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"idCliente\" value=\"");
      out.print(os.getIdCliente());
      out.write("\" />    \r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"Gravar\" />\r\n");
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
