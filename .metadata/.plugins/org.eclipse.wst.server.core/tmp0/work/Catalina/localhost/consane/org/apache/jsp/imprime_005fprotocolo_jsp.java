package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;

public final class imprime_005fprotocolo_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\t\r\n");
      out.write("\t<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t<title>Protocolo de Entrega</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t\r\n");
      out.write("\t");

	
		int idOS = Integer.parseInt(request.getParameter("idOS"));
		
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
		
		Caixa_has_ProdutosDAO chpdao = new Caixa_has_ProdutosDAO();
		
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
      out.write("\t\r\n");
      out.write("\t<body>\r\n");
      out.write("\t<table width=\"1093\" border=\"1\" bordercolor=\"WHITE\">\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t    <td width=\"721\">\r\n");
      out.write("\t    \t<img src=\"logo.png\" width=\"90\" height=\"90\" />\r\n");
      out.write("\t    </td>\r\n");
      out.write("\t    <td width=\"472\" align=\"center\" valign=\"baseline\" >\r\n");
      out.write("\t    \t<h4>\r\n");
      out.write("\t    \t\t");
      out.print(os.getIdOS());
      out.write(" - Data: ");
      out.print(os.getDataLancamento());
      out.write("\r\n");
      out.write("\t    \t</h4>\r\n");
      out.write("\t    </td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t    <td height=\"20\"><h3>HOSPITAL DOS INSTRUMENTOS CIRÚRGICOS</h3></td>\r\n");
      out.write("\t    <td align=\"center\"><div>Protocolo de entrega de serviço</div>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<p>&nbsp;</p>\r\n");
      out.write("\t<table width=\"999\" border=\"1\" bordercolor=\"#000000\" align=\"center\">\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t    <td width=\"999\" align=\"center\" valign=\"middle\" bordercolor=\"#000000\"><center><strong>DADOS DO CLIENTE</strong></center></td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<table width=\"1092\" border=\"1\" bordercolor=\"#FFFFFF\" align=\"center\"> \r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t    <td width=\"570\" align=\"left\"> CLIENTE: ");
      out.print(cli.getFantasia());
      out.write("</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t  ");

	  	String endereco = "";
	  	if(cli.getRua()!=null){
	  		endereco = cli.getRua();
		  	if(cli.getNumero()!=null)
		  		endereco = endereco + ", " + cli.getNumero();
		}
	  	if(cli.getBairro()!=null)
	  		endereco = endereco + ", " + cli.getBairro();
	  	if(cli.getMunicipio()!=null)
	  		endereco = endereco + ", " + cli.getMunicipio();
	  
      out.write("\r\n");
      out.write("\t    <td align=\"left\"> ENDEREÇO: ");
      out.print(endereco);
      out.write("</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t    <td align=\"left\"> TELEFONE: ");
      out.print(cli.getTelefone());
      out.write("</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<div></div>\r\n");
      out.write("\t<div></div>\r\n");
      out.write("\t<div></div>\r\n");
      out.write("\t<div></div>\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<table width=\"1156\" border=\"1\" bordercolor=\"#FFFFFF\" align=\"center\">\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t    <td width=\"1146\" align=\"center\" valign=\"middle\" bordercolor=\"#FFFFFF\"> <strong>");
      out.print(caixa.getCaixa() + " " + os.getNumero_Caixa());
      out.write(' ');
      out.write('-');
      out.write(' ');
      out.print(cor1.getCor() + " " + cor2.getCor() + " " + cor3.getCor());
      out.write("</strong></td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<p>&nbsp;</p>\r\n");
      out.write("\t<table width=\"1054\" border=\"1\" bordercolor=\"#000000\" align=\"center\">\r\n");
      out.write("\t  <tr>\t\r\n");
      out.write("\t    <td width=\"1054\" align=\"center\" valign=\"middle\" bordercolor=\"#000000\"><center><strong>DADOS DO SERVIÇO</strong></center></td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<table width=\"1072\" border=\"1\" bordercolor=\"#000000\" align=\"center\">\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t    <td width=\"57\" align=\"center\">Item</td>\r\n");
      out.write("\t    <td width=\"71\" align=\"center\">Quant</td>\r\n");
      out.write("\t    <td width=\"602\" align=\"center\">Descrição das Peças</td>\r\n");
      out.write("\t    <td width=\"386\" align=\"center\">Observação</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t    <tr>\r\n");
      out.write("\t      <td height=\"20\" colspan=\"4\" align=\"center\">&nbsp;</td>\r\n");
      out.write("\t    </tr>\r\n");
      out.write("\t  ");

	  	for (OS_has_Produtos ohp : ohpsOrd){
	  		for(int i = 0; i<ohp.getQuantidade(); i ++){
	    		totalPecas++;
	    		sequenciaPecas++;
	    		ProdutoDAO pdao = new ProdutoDAO();
	    		Produto p = pdao.getProduto(ohp.getIdProduto());
	  
      out.write("\r\n");
      out.write("\t    <tr>\r\n");
      out.write("\t    <td width=\"57\" align=\"center\" height=\"20\">\r\n");
      out.write("\t    \t");
      out.print(sequenciaPecas);
      out.write("\r\n");
      out.write("\t    </td>\r\n");
      out.write("\t    <td width=\"71\" align=\"center\">\r\n");
      out.write("\t    \t1\r\n");
      out.write("\t    </td>\r\n");
      out.write("\t    <td width=\"602\" align=\"center\">\r\n");
      out.write("\t    \t");
      out.print(p.getDescricao());
      out.write("\r\n");
      out.write("\t    </td>\r\n");
      out.write("\t    <td width=\"386\" align=\"center\">\r\n");
      out.write("\t    ");

	    	boolean patrCli = false;
	    	List<Caixa_has_Produtos> chps = chpdao.getCHPsOS(os.getIdCaixa());    
	    	if(patrCli==false){
	    		for (Caixa_has_Produtos chp : chps){
	    			if (chp.getPatrimonio()!=null && chp.getPatrimonio().equals("")==false){
	    				patrCli  = true;
	    			}
	    		}
	    	}
	    	
	    	String strTotalPecas = Integer.toString(totalPecas);
	    	if(strTotalPecas.length()==1){
	    		strTotalPecas = "0"+strTotalPecas;
	    	}
	    	
	    	if (patrCli==false){
		
      out.write("\r\n");
      out.write("\t\t    \t");
      out.print(caixa.getPatrimonio() + " " + os.getNumero_Caixa()+"-"+strTotalPecas );
      out.write("\r\n");
      out.write("\t\t");
	
			}else{
		
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print(caixa.getPatrimonio() + " " + os.getNumero_Caixa()+"-"+ohp.getPatrimonio() );
      out.write("\r\n");
      out.write("\t\t    ");

		    }
		
      out.write("\r\n");
      out.write("\t    </td>\r\n");
      out.write("\t  \t</tr>\r\n");
      out.write("\t  ");
		
	  		}
	 	}
	  
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<table width=\"1083\" border=\"1\" bordercolor=\"white\" align=\"center\">\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t    <td width=\"57\" align=\"center\" height=\"20\"></td>\r\n");
      out.write("\t    <td width=\"71\" align=\"center\">");
      out.print(totalPecas);
      out.write("</td>\r\n");
      out.write("\t    <td width=\"602\" align=\"left\">Total de Peças</td>\r\n");
      out.write("\t    <td width=\"386\" align=\"center\"> Assinatura e Identifica&ccedil;&atilde;o do Recebedor </td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<table width=\"1087\" border=\"1\" bordercolor=\"#FFFFFF\" align=\"center\">\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t<!--    <td width=\"273\">Hospital dos Instrumentos Cirúrgicos</td> !-->\r\n");
      out.write("\t    <td width=\"1300\" align=\"right\"><p><br>\r\n");
      out.write("\t    \t\t___________________________________________</p></td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<p>&nbsp;</p>\r\n");
      out.write("\t</body>\r\n");
      out.write("\t</html>\r\n");
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
