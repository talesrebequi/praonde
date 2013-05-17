package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;

public final class exibe_005fproduto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t     \t");

	     	ProdutoDAO dao = new ProdutoDAO ();
	     	Produto produto;
	     	int idProduto = 0;
	     	if(request.getParameter("idProduto") != null)
	     		idProduto = Integer.parseInt(request.getParameter("idProduto"));

	     	produto = dao.getProduto(idProduto);
	     	
	     	String descricao = produto.getDescricao();	     		     	
	     	int barras = produto.getBarras();
	     	double valor = produto.getValor();
	     	
	     	ContatoDAO contatoDAO = new ContatoDAO();
	     	List<Contato> contatos = contatoDAO.getListaRelacionada(idProduto); 
	
      out.write("\r\n");
      out.write("\t<html>\r\n");
      out.write("\t     <body>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t     \t<form action=\"edita_produto.jsp\">\r\n");
      out.write("\t\t     \t<h2>Informações do Produto:</h2>\r\n");
      out.write("\t\t     \t<table cellspacing=\"1\" cellpadding=\"1\" border=\"3\"> \r\n");
      out.write("\t\t\t     \t");
 if(produto.getDescricao()!=null )if( produto.getDescricao().trim()!=""){
      out.write("\r\n");
      out.write("\t\t\t     \t<tr>\r\n");
      out.write("\t\t\t     \t\t<td><center>Descrição:</center></td>\r\n");
      out.write("\t\t\t     \t\t<td>");
      out.print( produto.getDescricao());
      out.write("</td>\r\n");
      out.write("\t\t\t     \t</tr>\r\n");
      out.write("\t\t\t     \t");
}
      out.write("\r\n");
      out.write("\t\t\t     \t");
 if(produto.getBarras()!=0 ){
      out.write("\r\n");
      out.write("\t\t\t     \t<tr>\r\n");
      out.write("\t\t\t\t     \t<td><center>Código de Barras: </center></td>\r\n");
      out.write("\t\t\t\t     \t<td>");
      out.print( produto.getBarras() );
      out.write("</td>\r\n");
      out.write("\t\t\t     \t</tr>\r\n");
      out.write("\t\t\t     \t");
}
      out.write("\r\n");
      out.write("\t\t\t     \t");
 if(produto.getValor()!=0 ){
      out.write("\r\n");
      out.write("\t\t\t     \t<tr>\r\n");
      out.write("\t\t\t\t     \t<td><center>Valor:</center></td>\r\n");
      out.write("\t\t\t\t\t\t<td> R$ ");
      out.print(produto.getValor() );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t      \t<br>\r\n");
      out.write("\t\t      \t<br>\r\n");
      out.write("\t\t      \t<input type=\"hidden\" name=\"idProduto\" value=\"");
      out.print(idProduto );
      out.write("\"/>\r\n");
      out.write("\t\t      \t<input type=\"submit\" value=\"Editar\" />\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t       \r\n");
      out.write("\t     \t</body>\r\n");
      out.write("   </html>\r\n");
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
