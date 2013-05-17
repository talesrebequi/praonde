package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class edita_005fpedido_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<head>\r\n");
      out.write("\t<script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("\tfunction valida() {\r\n");
      out.write("\t\tqtdItens = document.form1.qtdItens.value;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(qtdItens==\"\") {\r\n");
      out.write("\t\t\talert(\"Insira a quantidade de Itens!\");\r\n");
      out.write("\t\t\tdocument.form1.qtdItens.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</head>\r\n");
      out.write("\t     <body>\r\n");
      out.write("<!-- /* \t     <script>\r\n");
      out.write("\t     function troca(c){\r\n");
      out.write("\t\t     campo=c;\r\n");
      out.write("\t\t     setTimeout(\"exec_troca()\",1);\r\n");
      out.write("\t\t }\r\n");
      out.write("\t\t function exec_troca(){\r\n");
      out.write("\t\t\t campo.value=virgula(campo.value);\r\n");
      out.write("\t\t }\r\n");
      out.write("\t\t function virgula(texto){\r\n");
      out.write("\t\t\t texto=texto.replace(\",\",\".\");\r\n");
      out.write("\t\t\t return texto;\r\n");
      out.write("\t\t }\r\n");
      out.write("\t     </script> */ -->\r\n");


PedidoDAO pDao = new PedidoDAO();
Pedido p = new Pedido();
if(request.getParameter("pedido")!=null)
	p = pDao.getPedido(Integer.parseInt(request.getParameter("pedido")));

SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

Date minhaDate = new Date();

String novoFormato = formatador.format(minhaDate);

List<Cliente> clientes = new ArrayList<Cliente>();
ClienteDAO cdao = new ClienteDAO();
clientes = cdao.getLista();

List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
FornecedorDAO fdao = new FornecedorDAO();
fornecedores = fdao.getLista();

int qtdItens = 0; 
Pedido_has_ItensDAO phiDAO = new Pedido_has_ItensDAO();
List<Pedido_has_Itens> phis = phiDAO.getRefs(Integer.parseInt(request.getParameter("pedido")));
qtdItens = phis.size();

if(request.getParameter("pedido")!=null){

      out.write("\r\n");
      out.write("\t     \t<form name=\"form1\" action=\"editaPedido\" onSubmit=\"return (valida())\">\r\n");
      out.write("\t     \t<table cellspacing=\"1\" cellpadding=\"1\" border=\"3\"> \r\n");
      out.write("\t     \t<tr >\r\n");
      out.write("\t     \t  <td height=\"24\" colspan=\"2\" align=\"center\"><h3>Emiss&atilde;o de Pedido: </h3></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t  <td width=\"110\">Data de Emiss&atilde;o: </td>\r\n");
      out.write("\t     \t<td width=\"144\" align=\"center\" valign=\"middle\"><input type=\"text\" name=\"dataEmissao\" value=\"");
      out.print(novoFormato );
      out.write("\"/></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t  <td>Cliente:</td>\r\n");
      out.write("\t\t\t<td><label for=\"idCliente\"></label>\r\n");
      out.write("              <select name=\"idCliente\" size=\"1\" id=\"idCliente\">\r\n");
      out.write("                ");
for (Cliente c : clientes){ 
                	if(c.getIdCliente() == p.getIdCliente()){
                
      out.write("\r\n");
      out.write("                <option value=");
      out.print(c.getIdCliente() );
      out.write(" selected>");
      out.print(c.getFantasia() );
      out.write("</option>\r\n");
      out.write("                ");
}else{ 
      out.write("\r\n");
      out.write("                <option value=");
      out.print(c.getIdCliente() );
      out.write('>');
      out.print(c.getFantasia() );
      out.write("</option>\r\n");
      out.write("                ");
}
                }
                
      out.write("\r\n");
      out.write("              </select>\r\n");
      out.write("            </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("            <td>Fornecedor:</td>\r\n");
      out.write("            <td><label for=\"idFornecedor\"></label>\r\n");
      out.write("              <select name=\"idFornecedor\" size=\"1\" id=\"idFornecedor\">\r\n");
      out.write("                ");
for (Fornecedor f : fornecedores){ 
                	if (f.getIdFornecedor() == p.getIdFornecedor()){
      out.write("\r\n");
      out.write("                <option value=");
      out.print(f.getIdFornecedor() );
      out.write(" selected>");
      out.print(f.getDescricao() );
      out.write("</option>\r\n");
      out.write("                ");
}else{
      out.write("\r\n");
      out.write("                <option value=");
      out.print(f.getIdFornecedor() );
      out.write('>');
      out.print(f.getDescricao() );
      out.write("</option>\r\n");
      out.write("                ");
}
                }
                
      out.write("\r\n");
      out.write("              </select>\r\n");
      out.write("            </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("            <td>\r\n");
      out.write("            Condição de Pagamento:\r\n");
      out.write("            </td>\r\n");
      out.write("            <td>\r\n");
      out.write("            <input type=\"text\" name=\"condicaoPagamento\" value=\"");
      out.print(p.getCondicaoPagamento());
      out.write("\"/>\r\n");
      out.write("            </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("            <td>\r\n");
      out.write("            Entrega:\r\n");
      out.write("            </td>\r\n");
      out.write("            <td>\r\n");
      out.write("            <input type=\"text\" name=\"entrega\" value=\"");
      out.print(p.getEntrega());
      out.write("\"/>\r\n");
      out.write("            </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("            <td>\r\n");
      out.write("            Desconto 1:\r\n");
      out.write("            </td>\r\n");
      out.write("            <td>\r\n");
      out.write("            ");
if (p.getDesconto1()!=0.0){
      out.write("\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"desconto1\" size=5 value=\"");
      out.print(p.getDesconto1());
      out.write("\"/>  %\r\n");
      out.write("\t\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"desconto1\" size=5/>  %\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("            <td>\r\n");
      out.write("            Desconto 2:\r\n");
      out.write("            </td>\r\n");
      out.write("            <td>\r\n");
      out.write("\t\t\t");
if (p.getDesconto2()!=0.0){
      out.write("\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"desconto2\" size=5 value=\"");
      out.print(p.getDesconto2());
      out.write("\"/>  %\r\n");
      out.write("\t\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"desconto2\" size=5 />  %\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("            <td>\r\n");
      out.write("            Desconto 3:\r\n");
      out.write("            </td>\r\n");
      out.write("            <td>\r\n");
      out.write("\t\t\t");
if (p.getDesconto3()!=0.0){
      out.write("\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"desconto3\" size=5 value=\"");
      out.print(p.getDesconto3());
      out.write("\"/>  %\r\n");
      out.write("\t\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"desconto3\" size=5 />  %\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("            <td>\r\n");
      out.write("            Desconto 4:\r\n");
      out.write("            </td>\r\n");
      out.write("            <td>\r\n");
      out.write("            ");
if (p.getDesconto4()!=0.0){
      out.write("\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"desconto4\" size=5 value=\"");
      out.print(p.getDesconto4());
      out.write("\"/>  %\r\n");
      out.write("\t\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"desconto4\" size=5 />  %\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("            <td>\r\n");
      out.write("            Desconto 5:\r\n");
      out.write("            </td>\r\n");
      out.write("            <td>\r\n");
      out.write("\t\t\t");
if (p.getDesconto5()!=0.0){
      out.write("\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"desconto5\" size=5 value=\"");
      out.print(p.getDesconto5());
      out.write("\"/>  %\r\n");
      out.write("\t\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"desconto5\" size=5 />  %\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\tQuantidade de Itens:\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"qtdItens\" size=5 value=\"");
      out.print(qtdItens);
      out.write("\"/>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\tObservações:\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t<textarea name=\"obs\" cols=\"30\" rows=\"5\">\r\n");
      out.write("\t\t\t");
      out.print(p.getObservacao());
      out.write(" \r\n");
      out.write("\t\t\t</textarea>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<input type=\"hidden\" value=\"");
      out.print(request.getParameter("pedido"));
      out.write("\" name=\"idPedido\" />\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"Avançar\"/>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t\t<h1> Não existe um pedido com esse código! </h1>\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
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
