package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;

public final class baixa_005fpedido_005fnumero_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t     <script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("\t\t \tfunction valida() {\r\n");
      out.write("\t\t \t\tpedido = document.form1.pedido.value;\r\n");
      out.write("\t\t \t\t\r\n");
      out.write("\t\t \t\tif(pedido==\"\") {\r\n");
      out.write("\t\t \t\t\talert(\"Insira o número do pedido!\");\r\n");
      out.write("\t\t \t\t\tdocument.form1.pedido.focus();\r\n");
      out.write("\t\t \t\t\treturn false;\r\n");
      out.write("\t\t \t\t}else{\r\n");
      out.write("\t\t \t\t\treturn true;\r\n");
      out.write("\t\t \t\t}\r\n");
      out.write("\t\t \t}\r\n");
      out.write("\t\t \t\r\n");
      out.write("\t\t \tfunction bloquear(){\r\n");
      out.write("\t\t    \tif(document.getElementById('valor').disabled==false){\r\n");
      out.write("\t\t\t\t\tdocument.getElementById('valor').disabled = true;\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tdocument.getElementById('valor').disabled = false;\r\n");
      out.write("\t\t \t\t} \r\n");
      out.write("\t \t\t}\r\n");
      out.write("\t \t\t\r\n");
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
      out.write("\t\t }\t \t\t\r\n");
      out.write("\t \t</script>\t     \r\n");
      out.write("\t     \t<form name=\"form1\" action=\"baixaPedido\" onSubmit=\"return (valida())\">\r\n");
      out.write("\t\t\t<h3>Baixa de pedidos</h3>\r\n");
      out.write("\t\t\t\t     \t\r\n");
      out.write("\t      \tInsira o número do pedido a baixar:   <input type=\"text\" name=\"pedido\" size=\"3\"/>\r\n");
      out.write("\t      \t<br>\r\n");
      out.write("\t      \t<br>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<input type=\"checkbox\" name=\"parcial\" onclick = \"bloquear();\"/>Parcial <br />\r\n");
      out.write("\t\t\tValor a baixar:   <input type=\"text\" name=\"valor\" size=\"3\" disabled=true onkeypress=\"troca(this)\" />\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t      \t<input type=\"submit\" value=\"Baixar\" />\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</form>\r\n");
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
