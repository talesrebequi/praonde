package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;

public final class lista_005fcaixas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t     ");

	     CaixaDAO cd = new CaixaDAO();
	     List<Caixa> caixas = cd.getLista();
	     
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\tfunction confirmExclusao(id) {  \r\n");
      out.write("\t\t\t\tif (confirm(\"Tem certeza que deseja excluir essa caixa?\")) {  \r\n");
      out.write("\t\t\t\t\tlocation.href=\"removeCaixa?idCaixa=\"+id;  \r\n");
      out.write("\t\t\t\t}  \t\r\n");
      out.write("\t\t\t}  \r\n");
      out.write("\t\t</script>\t\t\r\n");
      out.write("\t\t<table cellspacing=\"1\" cellpadding=\"1\" border=\"3\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\tCódigo\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\tDescrição\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\tCor\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\tPatrimônio\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");
 if (caixas.isEmpty()){ 
      out.write("\r\n");
      out.write("\t\t\t<h3> Não há caixas cadastradas com essa especificação!</h3>\r\n");
      out.write("\t\t");
 }else for(Caixa c : caixas){ 
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t<td>\t\r\n");
      out.write("\t\t\t\t");
      out.print(c.getIdCaixa());
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t");
      out.print(c.getCaixa());
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t");
  CorDAO cdao = new CorDAO();
				Cor cor = cdao.getCor(c.getIdCor());
			
      out.write("\r\n");
      out.write("\t\t\t");
      out.print(cor.getCor());
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t");
  PatrimonioDAO pdao = new PatrimonioDAO();
				Patrimonio patrimonio = pdao.getPatrimonio(c.getIdPatrimonio());
			
      out.write("\r\n");
      out.write("\t\t\t");
      out.print(patrimonio.getPatrimonio());
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<a href=edita_caixa.jsp?idCaixa=");
      out.print(c.getIdCaixa());
      out.write(">Alterar</a>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<a href=javascript:confirmExclusao(");
      out.print(c.getIdCaixa());
      out.write(")>Remover</a>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("                   \r\n");
      out.write("\t     </body>\r\n");
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
