package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;

public final class edita_005fcaixa_005fhas_005fprodutos_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	    	
	    	Caixa_has_ProdutosDAO dao = new Caixa_has_ProdutosDAO ();
	     	Caixa_has_Produtos caixa_has_produtos;
	     	int idCaixa_has_Produtos = 0;
	     	if(request.getParameter("idCaixa_has_Produtos") != null)
	     		idCaixa_has_Produtos = Integer.parseInt(request.getParameter("idCaixa_has_Produtos"));

	     	Caixa_has_Produtos chp = dao.getCHP(idCaixa_has_Produtos);
	     	int idCaixa = chp.getIdCaixa();
	     	
	     	System.out.println("IDCaixa_HAS_PRODUTOS"+idCaixa_has_Produtos);  		     	   
	    
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
      out.write("\t\t\t \r\n");
      out.write("\t\t\tfunction bloquear(){\r\n");
      out.write("\t\t\t\t");

					String classificacao = chp.getPatrimonio();
					if(classificacao==null) classificacao="";
				
      out.write("\r\n");
      out.write("\t\t    \tif (document.getElementById('sequencia_patrimonio').disabled==false){\r\n");
      out.write("\t\t    \t\tdocument.getElementById('sequencia_patrimonio').value = \"\";\r\n");
      out.write("\t\t\t\t\tdocument.getElementById('sequencia_patrimonio').disabled = true;\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tdocument.getElementById('sequencia_patrimonio').value = \"");
      out.print(classificacao );
      out.write("\";\r\n");
      out.write("\t\t\t\t\tdocument.getElementById('sequencia_patrimonio').disabled = false;\r\n");
      out.write("\t\t \t\t} \r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t     \t<form name=\"form1\" action=\"editaCaixa_has_Produtos\" onSubmit=\"return (valida())\">\r\n");
      out.write("\t     \t<h3>Editar Instrumento da Caixa</h3>\r\n");
      out.write("\t     \t<table width=\"278\" border=\"3\" cellpadding=\"1\" cellspacing=\"1\"> \r\n");
      out.write("\t     \t<tr >\r\n");
      out.write("\t     \t<td width=\"239\">Dados gerais: </td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr valign=\"top\">\r\n");
      out.write("\t     \t<td >\r\n");
      out.write("\t     \t<table cellspacing=\"1\" cellpadding=\"1\" border=\"0\"> \r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\tInstrumento: \r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\t<select name=\"produto\">\r\n");
      out.write("\t\t     \t  \t");

		     			ProdutoDAO pdao = new ProdutoDAO();
		     			List<Produto> produtos = pdao.getLista();
		     			for (Produto p : produtos){
			     		
      out.write("\r\n");
      out.write("\t\t\t     \t    \t<option value=");
      out.print(p.getIdProduto());
      out.write('>');
      out.print(p.getDescricao());
      out.write("</option>\r\n");
      out.write("\t\t\t     \t\t");

		     			}
		     		
      out.write("\t     \t    \r\n");
      out.write("     \t     \t</select>\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\tQuantidade:\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"quantidade\" value=\"");
      out.print(chp.getQuantidade());
      out.write("\"/>\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t\t     \t<tr>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\tPatrimônio do cliente?\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t");
if(chp.getPatrimonio()==null || chp.getPatrimonio()==""){
      out.write("\r\n");
      out.write("\t\t     \t<td>\r\n");
      out.write("\t\t     \t\t<input type=\"checkbox\" name=\"patrimonioCliente\" onclick = \"bloquear();\"/>  \r\n");
      out.write("\t\t     \t</td> \r\n");
      out.write("\t     \t");
}else{
      out.write("\r\n");
      out.write("\t     \t \t<td>\r\n");
      out.write("\t\t     \t\t<input type=\"checkbox\" name=\"patrimonioCliente\" checked  onclick = \"bloquear();\"/>  \r\n");
      out.write("\t\t     \t</td> \r\n");
      out.write("\t\t    ");
}
      out.write(" \r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\tPatrimônio do Instrumento:\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t");
if(chp.getPatrimonio()==null || chp.getPatrimonio()==""){
      out.write("\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\t<input type = \"text\" name = \"sequencia_patrimonio\" disabled / >\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t");
}else{
      out.write("\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\t<input type = \"text\" name = \"sequencia_patrimonio\" value=\"");
      out.print(chp.getPatrimonio());
      out.write("\" />\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t");
}
      out.write("\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\tObservação:\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\t<input type = \"text\" name = \"observacao\" value=\"");
      out.print(chp.getObservacao());
      out.write("\"/>\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t</table>\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<br /><br />\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"idCaixa_has_Produtos\" value=\"");
      out.print(idCaixa_has_Produtos);
      out.write("\" />\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"idCaixa\" value=\"");
      out.print(idCaixa);
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
