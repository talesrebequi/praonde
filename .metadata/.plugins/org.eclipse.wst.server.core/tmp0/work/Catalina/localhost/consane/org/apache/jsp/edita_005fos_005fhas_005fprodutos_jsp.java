package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;

public final class edita_005fos_005fhas_005fprodutos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t \tfunction valida() {\r\n");
      out.write("\t \t\tcliente = document.form1.produto.value;\r\n");
      out.write("\t \t\t\r\n");
      out.write("\t \t\tif(cliente==\"\") {\r\n");
      out.write("\t \t\t\talert(\"Insira o produto!\");\r\n");
      out.write("\t \t\t\tdocument.form1.produto.focus();\r\n");
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
      out.write("\t     ");
 
	     
	     	int idOsHasProdutos = Integer.parseInt(request.getParameter("idOsHasProdutos"));
	     	int idCliente = Integer.parseInt(request.getParameter("idCliente"));
	     	
	     	OS_has_ProdutosDAO ohpdao = new OS_has_ProdutosDAO();
	     	OS_has_Produtos ohp = ohpdao.getOHP(idOsHasProdutos); 
	
	     
	     
      out.write("\r\n");
      out.write("\t     <center>\r\n");
      out.write("\t     \t<form name=\"form1\" action=\"editaOS_has_Produtos\" onSubmit=\"return (valida())\">\r\n");
      out.write("\t     \t<h3>Adicionar OS</h3>\r\n");
      out.write("\t     \t<table width=\"350\" border=\"3\" cellpadding=\"1\" cellspacing=\"1\"> \r\n");
      out.write("\t     \t<tr >\r\n");
      out.write("\t     \t<td width=\"350\">Instrumentos: </td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr valign=\"top\">\r\n");
      out.write("\t     \t<td >\r\n");
      out.write("\t     \t<table cellspacing=\"1\" cellpadding=\"1\" border=\"0\"> \r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\tQuantidade:\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\t<input type = \"text\" name = \"quantidade\" value=\"");
      out.print(ohp.getQuantidade());
      out.write("\"/>\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\tPossui conserto:\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\t<select name=\"conserto\">\r\n");
      out.write("\t\t     \t  \t");
 
		     	  	if(ohp.getConserto().equals("Sim")){
		     	  	
      out.write("\r\n");
      out.write("\t\t     \t  \t\t<option value=\"Sim\" selected>Sim</option>\r\n");
      out.write("\t     \t\t\t\t<option value=\"Não\">Não</option>\r\n");
      out.write("\t\t     \t  \t");

		     	  	}else{	
		     	  	
      out.write("\r\n");
      out.write("\t\t     \t  \t\t<option value=\"Sim\">Sim</option>\r\n");
      out.write("\t     \t\t\t\t<option value=\"Não\" selected>Não</option>\r\n");
      out.write("\t\t     \t  \t");

		     	  	}
		     	  	
      out.write("\t\t\t     \t\t     \t    \r\n");
      out.write("\t     \t    </select>\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\tQuantidade sem conserto:\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\t<input type=\"text\" name=\"quebrado_qtd\" value=\"");
      out.print(ohp.getQuebrado_qtd());
      out.write("\"/>\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\tMotivo:\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\t<select name=\"motivo\">\r\n");
      out.write("\t\t     \t  \t<option value=0></option>\r\n");
      out.write("\t\t     \t  \t");

		     		MotivoDAO motdao = new MotivoDAO();
		     		List<Motivo> motivos = motdao.getLista();
		     		for (Motivo m : motivos){
		     			if (ohp.getIdMotivo()==m.getIdMotivo()){
		     		
      out.write("\r\n");
      out.write("\t\t     \t    \t\t<option value=");
      out.print(m.getIdMotivo());
      out.write(" selected>");
      out.print(m.getMotivo());
      out.write("</option>\r\n");
      out.write("\t\t\t     \t");

			     		}else{
			     	
      out.write("\t\r\n");
      out.write("\t\t\t\t     \t\t<option value=");
      out.print(m.getIdMotivo());
      out.write('>');
      out.print(m.getMotivo());
      out.write("</option>\r\n");
      out.write("\t\t\t\t    ");

				    	}
				    }
				    
      out.write("     \t    \r\n");
      out.write("\t     \t    </select>\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\tPatrimônio:\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\t<input type = \"text\" name = \"patrimonio\" value=\"");
      out.print(ohp.getPatrimonio());
      out.write("\"/>\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\tObservação:\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\t<input type = \"text\" name = \"observacao\" value=\"");
      out.print(ohp.getObservacao());
      out.write("\"/>\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t</table>\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t\t\t</table>  \r\n");
      out.write("\t\t\t<br /><br />\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"Concluir\" />\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"idOS_has_produtos\" value=\"");
      out.print(ohp.getIdOS_has_produtos());
      out.write("\" />\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"idOS\" value=\"");
      out.print(ohp.getIdOS());
      out.write("\" />\r\n");
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
