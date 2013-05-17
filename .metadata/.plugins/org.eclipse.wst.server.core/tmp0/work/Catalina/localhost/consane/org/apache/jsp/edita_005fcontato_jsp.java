package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;

public final class edita_005fcontato_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t \tfunction valida() {\r\n");
      out.write("\t \t\tnome = document.form1.nome.value;\r\n");
      out.write("\t \t\t\t\r\n");
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

	     	int idCliente = 0;
	     	if(request.getParameter("idCliente") != null)
	     		idCliente = Integer.parseInt(request.getParameter("idCliente"));
	     		
	    	System.out.println("IDCliente:"+ idCliente);
	     	
	     	ContatoDAO dao = new ContatoDAO ();
	     	Contato contato;
	     	int idContato = 0;
	     	if(request.getParameter("idContato") != null)
	     		idContato = Integer.parseInt(request.getParameter("idContato"));

	     	contato = dao.getContato(idContato);
	     	
	     	String nome = contato.getNome();
	     	if(nome==null) nome="";
	     	String cargo = contato.getCargo();
	     	if(cargo==null) cargo="";
	     	String departamento = contato.getDepartamento();
	     	if(departamento==null) departamento="";
	     	String telefone_comercial = contato.getTelefone_comercial();
	     	if(telefone_comercial==null) telefone_comercial="";
	     	String ramal = contato.getRamal();
	     	if(ramal==null) ramal="";
	     	String celular_comercial = contato.getCelular_comercial();
	     	if(celular_comercial==null) celular_comercial="";
	     	String email_comercial = contato.getEmail_comercial();
	     	if(email_comercial==null) email_comercial="";
	     	String endereco_comercial = contato.getEndereco_comercial();
	     	if(endereco_comercial==null) endereco_comercial="";
	     	String email_pessoal = contato.getEmail_pessoal();
	     	if(email_pessoal==null) email_pessoal="";
	     	String telefone_pessoal = contato.getTelefone_pessoal();
	     	if(telefone_pessoal==null) telefone_pessoal="";
	     	String celular_pessoal = contato.getCelular_pessoal();
	     	if(celular_pessoal==null) celular_pessoal="";
	     	String endereço_pessoal = contato.getEndereco_pessoal();
	     	if(endereço_pessoal==null) endereço_pessoal="";
	     	String banco = contato.getBanco();
	     	if(banco==null) banco="";
	     	String agencia = contato.getAgencia();
	     	if(agencia==null) agencia="";
	     	String conta_corrente = contato.getConta_corrente();
	     	if(conta_corrente==null) conta_corrente="";
	     	String nascimento = contato.getNascimento();
	     	if(nascimento==null) nascimento="";	
	     	
	     
      out.write("\r\n");
      out.write("\t     \t<form name=\"form1\" action=\"editaContato\" onSubmit=\"return (valida())\">\r\n");
      out.write("\t     \t<h3>Editar Contato</h3>\r\n");
      out.write("\t     \t<table width=\"320\" border=\"3\" cellpadding=\"1\" cellspacing=\"1\"> \r\n");
      out.write("\t     \t<tr >\r\n");
      out.write("\t     \t<td width=\"308\">Dados gerais: </td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr valign=\"top\">\r\n");
      out.write("\t     \t<td >\r\n");
      out.write("\t     \t<table width=\"312\" border=\"0\" cellpadding=\"1\" cellspacing=\"1\"> \r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td width=\"157\">Nome: </td>\r\n");
      out.write("\t     \t<td width=\"144\"><input type=\"text\" name=\"nome\" value=\"");
      out.print(nome);
      out.write("\" onkeyup=\"javascript:alta(this);\"/></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Cargo: </td>\r\n");
      out.write("\t     \t<td><input type=\"text\" name=\"cargo\" value=\"");
      out.print(cargo);
      out.write("\" onkeyup=\"javascript:alta(this);\"/></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Departamento: </td>\r\n");
      out.write("\t     \t<td><label for=\"tipo\">\r\n");
      out.write("\t     \t  <input type=\"text\" name=\"departamento\" value=\"");
      out.print(departamento);
      out.write("\" onkeyup=\"javascript:alta(this);\"/>\r\n");
      out.write("\t     \t</label></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Telefone Comercial: </td>\r\n");
      out.write("\t     \t<td><input type=\"text\" name=\"tel_comercial\" value=\"");
      out.print(telefone_comercial);
      out.write("\" onKeyPress=\"mascara(this, '##.####-####')\" maxlength=12 /></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t  <td>Ramal:</td>\r\n");
      out.write("\t     \t  <td><input type=\"text\" name=\"ramal\" value=\"");
      out.print(ramal);
      out.write("\"/></td>\r\n");
      out.write("\t     \t  </tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Celular Comercial: </td> \r\n");
      out.write("\t     \t<td><input type=\"text\" name=\"celular_comercial\" value=\"");
      out.print(celular_comercial);
      out.write("\" onKeyPress=\"mascara(this, '##.####-####')\" maxlength=12/></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Email Comercial: </td>\r\n");
      out.write("\t     \t<td><input type=\"text\" name=\"email_comercial\" value=\"");
      out.print(email_comercial);
      out.write("\" /></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t  <td>Endereço Comercial: </td>\r\n");
      out.write("\t     \t  <td><input type=\"text\" name=\"endereço_comercial\" value=\"");
      out.print(endereco_comercial);
      out.write("\" onkeyup=\"javascript:alta(this);\"/></td>\r\n");
      out.write("\t     \t  </tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Email Pessoal:</td>\r\n");
      out.write("\t     \t<td><input type=\"text\" name=\"email_pessoal\" value=\"");
      out.print(email_pessoal);
      out.write("\"/></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Telefone Pessoal:</td>\r\n");
      out.write("\t     \t<td><input type=\"text\" name=\"telefone_pessoal\" value=\"");
      out.print(telefone_pessoal);
      out.write("\" onKeyPress=\"mascara(this, '##.####-####')\" maxlength=12/></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Celular Pessoal:</td>\r\n");
      out.write("\t     \t<td><input type=\"text\" name=\"celular_pessoal\" value=\"");
      out.print(celular_pessoal);
      out.write("\" onKeyPress=\"mascara(this, '##.####-####')\" maxlength=12/></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t  <td>Endereço Pessoal:</td>\r\n");
      out.write("\t     \t  <td><input type=\"text\" name=\"endereço_pessoal\" value=\"");
      out.print(endereço_pessoal);
      out.write("\" onkeyup=\"javascript:alta(this);\"/></td>\r\n");
      out.write("\t     \t  </tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Banco:</td>\r\n");
      out.write("\t     \t<td><input type=\"text\" name=\"banco\" value=\"");
      out.print(banco);
      out.write("\"/></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t  <td>Agência:</td>\r\n");
      out.write("\t     \t  <td><input type=\"text\" name=\"agencia\" value=\"");
      out.print(agencia);
      out.write("\"/></td>\r\n");
      out.write("\t     \t  </tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t  <td>Conta Corrente:</td>\r\n");
      out.write("\t     \t  <td><input type=\"text\" name=\"conta\" value=\"");
      out.print(conta_corrente);
      out.write("\"/></td>\r\n");
      out.write("\t     \t  </tr>\r\n");
      out.write("\t     \t<tr>\r\n");
      out.write("\t     \t<td>Data de Nascimento:</td>\r\n");
      out.write("\t     \t<td><input type=\"text\" name=\"nascimento\" value=\"");
      out.print(nascimento);
      out.write("\" onKeyPress=\"mascara(this, '##/##/####')\" maxlength=10/></td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t     \t</table>\r\n");
      out.write("\t     \t</td>\r\n");
      out.write("\t     \t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t     \t<br /><br />\r\n");
      out.write("\t     \t<input type=\"hidden\" name=\"idCliente\" value=\"");
      out.print(idCliente);
      out.write("\" />\r\n");
      out.write("\t     \t<input type=\"hidden\" name=\"idContato\" value=\"");
      out.print(idContato);
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
