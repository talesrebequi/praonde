package Servlets;
 
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;

import Utilities.*;
 
import Dao.Upload;
import Dao.Usuario;
import Dao.UsuarioDAO;



/**
 * Servlet implementation class ServletUpload
 */
//@WebServlet("/upload")
public class AdicionaUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdicionaUsuarioServlet() {
        super();
    }
 
    /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
	PrintWriter out = response.getWriter();
		
	if (ServletFileUpload.isMultipartContent(request)) {
		String arquivo="";
		String sexo ="";
		String email="";
		int cont = 0;
		Usuario usu = new Usuario();
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
			
			if (fileItemTemp.isFormField()) {
				if (fileItemTemp.getFieldName().equals("arquivo")) {
					optionalFileName = fileItemTemp.getString();
					System.out.println("LI NO FORM:"+optionalFileName);
				}else if (fileItemTemp.getFieldName().equals("email")){
					email = fileItemTemp.getString();
					usu.setEmail(fileItemTemp.getString());
					System.out.println("LI NO FORM:"+email);
				}else if (fileItemTemp.getFieldName().equals("senha")){
					usu.setSenha(fileItemTemp.getString());
					System.out.println("LI NO FORM:"+fileItemTemp.getString());
				}else if (fileItemTemp.getFieldName().equals("nome")){
					usu.setNome(fileItemTemp.getString());
				}else if (fileItemTemp.getFieldName().equals("sexo")){
					usu.setSexo(fileItemTemp.getString());
					sexo = fileItemTemp.getString();
				}else if (fileItemTemp.getFieldName().equals("cpf")){
					usu.setCpf(fileItemTemp.getString());
				}else if (fileItemTemp.getFieldName().equals("nascimento")){
					usu.setNascimento(fileItemTemp.getString());
				}else if (fileItemTemp.getFieldName().equals("pais")){
					usu.setPais(fileItemTemp.getString());
				}else if (fileItemTemp.getFieldName().equals("cidade")){
					usu.setCidade(fileItemTemp.getString());
				}else if (fileItemTemp.getFieldName().equals("endereco")){
					usu.setEndereco(fileItemTemp.getString());
				}else if (fileItemTemp.getFieldName().equals("telefone")){
					usu.setTelefone(fileItemTemp.getString());
				}else if (fileItemTemp.getFieldName().equals("celular")){
					usu.setCelular(fileItemTemp.getString());
				}
			}else{
				fileItem = fileItemTemp;
			}
 
			if (cont != (fileItemsList.size())) {
				if (fileItem != null) {
 
					String fileName = fileItem.getName();
					InputStream is = fileItem.getInputStream();
					
					if (fileItem.getSize() > 0) {
 
						if (optionalFileName.trim().equals("")) {
							fileName = FilenameUtils.getName(fileName);
						} else {
							fileName = optionalFileName;
						}
 
						//String dirName = "C:\\Users\\Bruno\\Desktop\\Sistema PraOnde\\praonde\\praonde\\WebContent\\fotos\\usuarios\\"; //caminho para o projeto
						//dirName = "/home/grupocep/public_html/TEMP/";
						
						UUID uuid = UUID.randomUUID();  
						arquivo=uuid.toString() + fileName.substring(fileName.lastIndexOf("."),fileName.length());
						//File saveTo = new File(dirName + arquivo);
						File saveTo = new File(arquivo);
						try {
							EnviaFTP.upload(fileItem, arquivo);
							//fileItem.write(saveTo);
							usu.setFoto(arquivo);
						} catch (Exception e) {
							
						}
 
					}
				}else{
					System.out.println(sexo);
					if(sexo.equals("f")){
						usu.setFoto("User-female-icon.png");
					}else{
						usu.setFoto("User-male-icon.png");
					}
				}
			}
		} 
		
		UsuarioDAO dao = new UsuarioDAO();
		dao.adiciona(usu);
 
		UsuarioDAO dao2 = new UsuarioDAO();
		int idUsuario2 = dao2.getLast();
		
		request.getSession().setAttribute("usuario", usu.getEmail());
		
		System.out.println(arquivo);
		out.println("<html>");
		out.println("<body>");
		out.println("<meta http-equiv=\"refresh\" content=\"1; url=usuarioLogado.jsp?idUsuario="+idUsuario2+"\">");
		out.println("</body>");
		out.println("</html>");
	} else {
		out.print("Arquivo não enviado!");
	}
    }
}