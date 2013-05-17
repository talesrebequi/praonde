package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;

public final class edita_005fproduto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t \t\tfantasia = document.form1.fantasia.value;\r\n");
      out.write("\t \t\t\r\n");
      out.write("\t \t\tif(fantasia==\"\") {\r\n");
      out.write("\t \t\t\talert(\"Insira ao menos o nome fantasia do produto!\");\r\n");
      out.write("\t \t\t\tdocument.form1.fantasia.focus();\r\n");
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
      out.write("\t    \r\n");
      out.write("\t    ");

	    	
	    	ProdutoDAO dao = new ProdutoDAO ();
	     	Produto produto;
	     	int idProduto = 0;
	     	if(request.getParameter("idProduto") != null)
	     		idProduto = Integer.parseInt(request.getParameter("idProduto"));

	     	produto = dao.getProduto(idProduto);
	     	
	     	String descricao = produto.getDescricao();
	     	if(descricao==null) descricao="";	   
	     	double valor = produto.getValor();
	     	int barras = produto.getBarras();
	     	int duplo = produto.getDuplo();
	     	int ultimo = produto.getUltimo();
	     	  		     	    
	    
      out.write(" \r\n");
      out.write("\t\t\r\n");
      out.write("\t     \t<form name=\"form1\" action=\"editaProduto\" onSubmit=\"return (valida())\">\r\n");
      out.write("\t     \t<h3>Editar Instrumento</h3>\r\n");
      out.write("\t     \t<table width=\"278\" border=\"3\" cellpadding=\"1\" cellspacing=\"1\"> \r\n");
      out.write("\t     \t<tr >\r\n");
      out.write("\t     \t<td width=\"239\">Dados gerais: </td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr valign=\"top\">\r\n");
      out.write("\t     \t<td >\r\n");
      out.write("\t     \t<table cellspacing=\"1\" cellpadding=\"1\" border=\"0\"> \r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Descrição: </td>\r\n");
      out.write("\t     \t<td><input type=\"text\" name=\"descricao\" value=\"");
      out.print(descricao);
      out.write("\" onkeyup=\"javascript:alta(this);\"/></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Valor: </td>\r\n");
      out.write("\t     \t<td><input type=\"text\" name=\"valor\" value=\"");
      out.print(valor);
      out.write("\" /></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Código de Barras: </td>\r\n");
      out.write("     \t    <td><input type=\"text\" name=\"barras\" value=\"");
      out.print(barras);
      out.write("\"/></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t</table>\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t  <td>Item duplo:</td>\r\n");
      out.write("\t     \t  ");
if(duplo==1){
      out.write("\r\n");
      out.write("\t     \t  \t<td><input type=\"checkbox\" name=\"duplo\" checked/></td>\r\n");
      out.write("\t     \t  ");
}else{
      out.write("\r\n");
      out.write("\t     \t  \t<td><input type=\"checkbox\" name=\"duplo\" /></td>\r\n");
      out.write("\t     \t  ");
}
      out.write("\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t  <td>Último da OS:</td>\r\n");
      out.write("\t     \t  ");
if(ultimo==1){
      out.write("\r\n");
      out.write("\t     \t  \t<td><input type=\"checkbox\" name=\"ultimo\" checked/></td>\r\n");
      out.write("\t     \t  ");
}else{
      out.write("\r\n");
      out.write("\t     \t  \t<td><input type=\"checkbox\" name=\"ultimo\" /></td>\r\n");
      out.write("\t     \t  ");
}
      out.write("\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<br /><br />\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"idProduto\" value=\"");
      out.print(idProduto);
      out.write("\"/>  \r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"Gravar\" />\r\n");
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
