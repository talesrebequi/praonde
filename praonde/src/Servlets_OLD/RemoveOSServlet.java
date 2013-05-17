package Servlets_OLD;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.*;
import Dao_OLD.OSDAO;

/**
 * Servlet implementation class AdicionaContatoServlet
 */
public class RemoveOSServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException {
	
		PrintWriter out = response.getWriter();
		// pegndo os par�metros do request
		int idOS = Integer.parseInt(request.getParameter("idOS"));
		OSDAO cdao = new OSDAO();
		
		int array[] = new int[1];
		array[0] = idOS;
		cdao.remove(array);
		
		out.println("<html>");
		out.println("<body>");
		out.println("<meta http-equiv=\"refresh\" content=\"1; url=consultaOS?valor=0&dimensao=maior&parametro=idOS\">");
		out.println("</body>");
		out.println("</html>");	
		
	}	
}