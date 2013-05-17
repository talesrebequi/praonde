package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;

public final class adiciona_005fcliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t     function alta(valor) {\r\n");
      out.write("\t\t\t\tvalor.value=valor.value.toUpperCase();\t\r\n");
      out.write("\t\t }\r\n");
      out.write("\t \t\r\n");
      out.write("\t \t function valida() {\r\n");
      out.write("\t \t\tfantasia = document.form1.fantasia.value;\r\n");
      out.write("\t \t\t\r\n");
      out.write("\t \t\tif(fantasia==\"\") {\r\n");
      out.write("\t \t\t\talert(\"Insira ao menos o nome fantasia do cliente!\");\r\n");
      out.write("\t \t\t\tdocument.form1.fantasia.focus();\r\n");
      out.write("\t \t\t\treturn false;\r\n");
      out.write("\t \t\t}else{\r\n");
      out.write("\t \t\t\treturn true;\r\n");
      out.write("\t \t\t}\r\n");
      out.write("\t \t}\r\n");
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
 String tipo = request.getParameter("tipo");
      out.write("\r\n");
      out.write("\t     ");
System.out.println(tipo);
      out.write("\r\n");
      out.write("\t     <center>\r\n");
      out.write("\t     \t<form name=\"form1\" action=\"adicionaCliente\" onSubmit=\"return (valida())\">\r\n");
      out.write("\t     \t<font color=\"blue\"><b>Adicionar Cliente</b></font>\r\n");
      out.write("\t     \t<table width=\"278\" border=\"3\" cellpadding=\"1\" cellspacing=\"1\"> \r\n");
      out.write("\t     \t<tr >\r\n");
      out.write("\t     \t<td width=\"239\">Dados gerais: </td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr valign=\"top\">\r\n");
      out.write("\t     \t<td >\r\n");
      out.write("\t     \t<table cellspacing=\"1\" cellpadding=\"1\" border=\"0\"> \r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Nome: </td>\r\n");
      out.write("\t     \t<td><input type=\"text\" name=\"nome\" onkeyup=\"javascript:alta(this);\"/></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Fantasia: </td>\r\n");
      out.write("\t     \t<td><input type=\"text\" name=\"fantasia\" onkeyup=\"javascript:alta(this);\"/></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t");
if (tipo.equals("Pessoa Jurídica")){
      out.write("\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>CNPJ: </td>\r\n");
      out.write("\t     \t<td><input type=\"text\" name=\"cnpj\" onKeyPress=\"mascara(this, '##.###.###/####-##')\" maxlength=18 /></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t");
}
      out.write("\r\n");
      out.write("\t     \t");
if (tipo.equals("Pessoa Física")){
      out.write("\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t  <td>RG:</td>\r\n");
      out.write("\t     \t  <td><input type=\"text\" name=\"rg\" onKeyPress=\"mascara(this, '##.###.###-##')\" maxlength=18 /></td>\r\n");
      out.write("\t     \t  </tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>CPF: </td> \r\n");
      out.write("\t     \t<td><input type=\"text\" name=\"cpf\" onKeyPress=\"mascara(this, '###.###.###-##')\" maxlength=14/></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t");
}
      out.write("\r\n");
      out.write("\t     \t");
if (tipo.equals("Pessoa Jurídica")){
      out.write("\r\n");
      out.write("\t     \t<td>Inscrição Estadual: </td>\r\n");
      out.write("\t     \t<td><input type=\"text\" name=\"ie\" /></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t  <td>CCM:</td>\r\n");
      out.write("\t     \t  <td><input type=\"text\" name=\"ccm\" /></td>\r\n");
      out.write("\t     \t  </tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t");
}
      out.write("\r\n");
      out.write("\t     \t<td>CEP: </td>\r\n");
      out.write("\t     \t<td><input type=\"text\" name=\"cep\" onKeyPress=\"mascara(this, '#####.###')\" maxlength=9/></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Endereço: </td>\r\n");
      out.write("\t     \t<td><input type=\"text\" name=\"rua\" onkeyup=\"javascript:alta(this);\"/></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Número: </td>\r\n");
      out.write("\t     \t<td><input type=\"text\" name=\"numero\" /></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t  <td>Complemento: </td>\r\n");
      out.write("\t     \t  <td><input type=\"text\" name=\"complemento\" onkeyup=\"javascript:alta(this);\"/></td>\r\n");
      out.write("\t     \t  </tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Bairro: </td>\r\n");
      out.write("\t     \t<td><input type=\"text\" name=\"bairro\" onkeyup=\"javascript:alta(this);\")/></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t  <td>Município: </td>\r\n");
      out.write("\t     \t  <td><input type=\"text\" name=\"municipio\" onkeyup=\"javascript:alta(this);\"/></td>\r\n");
      out.write("\t     \t  </tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t  <td>Estado: </td>\r\n");
      out.write("\t     \t  <td><input type=\"text\" name=\"estado\" onkeyup=\"javascript:alta(this);\" onkeyup=\"javascript:alta(this);\"/></td>\r\n");
      out.write("\t     \t  </tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Telefone: </td>\r\n");
      out.write("\t     \t<td><input type=\"text\" name=\"telefone\" onKeyPress=\"mascara(this, '##.####-####')\" maxlength=12/></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t</table>\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<br /><br />\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"tipo\" size=\"1\" id=\"tipo\" value=\"");
      out.print(tipo);
      out.write("\">\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"Gravar\" />\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t</center>\r\n");
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
