package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import Utilities.Criptografia;


import Dao.Usuario;
import Dao.UsuarioDAO;
/**
 * Servlet implementation class AdicionaContatoServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }
       
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		String usuario = "";
		String senha = "";
		
		if (ServletFileUpload.isMultipartContent(request)) {
			
			ServletFileUpload servletFileUpload = new ServletFileUpload(
						new DiskFileItemFactory());
	 
			List fileItemsList = null;
	 
			try {
				fileItemsList = servletFileUpload.parseRequest(request);
			} catch (FileUploadException e1) {
				e1.printStackTrace();
			}
	 
			String optionalFileName = "";
			FileItem fileItem = null;
	 
			Iterator it = fileItemsList.iterator();
	 
			while (it.hasNext()) {
	 
				FileItem fileItemTemp = (FileItem) it.next();
				
				if (fileItemTemp.isFormField()) {
					if (fileItemTemp.getFieldName().equals("usuario")) {
						usuario = fileItemTemp.getString();
					}else if (fileItemTemp.getFieldName().equals("senha")){
						senha = fileItemTemp.getString();
					}
				}
			}
		}
		
		UsuarioDAO udao = new UsuarioDAO();
		Usuario u = udao.getUsuario(usuario);
		
		
		
		out.println("<html>");
		out.println("<body>");
		
		if(u.getSenha()!=null){
			if(u.getSenha().equals(Criptografia.encrypt(usuario,senha))){
				request.getSession().setAttribute("usuario", usuario);
				out.println("<meta http-equiv=\"refresh\" content=\"1; url=usuarioLogado.jsp\">");	
			}else{
				request.setAttribute("error", "Erro de login!");
				out.println("<meta http-equiv=\"refresh\" content=\"1; url=erroLogin.jsp\">");	
			}
		}else{
			out.println("<meta http-equiv=\"refresh\" content=\"1; url=erroLogin.jsp\">");	
		}
		
		
		
		
		out.println("</body>");
		out.println("</html>");
	}	
}
