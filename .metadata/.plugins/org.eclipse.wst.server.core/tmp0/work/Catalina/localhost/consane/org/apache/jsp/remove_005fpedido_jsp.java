package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;

public final class remove_005fpedido_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Pedido</title>\r\n");


java.text.NumberFormat nf = java.text.NumberFormat.getNumberInstance();
nf.setMinimumFractionDigits(2);
nf.setMaximumFractionDigits(2);

PedidoDAO pedDAO = new PedidoDAO();
Pedido pedido = pedDAO.getPedido(Integer.parseInt(request.getParameter("pedido")));

Pedido_has_ItensDAO phiDao = new Pedido_has_ItensDAO();
List<Pedido_has_Itens> phis = phiDao.getRefs(pedido.getIdPedido());

      Collections.sort (phis, new Comparator() {  
            public int compare(Object o1, Object o2) {  
                Pedido_has_Itens p1 = (Pedido_has_Itens) o1;  
                Pedido_has_Itens p2 = (Pedido_has_Itens) o2;
                ReferenciaDAO refdao = new ReferenciaDAO();
                Referencia ref1 = refdao.getReferencia(p1.getIdReferencia());
                Referencia ref2 = refdao.getReferencia(p2.getIdReferencia());                
                return ref1.getReferencia().compareTo(ref2.getReferencia());  
            }  
        });
        
FornecedorDAO fornecedorDao = new FornecedorDAO();
Fornecedor fornecedor = fornecedorDao.getFornecedor(pedido.getIdFornecedor());

ClienteDAO clienteDao = new ClienteDAO();
Cliente cliente = clienteDao.getCliente(pedido.getIdCliente());

