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

public final class busca_005fextrato_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<script language=\"JavaScript\">\r\n");
      out.write("\tfunction DataHora(evento, objeto){\r\n");
      out.write("\tvar keypress=(window.event)?event.keyCode:evento.which;\r\n");
      out.write("\tcampo = eval (objeto);\r\n");
      out.write("\tif (campo.value == '00/00/0000 00:00:00')\r\n");
      out.write("\t{\r\n");
      out.write("\t\tcampo.value=\"\"\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tcaracteres = '0123456789';\r\n");
      out.write("\tseparacao1 = '/';\r\n");
      out.write("\tconjunto1 = 2;\r\n");
      out.write("\tconjunto2 = 5;\r\n");
      out.write("\tconjunto3 = 10;\r\n");
      out.write("\tif ((caracteres.search(String.fromCharCode (keypress))!=-1) && campo.value.length < (10))\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif (campo.value.length == conjunto1 )\r\n");
      out.write("\t\tcampo.value = campo.value + separacao1;\r\n");
      out.write("\t\telse if (campo.value.length == conjunto2)\r\n");
      out.write("\t\tcampo.value = campo.value + separacao1;\r\n");
      out.write("\t}\r\n");
      out.write("\telse\r\n");
      out.write("\t\tevent.returnValue = false;\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");


SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

Date minhaDate = new Date();

// cria a string
String novoFormato = formatador.format(minhaDate);




      out.write("\r\n");
      out.write("\t     \t<form action=\"exibe_extrato.jsp?dataDe=dataDe, dataAte=dataAte\">\r\n");
      out.write("\t     \t<h3>Extrato: </h3>\r\n");
      out.write("\t\t\tDe: <input type=\"text\" name=\"dataDe\" value=\"");
      out.print(novoFormato );
      out.write("\" onKeyPress=\"DataHora(event, this)\"/><br />\r\n");
      out.write("\t\t\tAté: <input type=\"text\" name=\"dataAte\" value=\"");
      out.print(novoFormato );
      out.write("\" onKeyPress=\"DataHora(event, this)\"/><br />\r\n");
      out.write("\t\t\t<br>\r\n");
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
