package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.CaronaOferecida;
import Dao.CaronaOferecidaDAO;
import Dao.Parada;
import Dao.ParadaDAO;

public class AdicionaCaronaOferecidaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	       
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException {
		 
		PrintWriter out = response.getWriter();

		
		// pegndo os parâmetros do request
		String origem = request.getSession().getAttribute("origem").toString();
		String destino = request.getSession().getAttribute("destino").toString();
		int idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
		int idVeiculo = Integer.parseInt(request.getParameter("veiculo"));
	    String horaSaida = request.getParameter("horaSaida");
	    String horaChegada = request.getParameter("horaChegada");
	    int vagas = Integer.parseInt(request.getParameter("vagas"));
	    double kgBagagem = Double.parseDouble(request.getParameter("kgBagagem"));
	    double preco = Double.parseDouble(request.getParameter("valor"));
	    int tempoEspera = Integer.parseInt(request.getParameter("tempoEspera"));
	    String observacoes = request.getParameter("observacoes");
	    String data = request.getParameter("data");
	    String status = "Nova";
	    
		System.out.println("Origem2:" + origem);
		System.out.println("Destino2:" + destino);
		
		CaronaOferecida carona = new CaronaOferecida();
		carona.setStatus(status);
		carona.setOrigem(origem);
		carona.setDestino(destino);
		carona.setIdCarro(idVeiculo);
		carona.setIdUsuario(idUsuario);
		carona.setHoraSaida(horaSaida);
		carona.setHoraChegada(horaChegada);
		carona.setVagas(vagas);
		carona.setKgBagagem(kgBagagem);
		carona.setValor(preco);
		carona.setTempoEspera(tempoEspera);
		carona.setObservacoes(observacoes);
		carona.setData(data);
		
		CaronaOferecidaDAO dao = new CaronaOferecidaDAO();
		dao.adiciona(carona);

		CaronaOferecidaDAO dao2 = new CaronaOferecidaDAO();
		int idCarona2 = dao2.getLast();
		
		int count = Integer.parseInt(request.getParameter("count"));
				
		ParadaDAO pdao = new ParadaDAO();
				
		for (int i =0 ; i<count; i++){
			String parada = request.getSession().getAttribute("inputAdd"+i).toString();
			Parada p = new Parada();
			p.setIdCaronaOferecida(idCarona2);
			p.setParada(parada);
			pdao.adiciona(p);
		}
		
		out.println("<html>");
		out.println("<body>");
		out.println("<meta http-equiv=\"refresh\" content=\"1; url=exibe_caronaOferecida.jsp?idCarona="+idCarona2+"\">");
		out.println("</body>");
		out.println("</html>"); 
	}
}
