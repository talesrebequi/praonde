package Servlets;
 
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;
 
import Dao.Upload;
import Dao.Mensagem;
import Dao.MensagemDAO;
import Dao.Usuario;
import Dao.UsuarioDAO;
 
/**
 * Servlet implementation class ServletUpload
 */
//@WebServlet("/upload")
public class AdicionaMensagemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdicionaMensagemServlet() {
        super();
    }
 
    /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
	PrintWriter out = response.getWriter();
	
	if (ServletFileUpload.isMultipartContent(request)) {
		String arquivo="";
		int cont = 0;
		Mensagem msg = new Mensagem();
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
 
			cont++;
 
			FileItem fileItemTemp = (FileItem) it.next();
			
			UsuarioDAO udao = new UsuarioDAO();
			
			if (fileItemTemp.isFormField()) {
				if (fileItemTemp.getFieldName().equals("usuario")){
					Usuario usu2 = udao.getUsuario(fileItemTemp.getString());
					msg.setIdUsuario2(usu2.getIdUsuario());
				}else if (fileItemTemp.getFieldName().equals("mensagem")){
					msg.setMensagem(fileItemTemp.getString());
				}
			}else{
				fileItem = fileItemTemp;
			}
 		} 
		
		Calendar c = Calendar.getInstance();
		Date data = c.getTime();
		Locale brasil = new Locale("pt", "BR");
		DateFormat f1 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, brasil);
		DateFormat f2 = DateFormat.getDateInstance(DateFormat.FULL, brasil);
		
		msg.setDataHora(f1.format(data));
		msg.setLida(0);
		
		UsuarioDAO udao = new UsuarioDAO();
		Usuario usu = udao.getUsuario(request.getSession().getAttribute("usuario").toString());
		
		msg.setIdUsuario1(usu.getIdUsuario());
		
		MensagemDAO dao = new MensagemDAO();
		dao.adiciona(msg);
		
		MensagemDAO dao2 = new MensagemDAO();
		//int idVeiculo2 = dao2.getLast();
		
	//	request.getSession().setAttribute("veiculo", idVeiculo2);
		
		System.out.println(arquivo);
		out.println("<html>");
		out.println("<body>");
		out.println("<meta http-equiv=\"refresh\" content=\"1; url=exibe_veiculo.jsp\">");
		out.println("</body>");
		out.println("</html>");
	} else {
		out.print("Arquivo não enviado!");
	}
    }
}