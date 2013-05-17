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

public final class adiciona_005fpagamento_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \t     <script>\r\n");
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
      out.write("\t     </script>\r\n");


SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

Date minhaDate = new Date();

// cria a string
String novoFormato = formatador.format(minhaDate);




      out.write("\r\n");
      out.write("\t     \t<form action=\"adicionaPagamento\">\r\n");
      out.write("\t     \t<h3>Pagamento: </h3>\r\n");
      out.write("\t     \tCliente: <select size=\"1\" name=\"cliente\">\r\n");
      out.write("\t\t\t");

			ClienteDAO cdao = new ClienteDAO();
			List<Cliente> clientes = cdao.getLista();
			for (Cliente c : clientes) {
			
      out.write("\r\n");
      out.write("\t\t              <option value=\"");
      out.print(c.getIdCliente() );
      out.write('"');
      out.write('>');
      out.print(c.getFantasia() );
      out.write("</option>\r\n");
      out.write("               \r\n");
      out.write("        \t");

         	         }
	    	
      out.write("\r\n");
      out.write("\t\t\t</select> <br />\t\r\n");
      out.write("\t\t\tValor: <input type=\"text\" name=\"valor\" onKeyPress='troca(this)'/> <br />\r\n");
      out.write("\t\t\tData de Emissão:<input type=\"text\" name=\"dataPagamento\" value=\"");
      out.print(novoFormato );
      out.write("\"/>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"Avançar\" />\r\n");
      out.write("\t\t\t</form>\r\n");
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
