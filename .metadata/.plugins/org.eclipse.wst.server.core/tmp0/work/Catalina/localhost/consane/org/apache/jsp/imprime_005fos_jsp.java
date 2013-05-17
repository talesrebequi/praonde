package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;

public final class imprime_005fos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Ordem de Serviço</title>\r\n");
      out.write("</head>\r\n");

	int idOS = Integer.parseInt(request.getParameter("idOS"));
	String sCor = "";
	
	OSDAO osdao = new OSDAO();
	OS os = osdao.getOS(idOS);
	
	ClienteDAO clidao = new ClienteDAO();
	Cliente cli = clidao.getCliente(os.getIdCliente());
	
	CaixaDAO caidao = new CaixaDAO();
	Caixa caixa = caidao.getCaixa(os.getIdCaixa());
	
	CorDAO cordao = new CorDAO();
	Cor cor1 = cordao.getCor(os.getIdCor1());
	Cor cor2 = cordao.getCor(os.getIdCor2());
	Cor cor3 = cordao.getCor(os.getIdCor3());
	
	OS_has_ProdutosDAO ohpdao = new OS_has_ProdutosDAO();
	List<OS_has_Produtos> ohps = ohpdao.getOHPsOS(idOS);
	
    List<OS_has_Produtos> ohpsOrd = ohps;
	if(os.getOrdenar().equals("Por Instrumento - Crescente")){
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
	}else if(os.getOrdenar().equals("Por Instrumento - Decrescente")){
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
	}else if(os.getOrdenar().equals("Por Patrimônio - Crescente")){
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
	}else if(os.getOrdenar().equals("Por Patrimônio - Decrescente")){
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
	
	int sequenciaPecas = 0;
	int totalPecas = 0;
	
 	for(OS_has_Produtos ohp : ohpsOrd){
 		ProdutoDAO proddao = new ProdutoDAO();
 		Produto p = proddao.getProduto(ohp.getIdProduto());
 		if(p.getUltimo()==1)
 			Collections.swap(ohpsOrd, ohpsOrd.indexOf(ohp), ohpsOrd.size()-1); 
 		if(p.getDuplo()==1)
 			totalPecas = totalPecas + ohp.getQuantidade();
 	}
	     		

      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<table width=\"1099\" border=\"1\" bordercolor=\"WHITE\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"721\"><img src=\"logo.png\" width=\"90\" height=\"90\" /></td>\r\n");
      out.write("    <td width=\"572\" align=\"center\" valign=\"baseline\" ><h3>ENTRADA  </h3></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"20\"><h3>HOSPITAL DOS INSTRUMENTOS CIRÚRGICOS</h3></td>\r\n");
      out.write("    <td align=\"center\"><div>");
      out.print(os.getIdOS());
      out.write(" -  Data: ");
      out.print(os.getDataLancamento());
      out.write("</div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
if(os.getDataEntrega()!=null){
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"20\"></td>\r\n");
      out.write("    <td align=\"center\"><div>Entrega: ");
      out.print(os.getDataEntrega());
      out.write("</div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
}
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("<table width=\"1094\" border=\"1\" bordercolor=\"#000000\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"1094\" align=\"center\" valign=\"middle\"><strong><center>DADOS DO CLIENTE</center></strong></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<br />\r\n");
      out.write("<table width=\"1093\" border=\"1\" bordercolor=\"#FFFFFF\" align=\"center\"> \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"1093\" align=\"left\">\r\n");
      out.write("\t\tCLIENTE: ");
      out.print(cli.getFantasia());
      out.write("\r\n");
      out.write("\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<br />\r\n");
      out.write("<div></div>\r\n");
      out.write("<div></div>\r\n");
      out.write("<div></div>\r\n");
      out.write("<div></div>\r\n");
      out.write("<br />\r\n");
      out.write("<br />\r\n");
      out.write("\r\n");
      out.write("<br />\r\n");
      out.write("<br />\r\n");
      out.write("<table width=\"816\" border=\"1\" bordercolor=\"black\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("  ");

  	if (cor1.getCor()!=null){
  		sCor = sCor + cor1.getCor();
  	}
  	if (cor2.getCor()!=null){
  		sCor = sCor + " " + cor2.getCor();
  	}
  	if (cor3.getCor()!=null){
  		sCor = sCor + " " + cor3.getCor();
  	}
  
      out.write("\r\n");
      out.write("    <td width=\"816\" align=\"center\" valign=\"middle\" bordercolor=\"black\"> <strong><center>");
      out.print(caixa.getCaixa() + " " + os.getNumero_Caixa());
      out.write(' ');
      out.write('-');
      out.write(' ');
      out.print(sCor );
      out.write("</center></strong></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("<table width=\"1090\" border=\"1\" bordercolor=\"#000000\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"1090\" align=\"center\" valign=\"middle\" bordercolor=\"#000000\"><strong><center>DADOS DO SERVIÇO</center></strong></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<br>\r\n");
      out.write("<table width=\"1084\" height=\"67\" border=\"1\" align=\"center\" bordercolor=\"#000000\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"57\" align=\"center\">Item</td>\r\n");
      out.write("    <td width=\"71\" align=\"center\">Quant</td>\r\n");
      out.write("    <td width=\"602\" align=\"center\">Descrição das Peças</td>\r\n");
      out.write("    <td width=\"193\" align=\"center\">Patrimônio</td>\r\n");
      out.write("    <td width=\"193\" align=\"center\">Observação</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr></tr>\r\n");
      out.write("  <tr></tr>\r\n");
      out.write("  <tr></tr>\r\n");
      out.write("  <tr></tr>\r\n");
      out.write("  <tr></tr>\r\n");
      out.write("  <tr></tr>\r\n");
      out.write("  <tr></tr>\r\n");
      out.write("  <tr></tr>\r\n");
      out.write("  \r\n");
      out.write("  ");
 
  	for (OS_has_Produtos ohp : ohpsOrd){ 
		ProdutoDAO pdao = new ProdutoDAO(); 
		Produto p = pdao.getProduto(ohp.getIdProduto()); 
		sequenciaPecas++; 
		totalPecas = totalPecas + ohp.getQuantidade(); 
  
      out.write(" \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"57\" align=\"center\" height=\"20\">\r\n");
      out.write("    \t");
      out.print(sequenciaPecas);
      out.write("\r\n");
      out.write("    </td>\r\n");
      out.write("    <td width=\"71\" align=\"center\">\r\n");
      out.write("    \t");
      out.print(ohp.getQuantidade());
      out.write("    \r\n");
      out.write("    </td>\r\n");
      out.write("    <td width=\"602\" align=\"center\">\r\n");
      out.write("\t\t");
      out.print(p.getDescricao());
      out.write("\r\n");
      out.write("    </td>\r\n");
      out.write("    <td width=\"193\" align=\"center\">\r\n");
      out.write("    \t");
      out.print(ohp.getPatrimonio() );
      out.write("\r\n");
      out.write("    </td>\r\n");
      out.write("    <td width=\"193\" align=\"center\">\r\n");
      out.write("    \t");
      out.print(ohp.getObservacao() );
      out.write("\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");

 	}
  
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<table width=\"1087\" border=\"1\" bordercolor=\"white\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"57\" align=\"center\" height=\"20\"></td>\r\n");
      out.write("    <td width=\"71\" align=\"center\">");
      out.print(totalPecas);
      out.write("</td>\r\n");
      out.write("    <td width=\"602\" align=\"left\">Total de Peças</td>\r\n");
      out.write("    <td width=\"386\" align=\"center\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("<!--\r\n");
      out.write("<table width=\"1146\" border=\"1\" bordercolor=\"#FFFFFF\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"273\">Hospital dos Instrumentos Cirúrgicos</td>\r\n");
      out.write("    <td width=\"821\" align=\"right\"> Assinatura e Identificação do Recebedor </td>\r\n");
      out.write("  </tr> \r\n");
      out.write("</table> \r\n");
      out.write("!-->\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
