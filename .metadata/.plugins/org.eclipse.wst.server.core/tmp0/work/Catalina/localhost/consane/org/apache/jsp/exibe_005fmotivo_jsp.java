package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;

public final class exibe_005fmotivo_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	     	MotivoDAO dao = new MotivoDAO ();
	     	Motivo motivo;
	     	int idMotivo = 0;
	     	if(request.getParameter("idMotivo") != null)
	     		idMotivo = Integer.parseInt(request.getParameter("idMotivo"));

	     	motivo = dao.getMotivo(idMotivo);
	     	
	     	String descricao_motivo = motivo.getMotivo();
	
      out.write("\r\n");
      out.write("\t<html>\r\n");
      out.write("\t     <body>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t     \t<form action=\"edita_os.jsp\">\r\n");
      out.write("\t\t     \t<h2>Ordem de serviço:</h2>\r\n");
      out.write("\t\t     \t<table cellspacing=\"1\" cellpadding=\"1\" border=\"3\"> \r\n");
      out.write("\t\t\t     \t");
 if(motivo.getMotivo()!=null )if( motivo.getMotivo().trim()!=""){
      out.write("\r\n");
      out.write("\t\t\t     \t<tr>\r\n");
      out.write("\t\t\t     \t\t<td><center>Motivo:</center></td>\r\n");
      out.write("\t\t\t     \t\t<td>");
      out.print( motivo.getMotivo());
      out.write("</td>\r\n");
      out.write("\t\t\t     \t</tr>\r\n");
      out.write("\t\t\t     \t");
}
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t      \t<br>\r\n");
      out.write("\t\t      \t<br>\r\n");
      out.write("\t\t      \t<input type=\"hidden\" name=\"idMotivo\" value=\"");
      out.print(idMotivo );
      out.write("\"/>\r\n");
      out.write("\t\t      \t<input type=\"submit\" value=\"Editar\" />\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t       \r\n");
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
