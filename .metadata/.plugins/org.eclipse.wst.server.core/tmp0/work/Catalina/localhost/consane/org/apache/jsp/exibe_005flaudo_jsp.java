package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;

public final class exibe_005flaudo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Laudo</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\t");

	     	OSDAO dao = new OSDAO();
	     	OS os;
	     	int idOS = 0;
	     	System.out.println(request.getParameter("idOS"));
	     	if(request.getParameter("idOS") != null){
	     		idOS = Integer.parseInt(request.getParameter("idOS"));
	     	}
	     	os = dao.getOS(idOS);
	     	
	     	ClienteDAO cdao = new ClienteDAO();
	     	Cliente cliente;
	     	cliente = cdao.getCliente(os.getIdCliente());
	     	
	     	ContatoDAO contdao = new ContatoDAO();
	     	Contato contato;
	     	contato = contdao.getContato(os.getIdSolicitante());
		
			String dataLancamento = os.getDataLancamento();
			String dataEntrega = os.getDataEntrega();
			String observacao = os.getObservacao();
			String status = os.getStatus();
			
			OS_has_ProdutosDAO ohpdao = new OS_has_ProdutosDAO();
			List<OS_has_Produtos> oshp = ohpdao.getOHPsOS(idOS);
			
			Sem_ConsertoDAO scdao = new Sem_ConsertoDAO();
			List<Sem_Conserto> scs;
			
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<p><img src=\"laudo_header.jpg\" alt=\"\" width=\"609\" height=\"136\" />\r\n");
      out.write("</p>\r\n");
      out.write("<p>Ao</p>\r\n");
      out.write("<p>");
      out.print(cliente.getNome());
      out.write("</p>\r\n");
      out.write("<p>A/C</p>\r\n");
      out.write("<p>");
      out.print(contato.getNome());
      out.write("</p>\r\n");
      out.write("<p>Referente ao laudo de instrumento cirúrgico:</p>\r\n");
      out.write("<ul>\r\n");
 
	String motivos;
	int contMot;
	ProdutoDAO pdao = new ProdutoDAO();
	MotivoDAO mdao = new MotivoDAO();
	Produto prod = new Produto();
	Motivo mot;
	for (OS_has_Produtos ohp : oshp){
		motivos = "";
		contMot = 0; 
		scs = scdao.getSemConsertoPorItem(ohp.getIdOS_has_produtos());
		if(scs.size()>0){
			prod = pdao.getProduto(ohp.getIdProduto());
			for(Sem_Conserto sc : scs){
				contMot++;
				if(sc.getIdMotivo1()!=0){
					mot = mdao.getMotivo(sc.getIdMotivo1());
					motivos = mot.getMotivo() + ", " + motivos;
				}
				if(sc.getIdMotivo2()!=0){
					mot = mdao.getMotivo(sc.getIdMotivo2());
					motivos = mot.getMotivo() + ", " + motivos;
				}
				if(sc.getIdMotivo3()!=0){
					mot = mdao.getMotivo(sc.getIdMotivo3());
					motivos = mot.getMotivo() + ", " + motivos;
				}
			}

      out.write("\r\n");
      out.write("  <li>");
      out.print(prod.getDescricao());
      out.write(' ');
      out.write('-');
      out.write(' ');
      out.print(motivos);
      out.write("</li> ");
 if (contMot >= 3){ 
      out.write(" VIDA ÚTIL COMPROMETIDA! ");
}
      out.write('\r');
      out.write('\n');

		}
}

      out.write("\r\n");
      out.write("</ul>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("<p>Atenciosamente,</p>\r\n");
      out.write("<p>Eduardo Gandolfi</p>\r\n");
      out.write("<p>F: 8555-7474 / 9633-2233</p>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("<p><img src=\"laudo_footer.jpg\" alt=\" \" width=\"675\" height=\"98\" /></p>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
