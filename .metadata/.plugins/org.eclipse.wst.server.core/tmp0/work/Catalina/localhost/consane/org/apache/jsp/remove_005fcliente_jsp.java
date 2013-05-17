package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;

public final class remove_005fcliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Cliente</title>\r\n");


java.text.NumberFormat nf = java.text.NumberFormat.getNumberInstance();
nf.setMinimumFractionDigits(2);
nf.setMaximumFractionDigits(2);

ClienteDAO clienteDao = new ClienteDAO();
Cliente cliente = clienteDao.getCliente(Integer.parseInt(request.getParameter("cliente")));


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
      out.write("<form action=\"removeCliente\">\r\n");
      out.write("\t\t\t<h3>Exclusão de clientes</h3>\r\n");
      out.write("\t\t\t\t     \t\r\n");
      out.write("\t  \t\tTem certeza de que deseja excluir este cliente?\r\n");
      out.write("\t      \t<br>\r\n");
      out.write("\t      \t<br>\r\n");
      out.write("\t      \t<input type=\"hidden\" name=\"cliente\" value=\"");
      out.print(Integer.parseInt(request.getParameter("cliente")));
      out.write("\" />\r\n");
      out.write("\t      \t<input type=\"submit\" value=\"Excluir\" /> \r\n");
      out.write("\t\t\t\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<table width=\"904\" border=\"0\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td colspan=\"4\" bgcolor=\"#FFFFFF\"><p>CONSANE REPRESENTAÇÕES LTDA</p>\r\n");
      out.write("    <p><a href=\"javaScript:window.print()\">CLIENTE</a></p>\r\n");
      out.write("    <p>&nbsp;</p></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><b>Cliente:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getIdCliente());
      out.write(' ');
      out.write('-');
      out.write(' ');
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
      out.write("  ");
} 
      out.write("\r\n");
      out.write("  ");
if (cliente.getEmail()!=null){ 
      out.write("\r\n");
      out.write("    <td><b>Email:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getEmail() );
      out.write("</td>\r\n");
      out.write("  ");
} 
      out.write("\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("  ");
if (cliente.getCob_endereco()!=null || cliente.getCob_telefone()!=null || cliente.getCidade()!=null
	    && cliente.getCob_contato()!=null || cliente.getCob_bairro()!=null || cliente.getCob_email()!=null){ 
      out.write("\r\n");
      out.write("    <td colspan=\"4\" bgcolor=\"#CCCCCC\" align=\"center\"><strong>\r\n");
      out.write("    Cobrança\r\n");
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
      out.write("    <td><b>CNPJ:</b></td>\r\n");
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
      out.write("    ");
if (cliente.getEnt_endereco()!=null || cliente.getEnt_telefone()!=null || cliente.getEnt_cidade()!=null
	    && cliente.getEnt_contato()!=null || cliente.getEnt_bairro()!=null || cliente.getEnt_email()!=null){ 
      out.write("\r\n");
      out.write("    <td colspan=\"4\" bgcolor=\"#CCCCCC\" align=\"center\"><strong>\r\n");
      out.write("    Entrega\r\n");
      out.write("    </strong></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("  \t");
if (cliente.getEnt_endereco()!=null){ 
      out.write("\r\n");
      out.write("    <td><b>Endereço:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getEnt_endereco() );
      out.write("</td>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("    ");
if (cliente.getEnt_telefone()!=null){ 
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
if (cliente.getEnt_cidade()!=null){ 
      out.write("\r\n");
      out.write("    <td><b>Cidade:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getEnt_cidade() );
      out.write("</td>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("    ");
if (cliente.getEnt_contato()!=null){ 
      out.write("\r\n");
      out.write("    <td><b>Contato:</b></td>\r\n");
      out.write("    <td align=\"left\">");
      out.print(cliente.getEnt_contato() );
      out.write("</td>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("  \t");
if (cliente.getEnt_bairro()!=null){ 
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
if (cliente.getEnt_email()!=null){ 
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
      out.write("  </table>\r\n");
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
