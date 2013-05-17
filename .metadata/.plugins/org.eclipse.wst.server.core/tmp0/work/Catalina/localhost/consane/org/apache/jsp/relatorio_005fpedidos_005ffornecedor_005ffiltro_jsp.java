package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;

public final class relatorio_005fpedidos_005ffornecedor_005ffiltro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t     \t<form action=\"relatorio_pedidos_fornecedor.jsp\">\r\n");
      out.write("\t\t\t<h3>Relatório de pedidos</h3>\r\n");
      out.write("\t\t\t\t     \t\r\n");
      out.write("\t      \tFornecedor:   <select size=\"1\" name=\"fornecedor\">\r\n");
      out.write("\t      \t");

		      	FornecedorDAO fdao = new FornecedorDAO();
		      	List<Fornecedor> fs = fdao.getLista();
		 		for (Fornecedor f : fs){
	      	
      out.write("\r\n");
      out.write("\t      \t<option value=\"");
      out.print(f.getIdFornecedor());
      out.write('"');
      out.write('>');
      out.print(f.getDescricao());
      out.write("</option>\r\n");
      out.write("\t      \t");

	      		}
	      	
      out.write("\r\n");
      out.write("\t      \t</select>\r\n");
      out.write("\t      \t<br>\r\n");
      out.write("\t      \t<br>\r\n");
      out.write("\t      \t\r\n");
      out.write("\t      \tMês para a consulta:   <select size=\"1\" name=\"mes\">\r\n");
      out.write("\t      \t<option value=\"01\">Janeiro</option>\r\n");
      out.write("\t      \t<option value=\"02\">Fevereiro</option>\r\n");
      out.write("\t      \t<option value=\"03\">Março</option>\r\n");
      out.write("\t      \t<option value=\"04\">Abril</option>\r\n");
      out.write("\t      \t<option value=\"05\">Maio</option>\r\n");
      out.write("\t      \t<option value=\"06\">Junho</option>\r\n");
      out.write("\t      \t<option value=\"07\">Julho</option>\r\n");
      out.write("\t      \t<option value=\"08\">Agosto</option>\r\n");
      out.write("\t      \t<option value=\"09\">Setembro</option>\r\n");
      out.write("\t      \t<option value=\"10\">Outubro</option>\r\n");
      out.write("\t      \t<option value=\"11\">Novembro</option>\r\n");
      out.write("\t      \t<option value=\"12\">Dezembro</option>\r\n");
      out.write("\t      \t</select>\r\n");
      out.write("\t      \t<br>\r\n");
      out.write("\t      \t<br>\r\n");
      out.write("\t      \t\r\n");
      out.write("\t      \tAno da consulta: <input type=\"text\" name=\"ano\" value=\"2011\" size=\"3\"></input>\r\n");
      out.write("\t      \t<br>\r\n");
      out.write("\t      \t<br>\r\n");
      out.write("\t      \r\n");
      out.write("\t      \t\r\n");
      out.write("\t      \t<input type=\"submit\" value=\"Emitir relatório\" />\r\n");
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
