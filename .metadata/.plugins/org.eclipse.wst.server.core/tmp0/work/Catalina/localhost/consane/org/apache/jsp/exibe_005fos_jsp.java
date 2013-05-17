package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;

public final class exibe_005fos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style type=\"text/css\">\r\n");
      out.write("#apDiv1 {\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\twidth:152px;\r\n");
      out.write("\theight:92px;\r\n");
      out.write("\tz-index:1;\r\n");
      out.write("\tleft: 15px;\r\n");
      out.write("\ttop: 18px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("#apDiv2 {\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\twidth:153px;\r\n");
      out.write("\theight:106px;\r\n");
      out.write("\tz-index:2;\r\n");
      out.write("\tleft: 530px;\r\n");
      out.write("\ttop: 18px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("#apDiv2 p {\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tcolor: #FFF;\r\n");
      out.write("}\r\n");
      out.write("#apDiv1 p {\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write("#apDiv3 {\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\twidth:153px;\r\n");
      out.write("\theight:106px;\r\n");
      out.write("\tz-index:2;\r\n");
      out.write("\tleft: 363px;\r\n");
      out.write("\ttop: 17px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".H {\r\n");
      out.write("\tcolor: #FFF;\r\n");
      out.write("}\r\n");
      out.write("#apDiv3 p a {\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write("#apDiv2 p a {\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("#apDiv4 {\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\twidth:153px;\r\n");
      out.write("\theight:106px;\r\n");
      out.write("\tz-index:2;\r\n");
      out.write("\tleft: 699px;\r\n");
      out.write("\ttop: 18px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("#apDiv4 p a {\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("#apDiv5 {\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\twidth:153px;\r\n");
      out.write("\theight:106px;\r\n");
      out.write("\tz-index:2;\r\n");
      out.write("\tleft: 871px;\r\n");
      out.write("\ttop: 18px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("#apDiv5 p a {\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("#apDiv6 {\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\twidth:138px;\r\n");
      out.write("\theight:110px;\r\n");
      out.write("\tz-index:2;\r\n");
      out.write("\tleft: 1041px;\r\n");
      out.write("\ttop: 17px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("#apDiv6 p a {\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("#apDiv7 {\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\twidth:153px;\r\n");
      out.write("\theight:106px;\r\n");
      out.write("\tz-index:2;\r\n");
      out.write("\tleft: 191px;\r\n");
      out.write("\ttop: 12px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write(" \r\n");
      out.write("\t     <body>\r\n");
      out.write("\r\n");
      out.write("\t     <p>\r\n");
      out.write("\t       <script>\r\n");
      out.write("\t     \tfunction confirmExclusao(id) {  \r\n");
      out.write("\t\t\t\tif (confirm(\"Tem certeza que deseja excluir esse item da OS?\")) {  \r\n");
      out.write("\t\t\t\t\tlocation.href=\"removeOS_has_Produtos?idOS_has_Produtos=\"+id;  \r\n");
      out.write("\t\t\t\t}  \t\r\n");
      out.write("\t\t\t} \r\n");
      out.write("\t     \t</script>\r\n");
      out.write("\t\t      ");

	     	OSDAO dao = new OSDAO();
	     	OS os;
	     	int idOS = 0;
	     	System.out.println(request.getParameter("idOS"));
	     	if(request.getParameter("idOS") != null){
	     		idOS = Integer.parseInt(request.getParameter("idOS"));
	     	}
	     	os = dao.getOS(idOS);
	     	
	     	ClienteDAO cdao = new ClienteDAO();
	     	Cliente cliente;
	     	cliente = cdao.getCliente(os.getIdCliente());
	     	
			Condicao_PagamentoDAO cpdao = new Condicao_PagamentoDAO();
			Condicao_Pagamento cp = cpdao.getCond(os.getIdCondicao_Pagamento());
			
			CaixaDAO cadao = new CaixaDAO();
			Caixa caixa = cadao.getCaixa(os.getIdCaixa());
			
			CorDAO cordao = new CorDAO();
			Cor cor1 = cordao.getCor(os.getIdCor1());
			Cor cor2 = cordao.getCor(os.getIdCor2());
			Cor cor3 = cordao.getCor(os.getIdCor3());
			
			String dataLancamento = os.getDataLancamento();
			String dataEntrega = os.getDataEntrega();
			String observacao = os.getObservacao();
			String status = os.getStatus();
			
	     	
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("\t     </p>\r\n");
      out.write("\t     <div id=\"apDiv3\">\r\n");
      out.write("\t       <p><a href=\"imprime_os.jsp?idOS=");
      out.print(idOS);
      out.write("\" target=\"_blank\"><img src=\"imprimantcleansze.jpg\" alt=\"\" width=\"65\" height=\"65\" border=\"0\"></a></p>\r\n");
      out.write("\t       <p><a href=\"imprime_os.jsp?idOS=");
      out.print(idOS);
      out.write("\" target=\"_blank\">IMPRIMIR OS</a></p>\r\n");
      out.write("         </div>\r\n");
      out.write("\t     <p>&nbsp;</p>\r\n");
      out.write("\t\t ");
if(os.getStatus().equals("Concluída")==true){
      out.write("\t    \r\n");
      out.write("\t     <div id=\"apDiv6\">\r\n");
      out.write("\t       <p> \r\n");
      out.write("\t       \t\t<a href=\"editaOS?idOS=");
      out.print(os.getIdOS());
      out.write("&cliente=");
      out.print(os.getIdCliente());
      out.write("&dataLancamento=");
      out.print(os.getDataLancamento());
      out.write("&dataEntrega=");
      out.print(os.getDataEntrega());
      out.write("&condicao_pagamento=");
      out.print(os.getIdCondicao_Pagamento());
      out.write("&observacao=");
      out.print(os.getObservacao());
      out.write("&ordenar=");
      out.print(os.getOrdenar());
      out.write("&status=Em Andamento\"> <img src=\"reload.png\" alt=\" \" width=\"78\" height=\"78\" border=\"0\"><br>\r\n");
      out.write("\t         \t\t<br>\r\n");
      out.write("           \t\t\tREABRIR OS\r\n");
      out.write("           \t\t</a>\r\n");
      out.write("           </p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
      out.write("\t     <p>&nbsp;</p>\r\n");
      out.write("\t     <a href=\"imprime_protocolo.jsp?idOS=");
      out.print(idOS);
      out.write("\" target=\"_blank\">\r\n");
      out.write("      \t\t<div id=\"apDiv1\">\r\n");
      out.write("\t    \t<p>\r\n");
      out.write("\t    \t\t<img src=\"IMAGEM DOCUMENTO.png\" width=\"54\" height=\"54\" border=\"0\"></p>\r\n");
      out.write("\t     \t<p>PROTOCOLO DE ENTREGA</p>\r\n");
      out.write("\t    \t</div>\r\n");
      out.write("\t    </a>\r\n");
      out.write("\t    ");
if(os.getStatus().equals("Aguardando Aprovação") && os.getStatus().equals("Concluída")==false){
      out.write("\r\n");
      out.write("\t     <div id=\"apDiv4\">\r\n");
      out.write("\t       <p>\r\n");
      out.write("\t\t       <a href=\"editaOS?idOS=");
      out.print(os.getIdOS());
      out.write("&cliente=");
      out.print(os.getIdCliente());
      out.write("&dataLancamento=");
      out.print(os.getDataLancamento());
      out.write("&dataEntrega=");
      out.print(os.getDataEntrega());
      out.write("&condicao_pagamento=");
      out.print(os.getIdCondicao_Pagamento());
      out.write("&observacao=");
      out.print(os.getObservacao());
      out.write("&ordenar=");
      out.print(os.getOrdenar());
      out.write("&status=Em Andamento\">\r\n");
      out.write("\t\t       \t  <img src=\"aprovado.jpg\" alt=\" \" width=\"56\" height=\"67\" border=\"0\">\r\n");
      out.write("\t       </p>\r\n");
      out.write("\t       <p>\r\n");
      out.write("\t       \t\tAPROVAR\r\n");
      out.write("\t       \t\t</a>\r\n");
      out.write("\t       \t</p>\r\n");
      out.write("         </div>\r\n");
      out.write("        ");
}
      out.write("\r\n");
      out.write("        ");
if (os.getStatus().equals("Concluída")==false){
      out.write(" \r\n");
      out.write("\t     <div id=\"apDiv5\">\r\n");
      out.write("\t       <p>\r\n");
      out.write("\t\t\t<a href=\"editaOS?idOS=");
      out.print(os.getIdOS());
      out.write("&cliente=");
      out.print(os.getIdCliente());
      out.write("&dataLancamento=");
      out.print(os.getDataLancamento());
      out.write("&dataEntrega=");
      out.print(os.getDataEntrega());
      out.write("&condicao_pagamento=");
      out.print(os.getIdCondicao_Pagamento());
      out.write("&observacao=");
      out.print(os.getObservacao());
      out.write("&ordenar=");
      out.print(os.getOrdenar());
      out.write("&status=Concluída\">\r\n");
      out.write("\t\t\t\t<img src=\"concluir.png\" alt=\" \" width=\"71\" height=\"71\" border=\"0\">\r\n");
      out.write("\t\t   </p>\r\n");
      out.write("\t       <p>CONCLUIR OS\r\n");
      out.write("\t       </a>\r\n");
      out.write("\t       </p>\r\n");
      out.write("         </div>\r\n");
      out.write("         ");
}
      out.write("\r\n");
      out.write("         ");
if(os.getStatus().equals("Aguardando Aprovação")==false && os.getStatus().equals("Concluída")==false){
      out.write("\r\n");
      out.write("         <div id=\"apDiv2\">\r\n");
      out.write("         <a href=\"editaOS?idOS=");
      out.print(os.getIdOS());
      out.write("&cliente=");
      out.print(os.getIdCliente());
      out.write("&dataLancamento=");
      out.print(os.getDataLancamento());
      out.write("&dataEntrega=");
      out.print(os.getDataEntrega());
      out.write("&condicao_pagamento=");
      out.print(os.getIdCondicao_Pagamento());
      out.write("&observacao=");
      out.print(os.getObservacao());
      out.write("&ordenar=");
      out.print(os.getOrdenar());
      out.write("&status=Aguardando Aprovação\">\r\n");
      out.write("   \t\t\t<p>\r\n");
      out.write("\t\t\t\t<img src=\"hb.png\" width=\"65\" height=\"65\" border=\"0\">\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("    \t\t<p>AGUARDAR APROVAÇÃO</p></a>\r\n");
      out.write("    \t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t \t");
}
      out.write("\r\n");
      out.write("\t \t<div id=\"apDiv7\">\r\n");
      out.write("\t \t  <p><img src=\"laudo-avaliacao.jpg\" width=\"105\" height=\"90\"></p>\r\n");
      out.write("\t \t  <p><a href=\"exibe_laudo.jsp?idOS=");
      out.print(idOS);
      out.write("\" target=\"_blank\">IMPRIMIR LAUDO</a></p>\r\n");
      out.write(" \t     </div>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("\t     <p>&nbsp; </p>\r\n");
      out.write("\t\t    <form action=\"edita_os.jsp\">\r\n");
      out.write("\t     \t<h2>Ordem de Serviço:</h2>\r\n");
      out.write("\t     \t<table cellspacing=\"1\" cellpadding=\"1\" border=\"3\"> \r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td><center>Código da OS:</center></td>\r\n");
      out.write("\t     \t<td>");
      out.print(idOS);
      out.write("</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td><center>Status:</center></td>\r\n");
      out.write("\t     \t<td>");
      out.print(status);
      out.write("</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td><center>Cliente:</center></td>\r\n");
      out.write("\t     \t<td> ");
      out.print(cliente.getIdCliente() + "-" + cliente.getFantasia());
      out.write(" </td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td><center>Data de Lançamento:</center> </td>\r\n");
      out.write("\t     \t<td> ");
      out.print(dataLancamento);
      out.write(" </td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td><center>Data de Entrega: </center></td>\r\n");
      out.write("\t     \t<td>");
      out.print(dataEntrega );
      out.write("</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td><center>Condição de Pagamento: </center></td>\r\n");
      out.write("\t     \t<td>");
      out.print(cp.getCondicao_pagamento());
      out.write("</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td><center>Especialidade: </center></td>\r\n");
      out.write("\t     \t<td>");
      out.print(caixa.getCaixa() );
      out.write("</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td><center>Patrimônio: </center></td>\r\n");
      out.write("\t     \t<td>");
      out.print(caixa.getPatrimonio() );
      out.write("</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t");
if (cor1.getCor()!=null && cor1.getCor().equals("")==false){
      out.write("\r\n");
      out.write("\t\t     \t<tr>\r\n");
      out.write("\t\t     \t<td><center>Cor 1: </center></td>\r\n");
      out.write("\t\t     \t<td>");
      out.print(cor1.getCor() );
      out.write("</td>\r\n");
      out.write("\t\t     \t</tr>\r\n");
      out.write("\t\t    ");
}
      out.write('\r');
      out.write('\n');
if (cor2.getCor()!=null && cor2.getCor().equals("")==false){
      out.write("\r\n");
      out.write("\t\t     \t<tr>\r\n");
      out.write("\t\t     \t<td><center>Cor 2: </center></td>\r\n");
      out.write("\t\t     \t<td>");
      out.print(cor2.getCor() );
      out.write("</td>\r\n");
      out.write("\t\t     \t</tr>\r\n");
      out.write("\t\t    ");
}
      out.write('\r');
      out.write('\n');
if (cor3.getCor()!=null && cor3.getCor().equals("")==false){
      out.write("\r\n");
      out.write("\t\t     \t<tr>\r\n");
      out.write("\t\t     \t<td><center>Cor 3: </center></td>\r\n");
      out.write("\t\t     \t<td>");
      out.print(cor3.getCor() );
      out.write("</td>\r\n");
      out.write("\t\t     \t</tr>\r\n");
      out.write("\t\t    ");
}
      out.write('\r');
      out.write('\n');
if (observacao!=null && observacao.equals("")==false){
      out.write("\r\n");
      out.write("\t\t     \t<tr>\r\n");
      out.write("\t\t     \t<td><center>Observação:</center></td>\r\n");
      out.write("\t\t\t\t<td> ");
      out.print(observacao);
      out.write(" </td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<input type=\"hidden\" value=\"");
      out.print(idOS );
      out.write("\" name=\"idOS\" />\r\n");
      out.write("\t\t\t");
 if (os.getStatus().equals("Concluída")==false){
      out.write("\r\n");
      out.write("\t      \t\t<input type=\"submit\" value=\"Editar\" />\t\r\n");
      out.write("\t      \t");
}
      out.write("\r\n");
      out.write("      \t </form>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t      \t<br>\r\n");
      out.write("\t\t\t<form action=\"adiciona_os_has_produtos.jsp?idOS=1&idCliente=1\">\r\n");
      out.write("\t     \t<h2>Itens:</h2>\r\n");
      out.write("\t     \t<table cellspacing=\"1\" cellpadding=\"1\" border=\"3\"> \r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\tCódigo\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\tInstrumento\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\tQuantidade\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("<!--     \t\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t     \t\tValor\r\n");
      out.write("\t     \t</td> \r\n");
      out.write("!-->\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\tPatrimônio\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("<!--\t     \t<td>\r\n");
      out.write("\t     \t\tConserto\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("!-->\t     \t<td>\r\n");
      out.write("\t     \t\tQuantidade sem conserto\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("<!--\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t\tMotivos\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("!-->\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t");

	     	OS_has_ProdutosDAO hhsdao = new OS_has_ProdutosDAO();
	     	List<OS_has_Produtos> ohps = hhsdao.getOHPsOS(idOS);
	     	
	     	ProdutoDAO pdao = new ProdutoDAO();
	     	MotivoDAO mdao = new MotivoDAO();
	     	
	     	List<OS_has_Produtos> ohpsOrd = ohps;
			if(os.getOrdenar().equals("instr_c")){
		     	Collections.sort (ohpsOrd, new Comparator() {  
					public int compare(final Object o1, final Object o2) {
						final ProdutoDAO pdao = new ProdutoDAO();
						final OS_has_Produtos ohp1 = (OS_has_Produtos) o1; 
						final OS_has_Produtos ohp2 = (OS_has_Produtos) o2; 
						final String nomeP1 = pdao.getProduto(ohp1.getIdProduto()).getDescricao();
						final String nomeP2 = pdao.getProduto(ohp2.getIdProduto()).getDescricao();
						if(nomeP1!=null & nomeP2!=null)
							return nomeP1.compareTo(nomeP2);
						else
							return 0;
					}
				}
				);
			}else if(os.getOrdenar().equals("instr_d")){
		     	Collections.sort (ohpsOrd, new Comparator() {  
					public int compare(final Object o1, final Object o2) {
						final ProdutoDAO pdao = new ProdutoDAO();
						final OS_has_Produtos ohp1 = (OS_has_Produtos) o1; 
						final OS_has_Produtos ohp2 = (OS_has_Produtos) o2; 
						final String nomeP1 = pdao.getProduto(ohp1.getIdProduto()).getDescricao();
						final String nomeP2 = pdao.getProduto(ohp2.getIdProduto()).getDescricao();
						if(nomeP1!=null & nomeP2!=null)
							return nomeP2.compareTo(nomeP1);
						else
							return 0;
					}
				}
				);
			}else if(os.getOrdenar().equals("patr_c")){
		     	Collections.sort (ohpsOrd, new Comparator() {  
					public int compare(final Object o1, final Object o2) {
						final ProdutoDAO pdao = new ProdutoDAO();
						final OS_has_Produtos ohp1 = (OS_has_Produtos) o1; 
						final OS_has_Produtos ohp2 = (OS_has_Produtos) o2; 
						final String nomeP1 = ohp1.getPatrimonio();
						final String nomeP2 = ohp2.getPatrimonio();
						if(nomeP1!=null & nomeP2!=null)
							return nomeP1.compareTo(nomeP2);
						else
							return 0;
					}
				}
				);
			}else if(os.getOrdenar().equals("patr_d")){
		     	Collections.sort (ohpsOrd, new Comparator() {  
					public int compare(final Object o1, final Object o2) {
						final ProdutoDAO pdao = new ProdutoDAO();
						final OS_has_Produtos ohp1 = (OS_has_Produtos) o1; 
						final OS_has_Produtos ohp2 = (OS_has_Produtos) o2; 
						final String nomeP1 = ohp1.getPatrimonio();
						final String nomeP2 = ohp2.getPatrimonio();
						if(nomeP1!=null & nomeP2!=null)
							return nomeP2.compareTo(nomeP1);
						else
							return 0;
					}
				}
				);			
			}
	     	
	     	for(OS_has_Produtos ohp : ohpsOrd){
	     		ProdutoDAO proddao = new ProdutoDAO();
	     		Produto p = proddao.getProduto(ohp.getIdProduto());
	     		if(p.getUltimo()==1)
	     			Collections.swap(ohpsOrd, ohpsOrd.indexOf(ohp), ohpsOrd.size()-1); 
	     	}
	     	
	     	for(OS_has_Produtos ohp : ohpsOrd){
	     		Produto p = pdao.getProduto(ohp.getIdProduto());
	     		Motivo m = mdao.getMotivo(ohp.getIdMotivo());
	     		System.out.println("OS has Produtos: " + ohps.size());	     	
	     	
      out.write("\r\n");
      out.write("\t     \t<td>");
      out.print( p.getIdProduto());
      out.write("</td>\r\n");
      out.write("\t     \t<td>");
      out.print( p.getDescricao());
      out.write("</td>\r\n");
      out.write("\t     \t<td>");
      out.print( ohp.getQuantidade());
      out.write("</td>\r\n");
      out.write("<!-- \t     \t\r\n");
      out.write("\t     \t<td>R$ ");
      out.print( p.getValor()*ohp.getQuantidade());
      out.write("</td>\r\n");
      out.write("!--> \r\n");
      out.write("\t     \t<td>");
      out.print( ohp.getPatrimonio());
      out.write("</td>\r\n");
      out.write("<!--\t     \t<td>");
      out.print( ohp.getConserto());
      out.write("</td> !-->\r\n");
      out.write("\t     \t<td>");
      out.print( ohp.getQuebrado_qtd());
      out.write("</td>\r\n");
      out.write("<!--\t     \t\r\n");
      out.write("\t\t\t");
 if (m != null && m.getMotivo()!=null){ 
      out.write("\r\n");
      out.write("\t     \t\t<td>");
      out.print( m.getMotivo());
      out.write("</td>\r\n");
      out.write("\t     \t");
 }else { 
      out.write("\r\n");
      out.write("\t     \t\t<td></td>\r\n");
      out.write("\t     \t");
 }
      out.write("\r\n");
      out.write("!--> \t     \t\r\n");
      out.write("\t     \t<td><a href=\"edita_os_has_produtos.jsp?idOsHasProdutos=");
      out.print(ohp.getIdOS_has_produtos());
      out.write("&idCliente=");
      out.print(os.getIdCliente());
      out.write("\">Editar</a></td>\r\n");
      out.write("\t     \t<td><a href=javascript:confirmExclusao(");
      out.print(ohp.getIdOS_has_produtos());
      out.write(")>Remover</a></td>\r\n");
      out.write("\t     \t<td><a href=\"adiciona_sem_conserto_pre.jsp?idOsHasProdutos=");
      out.print(ohp.getIdOS_has_produtos());
      out.write("&quantidade=");
      out.print(ohp.getQuantidade());
      out.write("\">Sem conserto</a></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t");

	     	}
	     	
      out.write("\r\n");
      out.write("\t     \t</table>\t\t\r\n");
      out.write("\t      \t<input type=\"hidden\" value=\"");
      out.print(idOS);
      out.write("\" name=\"idOS\" />\r\n");
      out.write("\t      \t<input type=\"hidden\" value=\"");
      out.print(os.getIdCliente());
      out.write("\" name=\"idCliente\" />\r\n");
      out.write("\t      \t");
 if (os.getStatus().equals("Concluída")==false) {
      out.write("\r\n");
      out.write("\t      \t\t<input type=\"submit\" value=\"Adicionar\" />\t\t\r\n");
      out.write("\t      \t");
}
      out.write("\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("</center>\t\t\t                   \r\n");
      out.write("   \t</body>\r\n");
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
