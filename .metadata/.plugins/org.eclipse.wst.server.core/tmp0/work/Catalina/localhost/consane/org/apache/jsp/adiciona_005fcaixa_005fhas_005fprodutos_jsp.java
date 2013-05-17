package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;

public final class adiciona_005fcaixa_005fhas_005fprodutos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t      function alta(valor) {\r\n");
      out.write("\t\t\t\tvalor.value=valor.value.toUpperCase();\t\r\n");
      out.write("\t\t }\r\n");
      out.write("\t \tfunction valida() {\r\n");
      out.write("\t \t\tproduto = document.form1.produto.value;\r\n");
      out.write("\t \t\tquantidade = document.form1.quantidade.value; \r\n");
      out.write("\t \t\tif(produto==\"\") {\r\n");
      out.write("\t \t\t\talert(\"Insira o produto!\");\r\n");
      out.write("\t \t\t\tdocument.form1.produto.focus();\r\n");
      out.write("\t \t\t\treturn false;\r\n");
      out.write("\t \t\t}else if(quantidade==\"\"){\r\n");
      out.write("\t \t\t\talert(\"Insira a quantidade!\");\r\n");
      out.write("\t \t\t\tdocument.form1.quantidade.focus();\r\n");
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
      out.write("\t \t}\r\n");
      out.write("\t \tfunction bloquear(){\r\n");
      out.write("\t\t    \tif (document.getElementById('sequencia_patrimonio').disabled==false){\r\n");
      out.write("\t\t    \t\tdocument.getElementById('sequencia_patrimonio').value = \"\";\r\n");
      out.write("\t\t\t\t\tdocument.getElementById('sequencia_patrimonio').disabled = true;\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tdocument.getElementById('sequencia_patrimonio').value = \"\";\r\n");
      out.write("\t\t\t\t\tdocument.getElementById('sequencia_patrimonio').disabled = false;\r\n");
      out.write("\t\t \t\t} \r\n");
      out.write("\t\t} \r\n");
      out.write("\t     </script>\r\n");
      out.write("\t     ");
 
	     
	     	int idCaixa = Integer.parseInt(request.getParameter("idCaixa"));
	     	String patrimonioCliente = request.getParameter("patrimonioCliente");
	     
	     
      out.write("\r\n");
      out.write("\t     \t<center>\r\n");
      out.write("\t     \t<font color=\"brown\"><b>Adicionar Caixa</b></font>\r\n");
      out.write("\t     \r\n");
      out.write("\t     \t<form name=\"form2\" action=\"adiciona_caixa_has_produtos.jsp\">\r\n");
      out.write("\t     \t<table cellspacing=\"1\" cellpadding=\"1\" border=\"0\"> \r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\tFiltro:\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\t<input type = \"text\" name = \"buscaProd\" onkeyup=\"javascript:alta(this);\"/>\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\t<input type = \"submit\" value= \"Filtrar\" />\r\n");
      out.write("\t     \t\t<input type=\"hidden\" value=");
      out.print(idCaixa);
      out.write(" name=\"idCaixa\" />\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t</table>\r\n");
      out.write("\t     \t</form>\r\n");
      out.write("\t     \r\n");
      out.write("\t     \t<form name=\"form1\" action=\"adicionaCaixa_has_Produtos\" onSubmit=\"return (valida())\">\r\n");
      out.write("\t     \t\r\n");
      out.write("\t     \t<table width=\"350\" border=\"3\" cellpadding=\"1\" cellspacing=\"1\"> \r\n");
      out.write("\t     \t<tr >\r\n");
      out.write("\t     \t<td width=\"350\">Instrumentos: </td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr valign=\"top\">\r\n");
      out.write("\t     \t<td >\r\n");
      out.write("\t     \t<table cellspacing=\"1\" cellpadding=\"1\" border=\"0\"> \r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Instrumento: </td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t  <select name=\"produto\" onchange=\"document.form1.quantidade.focus()\">\r\n");
      out.write("\t     \t  ");

	     		ProdutoDAO cdao = new ProdutoDAO();
	     		String sql = "";
	     		System.out.println(request.getParameter("buscaProd"));
	     		if(request.getParameter("buscaProd")==null || request.getParameter("buscaProd").equals("null") || request.getParameter("buscaProd")=="" )
	     			sql = "select * from produtos";
	     		else
	     			sql = "select * from produtos where descricao like '%"+request.getParameter("buscaProd")+"%'";
	     		System.out.println("SQL:" + sql);
	     		List<Produto> produtos = cdao.getConsulta(sql);
	     		System.out.println("SIZE:" + produtos.size());
	     		for (Produto p : produtos){
	     		
      out.write("\r\n");
      out.write("\t     \t    <option value=");
      out.print(p.getIdProduto());
      out.write('>');
      out.print(p.getDescricao());
      out.write("</option>\r\n");
      out.write("\t     \t");

	     		}
	     	
      out.write("\t     \t    \r\n");
      out.write("     \t      </select>\r\n");
      out.write("     \t    </td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\tQuantidade:\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\t<input type = \"text\" name = \"quantidade\" size=3/>\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t");
System.out.println("PATR:"+patrimonioCliente);
      out.write("\r\n");
      out.write("\t     \t");
if(patrimonioCliente!=null && patrimonioCliente.equals("on")){
      out.write("\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\tPatrimônio do instrumento:\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\t<input type = \"text\" name = \"sequencia_patrimonio\" onkeyup=\"javascript:alta(this);\"/>\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t");
}
      out.write("\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\tContinuar adicionando:\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\t<input type = \"checkbox\" name = \"adiciona\" onclick=\"this.form.submit()\"/>\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t</table>\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t\t\t</table>  \r\n");
      out.write("\t\t\t<br /><br />\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"Concluir\" />\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"idCaixa\" value=\"");
      out.print(idCaixa);
      out.write("\" />\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"patrimonioCliente\" value=\"");
      out.print(patrimonioCliente);
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
