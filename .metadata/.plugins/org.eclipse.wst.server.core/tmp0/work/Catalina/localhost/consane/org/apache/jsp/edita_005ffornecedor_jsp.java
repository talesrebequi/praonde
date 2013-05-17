package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;

public final class edita_005ffornecedor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t      <script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("\t \tfunction valida() {\r\n");
      out.write("\t \t\tdescricao = document.form1.descricao.value;\r\n");
      out.write("\t \t\t\r\n");
      out.write("\t \t\tif(descricao==\"\") {\r\n");
      out.write("\t \t\t\talert(\"Insira ao menos a descrição do cliente!\");\r\n");
      out.write("\t \t\t\tdocument.form1.descricao.focus();\r\n");
      out.write("\t \t\t\treturn false;\r\n");
      out.write("\t \t\t}else{\r\n");
      out.write("\t \t\t\treturn true;\r\n");
      out.write("\t \t\t}\r\n");
      out.write("\t \t} \r\n");
      out.write("\t     </script>\r\n");
      out.write("\t     \t<form action=\"editaFornecedor\">\r\n");
      out.write("\t     \t\r\n");
      out.write("\t\t\t");

	     	FornecedorDAO dao = new FornecedorDAO();
	     	Fornecedor fornecedor;			
			int id = 0;
			if(request.getParameter("idFornecedor") != null){
	     		id = Integer.parseInt(request.getParameter("idFornecedor"));
	     	}
			
			fornecedor = dao.getFornecedor(id);
			if (fornecedor.getDescricao()!=null){
	   		
      out.write("\r\n");
      out.write("\t   \t\t<h3>Editar Fornecedor</h3>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"descricao\" value=\"");
      out.print(fornecedor.getDescricao());
      out.write("\" />\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"idFornecedor\" value=\"");
      out.print(fornecedor.getIdFornecedor());
      out.write("\" />\r\n");
      out.write("\t\t\t<br /><br />\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"Gravar\" />\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t\t<h1>Não há um fornecedor com esse código!</h1>\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("      </body>\r\n");
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
