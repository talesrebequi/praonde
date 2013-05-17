package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;

public final class relatorio_005fpedidos_005ffornecedor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("  \r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Relatório de pedidos</title>\r\n");


java.text.NumberFormat nf = java.text.NumberFormat.getNumberInstance();
nf.setMinimumFractionDigits(2);
nf.setMaximumFractionDigits(2);

int idFornecedor = Integer.parseInt(request.getParameter("fornecedor"));
String mes = request.getParameter("mes");
String ano = request.getParameter("ano");
String dataDe = "01/"+mes+"/"+ano;
System.out.println("DataDe:" + dataDe);
String dataAte = "31/"+mes+"/"+ano;
System.out.println("DataAte:" + dataAte);
PedidoDAO pdao = new PedidoDAO();
List<Pedido> pedidos = pdao.getRelatorioFornecedorData(dataDe, dataAte, idFornecedor);
for (Pedido p : pedidos){
	System.out.println("IDPedido da lista: " + p.getIdPedido());
}

PagamentosDAO pagDAO = new PagamentosDAO();
List<Pagamentos> pagamentos = new ArrayList<Pagamentos>();


      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body p {\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("}\r\n");
      out.write("body p {\r\n");
      out.write("\tfont-size: 36px;\r\n");
      out.write("}\r\n");
      out.write("body p {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("body p {\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("body p {\r\n");
      out.write("\tfont-size: 24px;\r\n");
      out.write("}\r\n");
      out.write("table {\r\n");
      out.write("\ttext-align: right;\r\n");
      out.write("}\r\n");
      out.write("#xxxx {\r\n");
      out.write("}\r\n");
      out.write("#xxxx {\r\n");
      out.write("}\r\n");
      out.write("#xxxx {\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<table width=\"904\" border=\"1\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td colspan=\"6\" bgcolor=\"#FFFFFF\"><p>CONSANE REPRESENTAÇÕES LTDA</p>\r\n");
      out.write("    <p><a href=\"javaScript:window.print()\">RELATÓRIO DE PEDIDOS</a></p>\r\n");
      out.write("    <p>&nbsp;</p></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("  <td align=\"center\">\r\n");
      out.write("  Cliente\r\n");
      out.write("  </td>\r\n");
      out.write("  <td align=\"center\">\r\n");
      out.write("  Número do Pedido\r\n");
      out.write("  </td>\r\n");
      out.write("  <td align=\"center\">\r\n");
      out.write("  Número Cliente\r\n");
      out.write("  </td>\r\n");
      out.write("  <td align=\"center\">\r\n");
      out.write("  Data\r\n");
      out.write("  </td>\r\n");
      out.write("  <td align=\"center\">\r\n");
      out.write("  Valor Pedido\r\n");
      out.write("  </td>\r\n");
      out.write("  <td align=\"center\">\r\n");
      out.write("  Pagamentos\r\n");
      out.write("  </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
for (Pedido p:pedidos){
    ClienteDAO cdao = new ClienteDAO();
  	Cliente cli = cdao.getCliente(p.getIdCliente());
  	
  	pagamentos = pagDAO.getPagamentoDe(p.getIdPedido());
  	float totalPago = 0;
  	String pags = "";
  	System.out.println("Tamanho de pag" + pagamentos.size());
  	for(Pagamentos pag : pagamentos){
  		totalPago = totalPago + pag.getValorPago();
  		if(pags == "")
  			pags = pag.getDataPagamento() + " - " + pag.getValorPago();
  		else
  			pags = pags + " / " + pag.getDataPagamento() + " - " + pag.getValorPago();
  	}
  	System.out.println("Pags:" + pags);
  	System.out.println("Total Pago:" + totalPago);
  	System.out.println("Valor Liquido:" + Math.rint(100*p.getValorLiquido())/100);
  	if(Math.rint(totalPago*100)/100 == Math.rint(100*p.getValorLiquido())/100){
  
      out.write("\r\n");
      out.write("  \t<tr bgcolor=PaleGreen>\r\n");
      out.write("  ");
}else{
      out.write("\r\n");
      out.write("  \t<tr>\r\n");
      out.write("  ");
}
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  <td align=\"center\">\r\n");
      out.write("  ");
      out.print(cli.getFantasia());
      out.write("\r\n");
      out.write("  </td>\r\n");
      out.write("  <td align=\"center\">\r\n");
      out.write("  ");
      out.print(p.getIdPedido());
      out.write("\r\n");
      out.write("  </td>\r\n");
      out.write("  <td align=\"center\">\r\n");
      out.write("  ");
      out.print(p.getCodiCliente());
      out.write("\r\n");
      out.write("  </td>\r\n");
      out.write("  <td align=\"center\">\r\n");
      out.write("  ");
      out.print(p.getDataEmissao());
      out.write("\r\n");
      out.write("  </td>\r\n");
      out.write("  <td align=\"center\">\r\n");
      out.write("  R$ ");
      out.print(nf.format(p.getValorLiquido()));
      out.write("\r\n");
      out.write("  </td>\r\n");
      out.write("  <td align=\"center\">\r\n");
      out.write("  ");
      out.print(pags);
      out.write("\r\n");
      out.write("  </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
}
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("  <p>&nbsp;</p>\r\n");
      out.write("\r\n");
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
