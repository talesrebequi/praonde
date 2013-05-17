package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;

public final class exibe_005fcontato_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	     	
	     	int idCliente = 0;
	     	if(request.getParameter("idCliente") != null)
	     		idCliente = Integer.parseInt(request.getParameter("idCliente"));
	     		
	     	ContatoDAO dao = new ContatoDAO ();
	     	Contato contato;
	     	int idContato = 0;
	     	if(request.getParameter("idContato") != null)
	     		idContato = Integer.parseInt(request.getParameter("idContato"));

	     	contato = dao.getContato(idContato);
	     	
	     	String nome = contato.getNome();
	     	String cargo = contato.getCargo();
	     	String departamento = contato.getDepartamento();
	     	String telefone_comercial = contato.getTelefone_comercial();
	     	String ramal = contato.getRamal();
	     	String celular_comercial = contato.getCelular_comercial();
	     	String email_comercial = contato.getEmail_comercial();
	     	String endereco_comercial = contato.getEndereco_comercial();
	     	String email_pessoal = contato.getEmail_pessoal();
	     	String telefone_pessoal = contato.getTelefone_pessoal();
	     	String celular_pessoal = contato.getCelular_pessoal();
	     	String endereço_pessoal = contato.getEndereco_pessoal();
	     	String banco = contato.getBanco();
	     	String agencia = contato.getAgencia();
	     	String conta_corrente = contato.getConta_corrente();
	     	String nascimento = contato.getNascimento();	     	
	
      out.write("\r\n");
      out.write("\t<html>\r\n");
      out.write("\t     <body>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t     \t<form action=\"edita_contato.jsp\">\r\n");
      out.write("\t\t     \t<h2>Informações do Contato:</h2>\r\n");
      out.write("\t\t     \t<table cellspacing=\"1\" cellpadding=\"1\" border=\"3\"> \r\n");
      out.write("\t\t\t     \t");
 if(contato.getNome()!=null )if( contato.getNome().replaceAll(" ","")!=""){
      out.write("\r\n");
      out.write("\t\t\t     \t<tr>\r\n");
      out.write("\t\t\t     \t\t<td><center>Nome:</center></td>\r\n");
      out.write("\t\t\t     \t\t<td>");
      out.print( contato.getNome());
      out.write("</td>\r\n");
      out.write("\t\t\t     \t</tr>\r\n");
      out.write("\t\t\t     \t");
}
      out.write("\r\n");
      out.write("\t\t\t     \t");
 if(contato.getCargo()!=null )if( contato.getCargo().replaceAll(" ","")!=""){
      out.write("\r\n");
      out.write("\t\t\t     \t<tr>\r\n");
      out.write("\t\t\t\t     \t<td><center>Cargo: </center></td>\r\n");
      out.write("\t\t\t\t     \t<td>");
      out.print( contato.getCargo() );
      out.write("</td>\r\n");
      out.write("\t\t\t     \t</tr>\r\n");
      out.write("\t\t\t     \t");
}
      out.write("\r\n");
      out.write("\t\t\t     \t");
 if(contato.getDepartamento()!=null )if( contato.getDepartamento().replaceAll(" ","")!=""){
      out.write("\r\n");
      out.write("\t\t\t     \t<tr>\r\n");
      out.write("\t\t\t\t     \t<td><center>Departamento:</center></td>\r\n");
      out.write("\t\t\t\t\t\t<td> ");
      out.print(contato.getDepartamento() );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 if(contato.getTelefone_comercial()!=null )if( contato.getTelefone_comercial().replaceAll(" ","")!=""){
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t     \t<td><center>Telefone Comercial:</center></td>\r\n");
      out.write("\t\t\t\t\t\t<td> ");
      out.print(contato.getTelefone_comercial() );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 if(contato.getRamal()!=null )if( contato.getRamal().replaceAll(" ","")!=""){
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t     \t<td><center>Ramal:</center></td>\r\n");
      out.write("\t\t\t\t\t\t<td> ");
      out.print(contato.getRamal() );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 if(contato.getCelular_comercial()!=null )if( contato.getCelular_comercial().replaceAll(" ","")!=""){
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t     \t<td><center>Celular Comercial:</center></td>\r\n");
      out.write("\t\t\t\t\t\t<td> ");
      out.print(contato.getCelular_comercial() );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 if(contato.getEmail_comercial()!=null )if( contato.getEmail_comercial().replaceAll(" ","")!=""){
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t     \t<td><center>Email Comercial:</center></td>\r\n");
      out.write("\t\t\t\t\t\t<td> ");
      out.print(contato.getEmail_comercial() );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 if(contato.getEndereco_comercial()!=null )if( contato.getEndereco_comercial().replaceAll(" ","")!=""){
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t     \t<td><center>Endereço Comercial:</center></td>\r\n");
      out.write("\t\t\t\t\t\t<td> ");
      out.print(contato.getEndereco_comercial() );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 if(contato.getEmail_pessoal()!=null )if( contato.getEmail_pessoal().replaceAll(" ","")!=""){
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t     \t<td><center>Email Pessoal:</center></td>\r\n");
      out.write("\t\t\t\t\t\t<td> ");
      out.print(contato.getEmail_pessoal() );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 if(contato.getTelefone_pessoal()!=null )if( contato.getTelefone_pessoal().replaceAll(" ","")!=""){
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t     \t<td><center>Telefone Pessoal:</center></td>\r\n");
      out.write("\t\t\t\t\t\t<td> ");
      out.print(contato.getTelefone_pessoal() );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 if(contato.getCelular_pessoal()!=null )if( contato.getCelular_pessoal().replaceAll(" ","")!=""){
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t     \t<td><center>Celular Pessoal:</center></td>\r\n");
      out.write("\t\t\t\t\t\t<td> ");
      out.print(contato.getCelular_pessoal() );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 if(contato.getEndereco_pessoal()!=null )if( contato.getEndereco_pessoal().replaceAll(" ","")!=""){
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t     \t<td><center>Endereço Pessoal:</center></td>\r\n");
      out.write("\t\t\t\t\t\t<td> ");
      out.print(contato.getEndereco_pessoal() );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 if(contato.getBanco()!=null )if( contato.getBanco().replaceAll(" ","")!=""){
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t     \t<td><center>Banco:</center></td>\r\n");
      out.write("\t\t\t\t\t\t<td> ");
      out.print(contato.getBanco() );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 if(contato.getAgencia()!=null )if( contato.getAgencia().replaceAll(" ","")!=""){
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t     \t<td><center>Agência:</center></td>\r\n");
      out.write("\t\t\t\t\t\t<td> ");
      out.print(contato.getAgencia() );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 if(contato.getConta_corrente()!=null )if( contato.getConta_corrente().replaceAll(" ","")!=""){
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t     \t<td><center>Conta Corrente:</center></td>\r\n");
      out.write("\t\t\t\t\t\t<td> ");
      out.print(contato.getConta_corrente() );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 if(contato.getNascimento()!=null )if( contato.getNascimento().replaceAll(" ","")!=""){
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t     \t<td><center>Data de Nascimento:</center></td>\r\n");
      out.write("\t\t\t\t\t\t<td> ");
      out.print(contato.getNascimento() );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t      \t<br>\r\n");
      out.write("\t\t      \t<br>\r\n");
      out.write("\t\t      \t<input type=\"hidden\" name=\"idContato\" value=\"");
      out.print(idContato );
      out.write("\"/>\r\n");
      out.write("\t\t      \t<input type=\"hidden\" name=\"idCliente\" value=\"");
      out.print(idCliente );
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
