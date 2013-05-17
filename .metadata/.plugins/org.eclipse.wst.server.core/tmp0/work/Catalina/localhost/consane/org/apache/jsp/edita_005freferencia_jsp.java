package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;

public final class edita_005freferencia_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t \t\tvalor = document.form1.valor.value;\r\n");
      out.write("\t \t\t\r\n");
      out.write("\t \t\tif(valor==\"\") {\r\n");
      out.write("\t \t\t\talert(\"Insita o valor da referência!\");\r\n");
      out.write("\t \t\t\tdocument.form1.valor.focus();\r\n");
      out.write("\t \t\t\treturn false;\r\n");
      out.write("\t \t\t}else{\r\n");
      out.write("\t \t\t\treturn true;\r\n");
      out.write("\t \t\t}\r\n");
      out.write("\t \t} \r\n");
      out.write("\t     </script>\r\n");
      out.write("\t     ");


			List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
			FornecedorDAO fdao = new FornecedorDAO();
			fornecedores = fdao.getLista();
		
		
      out.write("\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t     \t<form action=\"editaReferencia\">\r\n");
      out.write("\t     \t\r\n");
      out.write("\t\t\t");

	     	ReferenciaDAO dao = new ReferenciaDAO();
	     	Referencia referencia;			
			referencia = dao.getReferencia(request.getParameter("referencia"));
			Fornecedor refForn = fdao.getFornecedor(referencia.getIdFornecedor());
			if (referencia.getIdReferencia()!=0){
	   		
      out.write("\r\n");
      out.write("\t\t   \t\t<h3>Editar Referência</h3>\r\n");
      out.write("\t\t   \t\t<br />\r\n");
      out.write("\t\t   \t\tFornecedor:\r\n");
      out.write("\t         \t<select name=\"idFornecedor\" size=\"1\" id=\"idFornecedor\" selected\"");
      out.print(refForn.getDescricao());
      out.write("\">\r\n");
      out.write("\t            ");
for (Fornecedor f : fornecedores){
	            	if (f.getIdFornecedor() == refForn.getIdFornecedor()){ 
      out.write("\r\n");
      out.write("\t            \t<option value=");
      out.print(f.getIdFornecedor() );
      out.write(" selected>");
      out.print(f.getDescricao() );
      out.write("</option>\r\n");
      out.write("\t            \t");
}else{
      out.write("\r\n");
      out.write("\t            \t<option value=");
      out.print(f.getIdFornecedor() );
      out.write('>');
      out.print(f.getDescricao() );
      out.write("</option>\r\n");
      out.write("\t            ");
 	}
	           	 } 
	           	
      out.write("\t\r\n");
      out.write("\t            </select>\r\n");
      out.write("\t            <br />\r\n");
      out.write("\t\t\t\tReferência: <input type=\"text\" name=\"referencia\" value=\"");
      out.print(referencia.getReferencia());
      out.write("\" />\r\n");
      out.write("\t\t\t\t<br />\r\n");
      out.write("\t\t\t\tValor: <input type=\"text\" name=\"valor\" value=\"");
      out.print(referencia.getValor());
      out.write("\" />\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"idReferencia\" value=\"");
      out.print(referencia.getIdReferencia());
      out.write("\" />\r\n");
      out.write("\t\t\t\t<br /><br />\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"Gravar\" />\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t\t<h1>Não há uma referência com esse código!</h1>\r\n");
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
