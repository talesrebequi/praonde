package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;
import Utilities.*;
import java.text.DecimalFormat;;

public final class exibe_005fpedido_jsp extends org.apache.jasper.runtime.HttpJspBase
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


//java.text.NumberFormat nf = java.text.NumberFormat.getNumberInstance();
//nf.setMinimumFractionDigits(2);
//nf.setMaximumFractionDigits(2);


PedidoDAO pedDAO = new PedidoDAO();
Pedido pedido = pedDAO.getPedido(Integer.parseInt(request.getParameter("idPedido")));

Pedido_has_ItensDAO phiDao = new Pedido_has_ItensDAO();
List<Pedido_has_Itens> phis = phiDao.getRefs(pedido.getIdPedido());

      Collections.sort (phis, new Comparator(){  
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
if (cliente.getBairro()!=null && cliente.getBairro().replaceAll(" ","").equals("")==false  ){ 
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
if (cliente.getEndereco().replaceAll(" ","").equals("")==false  && cliente.getEndereco()!=null
  		 || cliente.getCep().replaceAll(" ","").equals("")==false  && cliente.getCep()!=null){ 
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("  \t");
if (cliente.getEndereco()!=null && cliente.getEndereco().replaceAll(" ","").equals("")==false  ){ 
      out.write("\r\n");
      out.write("    <td><b>Endereço:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getEndereco() );
      out.write("</td>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("    ");
if (cliente.getEstado()!=null && cliente.getEstado().replaceAll(" ","").equals("")==false  ){ 
      out.write("\r\n");
      out.write("    <td><b>Estado:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getEstado() );
      out.write("</td>\r\n");
      out.write("    ");

    System.out.println("Cliente GetEstadO:" +  cliente.getEstado());
    } 
      out.write("\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
} 
      out.write("\r\n");
      out.write("  ");
 if(cliente.getCidade().replaceAll(" ","").equals("")==false   && cliente.getCidade()!=null || 
  		cliente.getTelefone().replaceAll(" ","").equals("")==false  && cliente.getTelefone()!=null){ 
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    ");
if (cliente.getCidade()!=null && cliente.getCidade().replaceAll(" ","").equals("")==false  ){ 
      out.write("\r\n");
      out.write("    <td><b>Cidade:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getCidade() );
      out.write("</td>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("    ");
if (cliente.getCep()!=null && cliente.getCep().replaceAll(" ","").equals("")==false  ){ 
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
if (cliente.getCnpj().replaceAll(" ","").equals("")==false  && cliente.getCnpj()!=null || 
  		cliente.getContato().replaceAll(" ","").equals("")==false  && cliente.getContato()!=null){ 
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("  \t");
if (cliente.getCnpj()!=null && cliente.getCnpj().replaceAll(" ","").equals("")==false  ){ 
      out.write("\r\n");
      out.write("    <td><b>CNPJ:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getCnpj() );
      out.write("</td>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("    ");
if (cliente.getTelefone()!=null && cliente.getTelefone().replaceAll(" ","").equals("")==false  ){ 
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
if (cliente.getIe()!=null && cliente.getIe().replaceAll(" ","").equals("")==false  ){ 
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><b>Insc. Est.:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getIe() );
      out.write("</td>\r\n");
      out.write("  ");
} 
      out.write("\r\n");
      out.write("  ");
if (cliente.getContato()!=null && cliente.getContato().replaceAll(" ","").equals("")==false  ){ 
      out.write("\r\n");
      out.write("    <td><b>Contato:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getContato() );
      out.write("</td>\r\n");
      out.write("  ");
} 
      out.write("\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("  ");
if (cliente.getCob_endereco()!=null && cliente.getCob_endereco().replaceAll(" ","").equals("")==false 
  		 || cliente.getCob_telefone()!=null && cliente.getCob_telefone().replaceAll(" ","").equals("")==false 
  		 || cliente.getCidade()!=null && cliente.getCidade().replaceAll(" ","").equals("")==false 
	     || cliente.getCob_cep()!=null && cliente.getCob_cep().replaceAll(" ","").equals("")==false 
	     || cliente.getCob_bairro()!=null && cliente.getCob_bairro().replaceAll(" ","").equals("")==false 
	     || cliente.getCob_email()!=null && cliente.getCob_email().replaceAll(" ","").equals("")==false  ){ 
      out.write("\r\n");
      out.write("    <td colspan=\"4\" bgcolor=\"#CCCCCC\"><strong>\r\n");
      out.write("      <center>\r\n");
      out.write("        Cobrança\r\n");
      out.write("      </center>\r\n");
      out.write("    </strong></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("  \t");
if (cliente.getCob_endereco()!=null && cliente.getCob_endereco().replaceAll(" ","").equals("")==false  ){ 
      out.write("\r\n");
      out.write("    <td><b>Endereço:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getCob_endereco() );
      out.write("</td>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("    ");
if (cliente.getCob_telefone()!=null && cliente.getCob_telefone().replaceAll(" ","").equals("")==false  ){ 
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
if (cliente.getCob_cidade()!=null && cliente.getCob_cidade().replaceAll(" ","").equals("")==false ){ 
      out.write("\r\n");
      out.write("    <td><b>Cidade:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getCob_cidade() );
      out.write("</td>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("    ");
if (cliente.getCob_cep()!=null && cliente.getCob_cep().replaceAll(" ","").equals("")==false  ){ 
      out.write("\r\n");
      out.write("    <td><b>CEP:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getCob_cep() );
      out.write("</td>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("  \t");
if (cliente.getCob_email()!=null && cliente.getCob_email().replaceAll(" ","").equals("")==false  ){ 
      out.write("\r\n");
      out.write("    <td><b>E-mail para Nfe:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getCob_email() );
      out.write("</td>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("    ");
if (cliente.getCob_estado()!=null && cliente.getCob_estado().replaceAll(" ","").equals("")==false  ){ 
      out.write("\r\n");
      out.write("    <td><b>Estado:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getCob_estado() );
      out.write("</td>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("  ");
if (cliente.getEnt_endereco()!=null && cliente.getEnt_endereco().replaceAll(" ","").equals("")==false 
  		|| cliente.getEnt_telefone()!=null && cliente.getEnt_telefone().replaceAll(" ","").equals("")==false 
  		|| cliente.getEnt_cidade()!=null && cliente.getEnt_cidade().replaceAll(" ","").equals("")==false  
	    || cliente.getEnt_contato()!=null && cliente.getEnt_contato().replaceAll(" ","").equals("")==false 
	    || cliente.getEnt_bairro()!=null && cliente.getEnt_bairro().replaceAll(" ","").equals("")==false  
		|| cliente.getEnt_email()!=null && cliente.getEnt_email().replaceAll(" ","").equals("")==false  ){ 
      out.write("\r\n");
      out.write("    <td colspan=\"4\" bgcolor=\"#CCCCCC\"><strong>\r\n");
      out.write("      <center>\r\n");
      out.write("        Entrega\r\n");
      out.write("      </center>\r\n");
      out.write("    </strong></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
if (cliente.getTransportadora().replaceAll(" ","").equals("")==false  && cliente.getTransportadora()!=null){
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("  \t<td><b>Transportadora:</b></td>\r\n");
      out.write("  \t<td align=\"left\">");
      out.print(cliente.getTransportadora() );
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
}
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("  \t");
if (cliente.getEnt_endereco().replaceAll(" ","").equals("")==false  && cliente.getEnt_endereco()!=null){
  	System.out.println("ENDERECO: " + cliente.getEnt_endereco());
  	 
      out.write("\r\n");
      out.write("    <td><b>Endereço:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getEnt_endereco() );
      out.write("</td>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("    ");
if (cliente.getEnt_telefone()!=null && cliente.getEnt_telefone().replaceAll(" ","").equals("")==false  ){ 
      out.write("\r\n");
      out.write("    <td><b>Telefone:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getEnt_telefone() );
      out.write("</td>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("  \t");
if (cliente.getEnt_cidade()!=null && cliente.getEnt_cidade().replaceAll(" ","").equals("")==false  ){ 
      out.write("\r\n");
      out.write("    <td><b>Cidade:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getEnt_cidade() );
      out.write("</td>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("    ");
if (cliente.getEnt_contato()!=null && cliente.getEnt_contato().replaceAll(" ","").equals("")==false  ){ 
      out.write("\r\n");
      out.write("    <td><b>Contato:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getEnt_contato() );
      out.write("</td>\r\n");
      out.write("    ");
}
    }
   
      out.write("\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("  \t");
if (cliente.getEnt_bairro()!=null && cliente.getEnt_bairro().replaceAll(" ","") .equals("")==false ){ 
      out.write("\r\n");
      out.write("    <td><b>Bairro:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getEnt_bairro() );
      out.write("</td>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("  \t");
if (cliente.getEnt_email()!=null && cliente.getEnt_email().replaceAll(" ","").equals("")==false  ){ 
      out.write("\r\n");
      out.write("    <td><b>Email:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getEnt_email() );
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
 if (pedido.getCondicaoPagamento().replaceAll(" ","").equals("")==false){ 
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
if (pedido.getEntrega().replaceAll(" ","").equals("")==false){ 
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
if (desconto.replaceAll(" ","").equals("")==false){ 
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
if (pedido.getObservacao().replaceAll(" ","").equals("")==false && pedido.getObservacao()!=null ){ 
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
      out.write("        Preço \r\n");
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

		float valora = 0;
		float totala = 0;
		ReferenciaDAO refDao = new ReferenciaDAO(); 
		Referencia referencia = refDao.getReferencia(pedhasit.getIdReferencia());
		if (pedhasit.getValor()!=0){
			valora = pedhasit.getValor();
	  		totala = pedhasit.getValor()*pedhasit.getQuantidade();
	  	}else{
	  		valora = referencia.getValor();
	  		totala = referencia.getValor()*pedhasit.getQuantidade();
	  	}	  	
	  	DecimalFormat totalDF = new DecimalFormat( "0.00" );  
  		String total = totalDF.format(totala);
  		DecimalFormat preco = new DecimalFormat( "0.000" );  
  		String valorb = preco.format(valora);
  		System.out.println(valorb);   
  		FormataNumero fn = new FormataNumero();
  		String valor = fn.formatar(valorb);
  	
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
      out.write("  <tr/>\r\n");
      out.write("  <tr/>\r\n");
      out.write("  <tr>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("  <td>\r\n");
      out.write("  </td>\r\n");
      out.write("  <td>\r\n");
      out.write("  </td>\r\n");
      out.write("  <td>\r\n");
      out.write("  <center><strong>Total Bruto:</strong></center>\r\n");
      out.write("  </td>\r\n");
      out.write("  <td>\r\n");
      out.write("  ");

  	double totalBrutoa = pedido.getValorBruto(); 
  	DecimalFormat totalB = new DecimalFormat( "0.00" );  
  	String totalBruto = totalB.format(totalBrutoa);   
  
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
      out.write("  </td>\r\n");
      out.write("  <td>\r\n");
      out.write("  </td>\r\n");
      out.write("  <td>\r\n");
      out.write("  <center><strong>Total Líquido:</strong></center>\r\n");
      out.write("  </td>\r\n");
      out.write("  <td>\r\n");
      out.write("  ");

  double totalLiquidoa = pedido.getValorLiquido(); 
  	DecimalFormat totalL = new DecimalFormat( "0.00" );  
  	String totalLiquido = totalL.format(totalLiquidoa);   
  
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
      out.write("<a href=\"exibe_pedido2.jsp?idPedido=\"");
      out.print(pedido.getIdPedido());
      out.write("> Modelo 2 </a>\r\n");
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
