package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;

public final class exibe_005frelatorio_005fpedidos_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	     	PedidoDAO dao = new PedidoDAO();
	     	List<Pedido> pedidos = new ArrayList<Pedido>();
	     	String dataDe = request.getParameter("dataDe");
	     	String dataAte = request.getParameter("dataAte");
	     	
	     	pedidos = dao.getPedidosData(dataDe, dataAte);
	     	
	     	double total = 0.0;
	     	
	     	for (Pedido p : pedidos)
	     		total = total + p.getValorTotal();
	     	
	     	ClienteDAO cDao = new ClienteDAO();
	     	
			
      out.write("\r\n");
      out.write("\t<html>\r\n");
      out.write("\t     <body>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t     \t<form action=\"edita_cliente.jsp\">\r\n");
      out.write("\t     \t<h2>Pedidos:</h2>\r\n");
      out.write("\t     \t<h3>Total: R$");
      out.print(total );
      out.write("</h3>\r\n");
      out.write("\t     \t<table cellspacing=\"1\" cellpadding=\"1\" border=\"3\"> \r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td><center>Data:</center></td>\r\n");
      out.write("\t     \t<td><center>Cliente:</center></td>\r\n");
      out.write("\t     \t<td><center>Valor:</center></td>\r\n");
      out.write("\t     \t<td><center>Pagamento:</center></td>\t     \t\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t");
 for (Pedido ped : pedidos){ 
      out.write("\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t");

	     	if (ped.getDataEmissao()!=null){
      out.write("\r\n");
      out.write("\t     \t\t");
      out.print(ped.getDataEmissao() );
      out.write("\r\n");
      out.write("\t     \t");
}else{ 
      out.write("\r\n");
      out.write("\t     \t\t");
      out.print(ped.getDataEmissao());
      out.write("\r\n");
      out.write("\t     \t");

	     	}
	     	
      out.write("\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t");

	     	Cliente cliente = cDao.getCliente(ped.getIdCliente());
	     	if (cliente.getFantasia()!=null){
      out.write("\r\n");
      out.write("\t     \t\t");
      out.print(cliente.getFantasia() );
      out.write("\t\r\n");
      out.write("\t     \t");

	     	}
	     	
      out.write("\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t     \t");

	     	if (ped.getValorTotal()!=0.0){
      out.write("\r\n");
      out.write("\t     \t\tR$");
      out.print(ped.getValorTotal() );
      out.write("\t\r\n");
      out.write("\t     \t");

	     	}
	     	
      out.write("\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t<td>\r\n");
      out.write("\t    \t\t");

	     	if (ped.getCondicaoPagamento()!=null){
      out.write("\r\n");
      out.write("\t     \t\t");
      out.print(ped.getCondicaoPagamento() );
      out.write("\t\r\n");
      out.write("\t     \t");

	     	}
	     	
      out.write("\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t");
} 
      out.write("\r\n");
      out.write("\t     \t</table>\r\n");
      out.write("\t      \t<br>\r\n");
      out.write("\t      \t<br>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("                   \r\n");
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
