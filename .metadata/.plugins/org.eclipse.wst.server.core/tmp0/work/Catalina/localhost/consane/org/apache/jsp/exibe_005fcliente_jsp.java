package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;

public final class exibe_005fcliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	     	ClienteDAO dao = new ClienteDAO ();
	     	Cliente cliente;
	     	int idCliente = 0;
	     	if(request.getParameter("idCliente") != null)
	     		idCliente = Integer.parseInt(request.getParameter("idCliente"));

	     	cliente = dao.getCliente(idCliente);
	     	
	     	String nome = cliente.getNome();	     		     	
	     	String fantasia = cliente.getFantasia();
	     	String tipo = cliente.getTipo();
	     	String cnpj = cliente.getCnpj();
	     	String rg = cliente.getRg();
	     	String cpf = cliente.getCpf();
	     	String ie = cliente.getIe();
	     	String ccm = cliente.getCcm();
	     	String cep = cliente.getCep();
	     	String endereco = cliente.getRua();
	     	String numero = cliente.getNumero();	     	
	     	String complemento = cliente.getComplemento();
	     	String bairro = cliente.getBairro();
	     	String municipio = cliente.getMunicipio();
	     	String estado = cliente.getEstado();
	     	String telefone = cliente.getTelefone();
	     	
	     	ContatoDAO contatoDAO = new ContatoDAO();
	     	List<Contato> contatos = contatoDAO.getListaRelacionada(idCliente); 
	
      out.write("\r\n");
      out.write("\t<html>\r\n");
      out.write("\t     <body>\r\n");
      out.write("\t\t <script>\r\n");
      out.write("\t\t \tfunction confirmExclusao(id) {  \r\n");
      out.write("\t\t\t\tif (confirm(\"Tem certeza que deseja excluir esse contato do cliente?\")) {  \r\n");
      out.write("\t\t\t\t\tlocation.href=\"removeContato?idContato=\"+id;  \r\n");
      out.write("\t\t\t\t}  \t\r\n");
      out.write("\t\t\t} \r\n");
      out.write("\t\t </script>\t\r\n");
      out.write("\t\t <center>\r\n");
      out.write("\t     \t<form action=\"edita_cliente.jsp\">\r\n");
      out.write("\t\t     \t<h2>Informações do Cliente:</h2>\r\n");
      out.write("\t\t     \t<table cellspacing=\"1\" cellpadding=\"1\" border=\"3\"> \r\n");
      out.write("\t\t\t     \t");
 if(cliente.getNome()!=null )if( cliente.getNome().trim()!=""){
      out.write("\r\n");
      out.write("\t\t\t     \t<tr>\r\n");
      out.write("\t\t\t     \t\t<td><center>Nome:</center></td>\r\n");
      out.write("\t\t\t     \t\t<td>");
      out.print( cliente.getNome());
      out.write("</td>\r\n");
      out.write("\t\t\t     \t</tr>\r\n");
      out.write("\t\t\t     \t");
}
      out.write("\r\n");
      out.write("\t\t\t     \t");
 if(cliente.getFantasia()!=null )if( cliente.getFantasia().trim()!=""){
      out.write("\r\n");
      out.write("\t\t\t     \t<tr>\r\n");
      out.write("\t\t\t\t     \t<td><center>Fantasia: </center></td>\r\n");
      out.write("\t\t\t\t     \t<td>");
      out.print( cliente.getFantasia() );
      out.write("</td>\r\n");
      out.write("\t\t\t     \t</tr>\r\n");
      out.write("\t\t\t     \t");
}
      out.write("\r\n");
      out.write("\t\t\t     \t");
 if(cliente.getTipo()!=null )if( cliente.getTipo().trim()!=""){
      out.write("\r\n");
      out.write("\t\t\t     \t<tr>\r\n");
      out.write("\t\t\t\t     \t<td><center>Tipo:</center></td>\r\n");
      out.write("\t\t\t\t\t\t<td> ");
      out.print(cliente.getTipo() );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 if(cliente.getCnpj()!=null )if( cliente.getCnpj().trim()!=""){
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t     \t<td><center>CNPJ:</center></td>\r\n");
      out.write("\t\t\t\t\t\t<td> ");
      out.print(cliente.getCnpj() );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 if(cliente.getRg()!=null )if( cliente.getRg().trim()!=""){
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t     \t<td><center>RG:</center></td>\r\n");
      out.write("\t\t\t\t\t\t<td> ");
      out.print(cliente.getRg() );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 if(cliente.getCpf()!=null )if( cliente.getCpf().trim()!=""){
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t     \t<td><center>CPF:</center></td>\r\n");
      out.write("\t\t\t\t\t\t<td> ");
      out.print(cliente.getCpf() );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 if(cliente.getIe()!=null )if( cliente.getIe().trim()!=""){
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t     \t<td><center>Inscrição Estadual:</center></td>\r\n");
      out.write("\t\t\t\t\t\t<td> ");
      out.print(cliente.getIe() );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 if(cliente.getCcm()!=null)if( cliente.getCcm()!=cliente.getCcm()){
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t     \t<td><center>CCM:</center></td>\r\n");
      out.write("\t\t\t\t\t\t<td> ");
      out.print(cliente.getCcm() );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 if(cliente.getCep()!=null )if( cliente.getCep().trim()!=""){
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t     \t<td><center>CEP:</center></td>\r\n");
      out.write("\t\t\t\t\t\t<td> ");
      out.print(cliente.getCep() );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 if(cliente.getRua()!=null )if( cliente.getRua().trim()!=""){
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t     \t<td><center>Endereço:</center></td>\r\n");
      out.write("\t\t\t\t\t\t<td> ");
      out.print(cliente.getRua() );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 if(cliente.getNumero()!=null )if( cliente.getNumero().trim()!=""){
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t     \t<td><center>Número:</center></td>\r\n");
      out.write("\t\t\t\t\t\t<td> ");
      out.print(cliente.getNumero() );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 if(cliente.getComplemento()!=null )if( cliente.getComplemento().trim()!=""){
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t     \t<td><center>Complemento:</center></td>\r\n");
      out.write("\t\t\t\t\t\t<td> ");
      out.print(cliente.getComplemento() );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 if(cliente.getBairro()!=null )if( cliente.getBairro().trim()!=""){
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t     \t<td><center>Bairro:</center></td>\r\n");
      out.write("\t\t\t\t\t\t<td> ");
      out.print(cliente.getBairro() );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 if(cliente.getMunicipio()!=null )if( cliente.getMunicipio().trim()!=""){
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t     \t<td><center>Município:</center></td>\r\n");
      out.write("\t\t\t\t\t\t<td> ");
      out.print(cliente.getMunicipio() );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 if(cliente.getEstado()!=null )if( cliente.getEstado().trim()!=""){
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t     \t<td><center>Estado:</center></td>\r\n");
      out.write("\t\t\t\t\t\t<td> ");
      out.print(cliente.getEstado() );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 if(cliente.getTelefone()!=null )if( cliente.getTelefone().trim()!=""){
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t     \t<td><center>Telefone:</center></td>\r\n");
      out.write("\t\t\t\t\t\t<td> ");
      out.print(cliente.getTelefone() );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t      \t<br>\r\n");
      out.write("\t\t      \t<br>\r\n");
      out.write("\t\t      \t<input type=\"hidden\" name=\"idCliente\" value=\"");
      out.print(idCliente );
      out.write("\"/>\r\n");
      out.write("\t\t      \t<input type=\"submit\" value=\"Editar\" />\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<form action=\"adiciona_contato.jsp\">\r\n");
      out.write("\t\t     \t<h2>Contatos:</h2>\r\n");
      out.write("\t\t     \t<table cellspacing=\"1\" cellpadding=\"1\" border=\"3\"> \t\t\t\r\n");
      out.write("\t\t     \t");

		     	for(Contato c : contatos){	     	
		     	
      out.write("\r\n");
      out.write("\t\t\t     \t<tr>\r\n");
      out.write("\t\t\t     \t<td><a href=\"exibe_contato.jsp?idContato=");
      out.print(c.getIdContato());
      out.write("&idCliente=");
      out.print(idCliente);
      out.write('"');
      out.write('>');
      out.print( c.getNome());
      out.write("</a></td>\r\n");
      out.write("\t\t\t     \t<td><a href=\"edita_contato.jsp?idContato=");
      out.print(c.getIdContato());
      out.write("&idCliente=");
      out.print(c.getIdCliente());
      out.write("\">Editar</a></td>\r\n");
      out.write("\t     \t\t\t<td><a href=javascript:confirmExclusao(");
      out.print(c.getIdContato());
      out.write(")>Remover</a></td>\r\n");
      out.write("\t\t\t     \t</tr>\r\n");
      out.write("\t\t     \t");

		     	}
		     	
      out.write("\r\n");
      out.write("\t\t     \t</table>\r\n");
      out.write("\t\t      \t<br>\r\n");
      out.write("\t\t      \t");
System.out.println(idCliente);
      out.write("\r\n");
      out.write("\t\t      \t<input type=\"hidden\" name=\"idCliente\" value=\"");
      out.print(idCliente );
      out.write("\"/>\r\n");
      out.write("\t\t      \t<input type=\"submit\" value=\"Adicionar\" />\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t      </center> \r\n");
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
