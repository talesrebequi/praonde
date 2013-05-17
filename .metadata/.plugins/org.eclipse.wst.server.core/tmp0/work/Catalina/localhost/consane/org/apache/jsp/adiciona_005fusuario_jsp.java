package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Dao.*;
import Servlets.*;

public final class adiciona_005fusuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"pt\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Contacts</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/reset.css\" type=\"text/css\" media=\"all\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" media=\"all\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.6.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-replace.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/Didact_Gothic_400.font.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/Shanti_400.font.js\"></script>\r\n");
      out.write("<script src=\"js/roundabout.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/roundabout_shapes.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/jquery.easing.1.2.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"page5\">\r\n");
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
      out.write("<div class=\"body1\">\r\n");
      out.write("\t<div class=\"main\">\r\n");
      out.write("\t\t<header>\r\n");
      out.write("\t\t\t<div class=\"wrapper\">\r\n");
      out.write("\t\t\t\t<nav>\r\n");
      out.write("\t\t\t\t\t<ul id=\"top_nav\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"Support.html\">Support</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">FAQs</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"end\"><a href=\"#\">Sitemap</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t<span class=\"date\">Segunda, Junho 6, 2011  &nbsp; &nbsp; 17:19</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"wrapper\">\r\n");
      out.write("\t\t\t\t<h1><a href=\"index.html\" id=\"logo\">Pro Soft</a></h1>\r\n");
      out.write("\t\t\t\t<nav>\r\n");
      out.write("\t\t\t\t\t<ul id=\"menu\">\r\n");
      out.write("\t\t\t\t\t\t<li ><a href=\"index.jsp\" ><span><span>Home</span></span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav2\"><a href=\"Features.html\"><span><span>Sobre</span></span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav3\" id=\"menu_active\"><a href=\"adiciona_usuario.jsp\"><span><span>Cadastro</span></span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav4\"><a href=\"login.jsp\"><span><span>Login</span></span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav5\"><a href=\"Contacts.html\"><span><span>Contato</span></span></a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</header><div class=\"ic\">More Website Templates  at TemplateMonster.com!</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<article id=\"content\">\r\n");
      out.write("\t\t  <section class=\"col1\">\r\n");
      out.write("\t\t\t\t<h2 class=\"pad_bot1\">Seja bem vindo!</h2> \r\n");
      out.write("            <p class=\"pad_top1 pad_bot1\">Com a finalização de seu cadastro você já estará apto a acessar e utilizar os nossos serviços. Todos os dados serão salvos em nossa base de dados mas não serão distribuídos e utilizados de outra forma ou para outra finalidade que não a possibilitação de funcionamento do PraOnde.</p>\r\n");
      out.write("            <p class=\"pad_top1 pad_bot1\"></p>\r\n");
      out.write("                <p class=\"pad_top1 pad_bot1\"></p>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("\t\t  </section>\r\n");
      out.write("\t\t\t<section class=\"col2\">\r\n");
      out.write("\t\t\t\t<h2 class=\"pad_bot1\">Cadastro</h2>\r\n");
      out.write("\t\t\t\t<form id=\"ContactForm\" name=\"form1\" action=\"adicionaUsuario\" onSubmit=\"return (valida())\" enctype=\"multipart/form-data\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t<div>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div  class=\"wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>Email:</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bg\"><input type=\"text\" class=\"input\" name=\"email\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("                        <div  class=\"wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>Senha:</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bg\"><input type=\"text\" class=\"input\" name=\"senha\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("                        <div  class=\"wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>Nome:</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bg\"><input type=\"text\" class=\"input\" name=\"nome\"/></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div  class=\"wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>Sexo:</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bg\">\r\n");
      out.write("\t\t\t\t\t\t\t<select name=\"sexo\">\r\n");
      out.write("\t\t\t\t\t\t\t  <option value=\"m\">Masculino</option>\r\n");
      out.write("\t\t\t\t\t\t\t  <option value=\"f\">Feminino</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>                        \r\n");
      out.write("\t\t\t\t\t\t<div  class=\"wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>CPF:</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bg\"><input type=\"text\" class=\"input\" name=\"cpf\" onKeyPress=\"mascara(this, '###.###.###-##')\" maxlength=14></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div  class=\"wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>Nascimento:</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bg\"><input type=\"text\" class=\"input\" name=\"nascimento\" onKeyPress=\"mascara(this, '##/##/####')\" maxlength=10></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write(" \t\t\t\t\t\t<div  class=\"wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>País:</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bg\"><input type=\"text\" class=\"input\" name=\"pais\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div  class=\"wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>Cidade:</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bg\"><input type=\"text\" class=\"input\" name=\"cidade\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("                        <div  class=\"wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>Endereço:</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bg\"><input type=\"text\" class=\"input\" name=\"endereco\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div  class=\"wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>Telefone:</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bg\"><input type=\"text\" class=\"input\" name=\"telefone\" onKeyPress=\"mascara(this, '##.####-####')\" maxlength=12></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div  class=\"wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>Celular:</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bg\"><input type=\"text\" class=\"input\" name=\"celular\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div  class=\"wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>Foto:</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bg\"><input type=\"file\" class=\"input\" name=\"arquivo\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"todo\" value=\"upload\">\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"button\" onClick=\"document.getElementById('ContactForm').submit()\">Enviar</a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"button\" onClick=\"document.getElementById('ContactForm').reset()\">Limpar</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("       \t\t</section>\r\n");
      out.write("\t\t</article>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"body2\">\r\n");
      out.write("\t<div class=\"main\">\r\n");
      out.write("\t\t<article id=\"content2\">\r\n");
      out.write("\t\t\t<section class=\"col1\">\r\n");
      out.write("\t\t\t\t<h3>Newsletter</h3>\r\n");
      out.write("\t\t\t\t<form id=\"newsletter\">\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"bg\">\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"input\" type=\"text\" value=\"Type Your Email Here\"  onblur=\"if(this.value=='') this.value='Type Your Email Here'\" onFocus=\"if(this.value =='Type Your Email Here' ) this.value=''\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"button\" onClick=\"document.getElementById('ContactForm').submit()\">Subscribe</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("       \t\t</section>\r\n");
      out.write("\t\t\t<section class=\"col_1\">\r\n");
      out.write("\t\t\t\t<h3>Why Us?</h3>\r\n");
      out.write("\t\t\t\t<ul class=\"list1\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Sed ut perspiciatis</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Unde oiste natus erturor</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Sit voluptatem accusa</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("       \t\t</section>\r\n");
      out.write("\t\t\t<section class=\"col_2\">\r\n");
      out.write("\t\t\t\t<h3>Follow Us</h3>\r\n");
      out.write("\t\t\t\t<ul id=\"icons\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><img src=\"images/icon1.jpg\" alt=\"\">Facebook</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><img src=\"images/icon2.jpg\" alt=\"\">Twitter</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><img src=\"images/icon3.jpg\" alt=\"\">LinkedIn</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("       \t\t</section>\r\n");
      out.write("\t\t\t<section class=\"col_1\">\r\n");
      out.write("\t\t\t\t<h3>Address</h3>\r\n");
      out.write("\t\t\t\t<p class=\"address\">\r\n");
      out.write("\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\tCountry:<br>\r\n");
      out.write("\t\t\t\t\t\tCity:<br>\r\n");
      out.write("\t\t\t\t\t\tEmail:\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\tUSA<br>\r\n");
      out.write("\t\t\t\t\tSan Diego<br>\r\n");
      out.write("\t\t\t\t\t<a href=\"mailto:\">prosoft@mail.com</a>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("       \t\t</section>\r\n");
      out.write("\t\t</article>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("\t<footer>\r\n");
      out.write("\t\t<a rel=\"nofollow\" href=\"http://www.templatemonster.com/\" target=\"_blank\">Website Template</a> by TemplateMonster.com | <a rel=\"nofollow\" href=\"http://www.html5xcss3.com/\" target=\"_blank\">html5xcss3.com</a><br>\r\n");
      out.write("\t\t<a href=\"http://www.templates.com/product/3d-models/\" target=\"_blank\">3D Models</a> provided by Templates.com\r\n");
      out.write("\r\n");
      out.write("\t</footer>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\"> Cufon.now();</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
