package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;

public final class adiciona_005fcontato_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t \tfunction valida() {\r\n");
      out.write("\t \t\tnome = document.form1.nome.value;\r\n");
      out.write("\t \t\t\r\n");
      out.write("\t \t\tif(nome==\"\") {\r\n");
      out.write("\t \t\t\talert(\"Insira ao menos o nome do contato!\");\r\n");
      out.write("\t \t\t\tdocument.form1.fantasia.focus();\r\n");
      out.write("\t \t\t\treturn false;\r\n");
      out.write("\t \t\t}else{\r\n");
      out.write("\t \t\t\treturn true;\r\n");
      out.write("\t \t\t}\r\n");
      out.write("\t \t} \r\n");
      out.write("\t \tfunction mascara(src, mask){\r\n");
      out.write("\t \tvar i = src.value.length;\r\n");
      out.write("\t \tvar saida = mask.substring(0,1);\r\n");
      out.write("\t \tvar texto = mask.substring(i);\r\n");
      out.write("\t \tif (texto.substring(0,1) != saida)\r\n");
      out.write("\t \t{\r\n");
      out.write("\t \tsrc.value += texto.substring(0,1);\r\n");
      out.write("\t \t}\r\n");
      out.write("\t \t} \r\n");
      out.write("\t     </script>\r\n");
      out.write("\t     ");

	     	int idCliente = Integer.parseInt(request.getParameter("idCliente"));
	     	System.out.println("IdCliente:"+idCliente);
	     
      out.write("\r\n");
      out.write("\t     \t<form name=\"form1\" action=\"adicionaContato\" onSubmit=\"return (valida())\">\r\n");
      out.write("\t     \t<h3>Adicionar Contato</h3>\r\n");
      out.write("\t     \t<table width=\"320\" border=\"3\" cellpadding=\"1\" cellspacing=\"1\"> \r\n");
      out.write("\t     \t<tr >\r\n");
      out.write("\t     \t<td width=\"308\">Dados gerais: </td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr valign=\"top\">\r\n");
      out.write("\t     \t<td >\r\n");
      out.write("\t     \t<table width=\"312\" border=\"0\" cellpadding=\"1\" cellspacing=\"1\"> \r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td width=\"157\">Nome: </td>\r\n");
      out.write("\t     \t<td width=\"144\"><input type=\"text\" name=\"nome\" /></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Cargo: </td>\r\n");
      out.write("\t     \t<td><input type=\"text\" name=\"cargo\" /></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Departamento: </td>\r\n");
      out.write("\t     \t<td><label for=\"tipo\">\r\n");
      out.write("\t     \t  <input type=\"text\" name=\"departamento\" />\r\n");
      out.write("\t     \t</label></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Telefone Comercial: </td>\r\n");
      out.write("\t     \t<td><input type=\"text\" name=\"tel_comercial\" onKeyPress=\"mascara(this, '##.####-####')\" maxlength=12 /></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t  <td>Ramal:</td>\r\n");
      out.write("\t     \t  <td><input type=\"text\" name=\"ramal\" /></td>\r\n");
      out.write("\t     \t  </tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Celular Comercial: </td> \r\n");
      out.write("\t     \t<td><input type=\"text\" name=\"celular_comercial\" onKeyPress=\"mascara(this, '##.####-####')\" maxlength=12/></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Email Comercial: </td>\r\n");
      out.write("\t     \t<td><input type=\"text\" name=\"email_comercial\" /></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t  <td>Endereço Comercial: </td>\r\n");
      out.write("\t     \t  <td><input type=\"text\" name=\"endereço_comercial\" /></td>\r\n");
      out.write("\t     \t  </tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Email Pessoal:</td>\r\n");
      out.write("\t     \t<td><input type=\"text\" name=\"email_pessoal\"/></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Telefone Pessoal:</td>\r\n");
      out.write("\t     \t<td><input type=\"text\" name=\"telefone_pessoal\" onKeyPress=\"mascara(this, '##.####-####')\" maxlength=12/></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Celular Pessoal:</td>\r\n");
      out.write("\t     \t<td><input type=\"text\" name=\"celular_pessoal\" onKeyPress=\"mascara(this, '##.####-####')\" maxlength=12/></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t  <td>EndereÃ§o Pessoal:</td>\r\n");
      out.write("\t     \t  <td><input type=\"text\" name=\"endereço_pessoal\" /></td>\r\n");
      out.write("\t     \t  </tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Banco:</td>\r\n");
      out.write("\t     \t<td><input type=\"text\" name=\"banco\" )/></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t  <td>AgÃªncia:</td>\r\n");
      out.write("\t     \t  <td><input type=\"text\" name=\"agencia\" /></td>\r\n");
      out.write("\t     \t  </tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t  <td>Conta Corrente:</td>\r\n");
      out.write("\t     \t  <td><input type=\"text\" name=\"conta\" /></td>\r\n");
      out.write("\t     \t  </tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Data de Nascimento:</td>\r\n");
      out.write("\t     \t<td><input type=\"text\" name=\"nascimento\" onKeyPress=\"mascara(this, '##/##/####')\" maxlength=10/></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t</table>\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t     \t<br /><br />\r\n");
      out.write("\t     \t<input type=\"hidden\" name=\"idCliente\" value=\"");
      out.print(idCliente);
      out.write("\" />\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"Gravar\" />\r\n");
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
