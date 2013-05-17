package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;

public final class busca_005freferencia_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t     \t<form action=\"consultaReferenciaServlet\">\r\n");
      out.write("\t\t\t<h3>Consulta de clientes</h3>\r\n");
      out.write("\t\t\t\t     \t\r\n");
      out.write("\t      \tParâmetro para a consulta:   <select size=\"1\" name=\"parametro\">\r\n");
      out.write("\t      \t<option value=\"idReferencia\">Código</option>\r\n");
      out.write("\t      \t<option value=\"valor\">Valor</option>\r\n");
      out.write("\t      \t<option value=\"fornecedor\">Fornecedor</option>\r\n");
      out.write("\t      \t<option value=\"referencia\">Referência</option>\r\n");
      out.write("\t      \t</select>\r\n");
      out.write("\t      \t<br>\r\n");
      out.write("\t      \t<br>\r\n");
      out.write("\t      \t\r\n");
      out.write("\t      \tDimensão para a consulta:   <select size=\"1\" name=\"dimensao\">\r\n");
      out.write("\t      \t<option value=\"igual\">Igual a</option>\r\n");
      out.write("\t      \t<option value=\"maior\">Maior que</option>\r\n");
      out.write("\t      \t<option value=\"menor\">Menor que</option>\r\n");
      out.write("\t      \t<option value=\"contem\">Contém</option>\r\n");
      out.write("\t      \t<option value=\"ncontem\">Não contém</option>\r\n");
      out.write("\t      \t</select>\r\n");
      out.write("\t      \t<br>\r\n");
      out.write("\t      \t<br>\r\n");
      out.write("\t      \t\r\n");
      out.write("\t      \tValor da consulta: <input type=\"text\" name=\"valor\"></input>\r\n");
      out.write("\t      \t<br>\r\n");
      out.write("\t      \t<br>\r\n");
      out.write("\t      \r\n");
      out.write("\t      \t\r\n");
      out.write("\t      \t<input type=\"submit\" value=\"Buscar\" />\r\n");
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
