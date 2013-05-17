package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;

public final class exibe_005fcaixa_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t     \t<script>\r\n");
      out.write("\t     \tfunction confirmExclusao(id, idCaixa) {  \r\n");
      out.write("\t\t\t\tif (confirm(\"Tem certeza que deseja excluir esse item da caixa?\")) {  \r\n");
      out.write("\t\t\t\t\tlocation.href=\"removeCaixa_has_Produtos?idCaixa_has_produtos=\"+id+\"&idCaixa=\"+idCaixa;  \r\n");
      out.write("\t\t\t\t}  \t\r\n");
      out.write("\t\t\t}  \r\n");
      out.write("\t     \t</script>\r\n");
      out.write("\t     \t<center>\r\n");
      out.write("\t     \t<form action=\"edita_caixa.jsp\">\r\n");
      out.write("\t     \t<h2>Caixa:</h2>\r\n");
      out.write("\t     \t<table cellspacing=\"1\" cellpadding=\"1\" border=\"3\"> \r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t");

	     	CaixaDAO dao = new CaixaDAO();
	     	Caixa caixa;
	     	int idCaixa = 0; 	
	     	if(request.getParameter("idCaixa") != null){
	     		idCaixa = Integer.parseInt(request.getParameter("idCaixa"));
	     	}
	     	caixa = dao.getCaixa(idCaixa);
	     	
	     	ClienteDAO cdao = new ClienteDAO();
	     	Cliente cliente;
	     	cliente = cdao.getCliente(caixa.getIdCliente());
	     	
			String patrimonio = caixa.getPatrimonio();
			int idContato = caixa.getIdContato();
			ContatoDAO contdao = new ContatoDAO();
			Contato contato = contdao.getContato(idContato);
			
	     	
      out.write("\r\n");
      out.write("\t     \t<td><center>Especialidade:</center></td>\r\n");
      out.write("\t     \t<td>");
      out.print(idCaixa);
      out.write(' ');
      out.write('-');
      out.write(' ');
      out.print(caixa.getCaixa());
      out.write("</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td><center>Cliente:</center></td>\r\n");
      out.write("\t     \t<td>");
      out.print(cliente.getIdCliente() + " - " + cliente.getFantasia());
      out.write(" </td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td><center>Sigla do patrimônio:</center> </td>\r\n");
      out.write("\t     \t<td> ");
      out.print(patrimonio);
      out.write(" </td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td><center>Responsável:</center> </td>\r\n");
      out.write("\t     \t<td> ");
      out.print(contato.getNome());
      out.write(" </td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t</table>\r\n");
      out.write("\t      \t<br>\r\n");
      out.write("\t      \t<br>\r\n");
      out.write("\t\t\t<input type=\"hidden\" value=\"");
      out.print(idCaixa );
      out.write("\" name=\"idCaixa\" />\r\n");
      out.write("\t      \t<input type=\"submit\" value=\"Editar\" />\t\r\n");
      out.write("\t      \t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<form action=\"adiciona_caixa_has_produtos.jsp?idCaixa=");
      out.print(idCaixa);
      out.write("\">\r\n");
      out.write("\t     \t<h2>Itens:</h2>\r\n");
      out.write("\t     \t<table cellspacing=\"1\" cellpadding=\"1\" border=\"3\"> \r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\tCódigo\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\tProduto\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\tQuantidade\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\tPatrimônio do Item\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t");

	     		Caixa_has_ProdutosDAO chpdao = new Caixa_has_ProdutosDAO();
	     		     	List<Caixa_has_Produtos> chps = chpdao.getCHPsOS(idCaixa);
	     		     	
	     		     	ProdutoDAO pdao = new ProdutoDAO();
	     		     	
	     		     	for(Caixa_has_Produtos chp : chps){
	     		     		Produto p = pdao.getProduto(chp.getIdProduto());
	     	
      out.write("\r\n");
      out.write("\t     \t<td>");
      out.print( p.getIdProduto());
      out.write("</td>\r\n");
      out.write("\t     \t<td>");
      out.print( p.getDescricao());
      out.write("</td>\r\n");
      out.write("\t     \t<td>");
      out.print( chp.getQuantidade());
      out.write("</td>\r\n");
      out.write("<!--     \t<td>R$ ");
      out.print( p.getValor()*chp.getQuantidade());
      out.write("</td> !-->\r\n");
      out.write("\t     \t");
if(chp.getPatrimonio()!=null){
      out.write("\r\n");
      out.write("\t     \t\t<td>");
      out.print( chp.getPatrimonio());
      out.write("</td>\r\n");
      out.write("\t     \t");
}else{
      out.write("\r\n");
      out.write("\t     \t\t<td></td>\r\n");
      out.write("\t     \t");
}
      out.write("\r\n");
      out.write("\t     \t<td><a href=\"edita_caixa_has_produtos.jsp?idCaixa_has_Produtos=");
      out.print(chp.getIdCaixa_has_Produtos());
      out.write("\">Editar</a></td>\r\n");
      out.write("\t     \t<td><a href=javascript:confirmExclusao(");
      out.print(chp.getIdCaixa_has_Produtos());
      out.write(',');
      out.print(idCaixa);
      out.write(")>Remover</a></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t");

	     	}
	     	
      out.write("\r\n");
      out.write("\t     \t</table>\r\n");
      out.write("\t      \t<br>\r\n");
      out.write("\t      \t<br>\r\n");
      out.write("\t      \t<input type=\"hidden\" value=\"");
      out.print(idCaixa);
      out.write("\" name=\"idCaixa\" />\r\n");
      out.write("\t      \t<input type=\"hidden\" value=\"on\" name=\"patrimonioCliente\" />\t\t\t\t\r\n");
      out.write("\t      \t<input type=\"submit\" value=\"Adicionar\" />\t\t\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t    </center>         \r\n");
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