String desconto = "";
if (pedido.getDesconto1()!=0.0){
	desconto = desconto + Double.toString(pedido.getDesconto1())+"%";
	if (pedido.getDesconto2()!=0.0){
		desconto = desconto +", "+ Double.toString(pedido.getDesconto2())+"%";
		if (pedido.getDesconto3()!=0.0){
			desconto = desconto +", "+ Double.toString(pedido.getDesconto3())+"%";
			if (pedido.getDesconto4()!=0.0){
				desconto = desconto +", "+ Double.toString(pedido.getDesconto4())+"%";
				if (pedido.getDesconto5()!=0.0){
					desconto = desconto +", "+ Double.toString(pedido.getDesconto5())+"%";
				}
			}
		}
	}
}


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
      out.write("\r\n");
      out.write("<form action=\"removePedido\">\r\n");
      out.write("\t\t\t<h3>Exclusão de pedidos</h3>\r\n");
      out.write("\t\t\t\t     \t\r\n");
      out.write("\t  \t\tTem certeza de que deseja excluir este pedido?\r\n");
      out.write("\t      \t<br>\r\n");
      out.write("\t      \t<br>\r\n");
      out.write("\t      \t<input type=\"hidden\" name=\"pedido\" value=\"");
      out.print(Integer.parseInt(request.getParameter("pedido")));
      out.write("\" />\r\n");
      out.write("\t      \t<input type=\"submit\" value=\"Excluir\" /> \r\n");
      out.write("\t\t\t\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<table width=\"904\" border=\"0\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td colspan=\"4\" bgcolor=\"#FFFFFF\"><p>CONSANE REPRESENTAÇÕES LTDA</p>\r\n");
      out.write("    <p><a href=\"javaScript:window.print()\">PEDIDO DE COMPRA</a></p>\r\n");
      out.write("    <p>&nbsp;</p></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td colspan=\"4\" bgcolor=\"#FFFFFF\"><center>\r\n");
      out.write("        <b>Fornecedor:</b>\r\n");
      out.write("    ");
      out.print(fornecedor.getDescricao() );
      out.write(" \r\n");
      out.write("    </center></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"174\"><b>Pedido Nº:</b></td>\r\n");
      out.write("    <td width=\"346\" align=\"left\">\r\n");
      out.write("      <span id=\"xxxx\">");
      out.print(pedido.getIdPedido() );
      out.write("</span>\r\n");
      out.write("    </td>\r\n");
      out.write("    <td width=\"78\">&nbsp;</td>\r\n");
      out.write("    <td width=\"288\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><b>Data:</b></td>\r\n");
      out.write("    <td id=\"xxxx\">");
      out.print(pedido.getDataEmissao() );
      out.write("</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td colspan=\"4\" bgcolor=\"#CCCCCC\" ><center>\r\n");
      out.write("      <strong>Empresa de Faturamento</strong>\r\n");
      out.write("    </center></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><b>Cliente:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getFantasia() );
      out.write("</td>\r\n");
      out.write("    ");
if (cliente.getBairro()!=null){ 
      out.write("\r\n");
      out.write("    <td><b>Bairro:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getBairro() );
      out.write("</td>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
if (cliente.getEndereco()!=null || cliente.getCep()!=null){ 
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("  \t");
if (cliente.getEndereco()!=null){ 
      out.write("\r\n");
      out.write("    <td><b>Endereço:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getEndereco() );
      out.write("</td>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("    ");
if (cliente.getCep()!=null){ 
      out.write("\r\n");
      out.write("    <td><b>CEP:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getCep() );
      out.write("</td>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
} 
      out.write("\r\n");
      out.write("  ");
 if(cliente.getCidade()!=null || cliente.getTelefone()!=null){ 
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    ");
if (cliente.getCidade()!=null){ 
      out.write("\r\n");
      out.write("    <td><b>Cidade:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getCidade() );
      out.write("</td>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("    ");
if (cliente.getTelefone()!=null){ 
      out.write("\r\n");
      out.write("    <td><b>Telefone:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getTelefone() );
      out.write("</td>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
} 
      out.write("\r\n");
      out.write("  ");
if (cliente.getCnpj()!=null || cliente.getContato()!=null){ 
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("  \t");
if (cliente.getCnpj()!=null){ 
      out.write("\r\n");
      out.write("    <td><b>CNPJ:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getCnpj() );
      out.write("</td>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("    ");
if (cliente.getContato()!=null){ 
      out.write("\r\n");
      out.write("    <td><b>Contato:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getContato() );
      out.write("</td>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
} 
      out.write("\r\n");
      out.write("  ");
if (cliente.getIe()!=null){ 
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><b>Insc. Est.:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getIe() );
      out.write("</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
} 
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("  ");
if (cliente.getCob_endereco()!=null && cliente.getCob_telefone()!=null && cliente.getCidade()!=null
	    && cliente.getCob_contato()!=null && cliente.getCob_bairro()!=null && cliente.getCob_email()!=null){ 
      out.write("\r\n");
      out.write("    <td colspan=\"4\" bgcolor=\"#CCCCCC\"><strong>\r\n");
      out.write("      <center>\r\n");
      out.write("        Cobrança\r\n");
      out.write("      </center>\r\n");
      out.write("    </strong></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("  \t");
if (cliente.getCob_endereco()!=null){ 
      out.write("\r\n");
      out.write("    <td><b>Endereço:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getCob_endereco() );
      out.write("</td>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("    ");
if (cliente.getCob_telefone()!=null){ 
      out.write("\r\n");
      out.write("    <td><b>Telefone:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getCob_telefone() );
      out.write("</td>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("  \t");
if (cliente.getCob_cidade()!=null){ 
      out.write("\r\n");
      out.write("    <td><b>Cidade:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getCidade() );
      out.write("</td>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("    ");
if (cliente.getCob_endereco()!=null){ 
      out.write("\r\n");
      out.write("    <td><b>Contato:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getContato() );
      out.write("</td>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("  \t");
if (cliente.getCob_bairro()!=null){ 
      out.write("\r\n");
      out.write("    <td><b>Bairro:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getCob_bairro() );
      out.write("</td>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("  \t");
if (cliente.getCob_email()!=null){ 
      out.write("\r\n");
      out.write("    <td><b>Email para Nfe:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getCob_email() );
      out.write("</td>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
} 
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td colspan=\"4\" bgcolor=\"#CCCCCC\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
 if (pedido.getCondicaoPagamento().equals("")==false){ 
      out.write("\r\n");
      out.write("  <tr >\r\n");
      out.write("    <td><b>Cond. Pagamento:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(pedido.getCondicaoPagamento() );
      out.write("</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
} 
      out.write("\r\n");
      out.write("  ");
if (pedido.getEntrega().equals("")==false){ 
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><b>Entrega:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(pedido.getEntrega() );
      out.write("</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
} 
      out.write("\r\n");
      out.write("  ");
if (desconto.equals("")==false){ 
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><b>Desconto:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(desconto );
      out.write("</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
} 
      out.write("\r\n");
      out.write("  ");
if (pedido.getObservacao().equals("			")==false){ 
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><b>Obs:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(pedido.getObservacao() );
      out.write("</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
} 
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<br>\r\n");
      out.write("<table width=\"905\" border=\"0\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"219\"><strong>\r\n");
      out.write("      <center>\r\n");
      out.write("        Referência\r\n");
      out.write("      </center>\r\n");
      out.write("    </strong></td>\r\n");
      out.write("    </b></b>\r\n");
      out.write("    <td width=\"196\"><strong>\r\n");
      out.write("      <center>\r\n");
      out.write("        Quantidade\r\n");
      out.write("      </center>\r\n");
      out.write("    </strong></td>\r\n");
      out.write("    <td width=\"221\"><strong>\r\n");
      out.write("      <center>\r\n");
      out.write("        Preço Líquido\r\n");
      out.write("      </center>\r\n");
      out.write("    </strong></td>\r\n");
      out.write("    <td width=\"251\"><strong>\r\n");
      out.write("      <center>\r\n");
      out.write("        Total\r\n");
      out.write("      </center>\r\n");
      out.write("    </strong></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");

  for (Pedido_has_Itens pedhasit : phis){ 
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("\t");

		ReferenciaDAO refDao = new ReferenciaDAO(); 
		Referencia referencia = refDao.getReferencia(pedhasit.getIdReferencia());
	  	String valor = nf.format(referencia.getValor());
	  	String total = nf.format(referencia.getValor()*pedhasit.getQuantidade());
  	
      out.write("\r\n");
      out.write("    <td align=\"center\">");
      out.print(referencia.getReferencia() );
      out.write("</td>\r\n");
      out.write("    <td align=\"center\">");
      out.print(pedhasit.getQuantidade() );
      out.write("</td>\r\n");
      out.write("    <td align=\"center\">R$");
      out.print(valor );
      out.write("</td>\r\n");
      out.write("    <td align=\"center\">R$");
      out.print(total );
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
} 
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("  <td>\r\n");
      out.write("  <center><strong>Total Bruto:</strong></center>\r\n");
      out.write("  </td>\r\n");
      out.write("  <td>\r\n");
      out.write("  </td>\r\n");
      out.write("  <td>\r\n");
      out.write("  </td>\r\n");
      out.write("  <td>\r\n");
      out.write("  ");
String totalBruto = nf.format(pedido.getValorBruto()); 
      out.write("\r\n");
      out.write("  <center><strong>R$");
      out.print(totalBruto );
      out.write("</strong></center>\r\n");
      out.write("  </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
if(pedido.getValorBruto()!=pedido.getValorLiquido()){
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("  <td>\r\n");
      out.write("  <center><strong>Total Líquido:</strong></center>\r\n");
      out.write("  </td>\r\n");
      out.write("  <td>\r\n");
      out.write("  </td>\r\n");
      out.write("  <td>\r\n");
      out.write("  </td>\r\n");
      out.write("  <td>\r\n");
      out.write("  ");
String totalLiquido = nf.format(pedido.getValorLiquido()); 
      out.write("\r\n");
      out.write("  <center><strong>R$");
      out.print(totalLiquido );
      out.write("</strong></center>\r\n");
      out.write("  </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
}
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\t\t\r\n");
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
