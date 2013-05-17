package Dao;

import java.sql.*;
import java.util.ArrayList;

import Utilities.Conexao;

public class CaronaOferecidaDAO {
    private static PreparedStatement pstmt = null;
    
    private static ResultSet rs = null;
	private Connection connection;
    public ConnectionFactory conexta;
	
	public CaronaOferecidaDAO() {
		this.connection = new ConnectionFactory().getConnection();	
	}
	
    public void adiciona(CaronaOferecida carona) {
		String sql = "INSERT INTO caronaoferecida " +
				"(" +
					"idCaronaOferecida, " +
					"status, " +
					"idUsuario, " +
					"idCarro, " +
					"origem, " +
					"destino, " +					
					"horaSaida," +
					"horaChegada, " +
					"vagas, " +
					"kgBagagem, " +
					"valor, " +
					"idPropostaCaronaOferecida, " +
					"valorFechado, " +
					"tempoEspera, " +
					"observacoes, " +
					"data)" +
				" VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {	
			// prepared statement para inserção		
			PreparedStatement stmt = connection.prepareStatement(sql);						
			// seta os valores
			stmt.setInt(1,carona.getIdCaronaOferecida());
			stmt.setString(2, carona.getStatus());
			stmt.setInt(3, carona.getIdUsuario());
			stmt.setInt(4, carona.getIdCarro());
			System.out.println("Origem no DAO adiciona: " +carona.getOrigem());
			stmt.setString(5, carona.getOrigem());
			System.out.println("Destino no DAO adiciona: " + carona.getDestino());
			stmt.setString(6, carona.getDestino());
			stmt.setString(7, carona.getHoraSaida());
			stmt.setString(8, carona.getHoraChegada());
			stmt.setInt(9, carona.getVagas());
			stmt.setDouble(10, carona.getKgBagagem());
			stmt.setDouble(11, carona.getValor());
			stmt.setInt(12, carona.getIdCaronaOferecida());
			stmt.setDouble(13, carona.getValorFechado());
			stmt.setInt(14, carona.getTempoEspera());
			stmt.setString(15, carona.getObservacoes());
			stmt.setString(16, carona.getData());
			
			// executa
			stmt.execute();
			stmt.close();
			connection.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}		
	}
    
	public int getLast() {
		try{
			int id = 0;
			PreparedStatement stmt = this.connection.prepareStatement("SELECT MAX( idCaronaOferecida ) as idCaronaOferecida FROM caronaoferecida");
			ResultSet rs = stmt.executeQuery();
			while (rs.next())
				id = rs.getInt("idCaronaOferecida");
			rs.close();
			stmt.close();
			return id;
		}catch (SQLException e){
		throw new RuntimeException(e);
		}
	}  
	
    public CaronaOferecida getById(int idCaronaOferecida) {
        try {
            CaronaOferecida co = new CaronaOferecida();
            String sql = "Select * From caronaoferecida WHERE idcaronaoferecida =" + idCaronaOferecida;
            PreparedStatement stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();            
            if (rs.next()) {
                    co = new CaronaOferecida();
                    co.setIdCaronaOferecida(rs.getInt("idCaronaOferecida"));
                    co.setStatus(rs.getString("status"));
                    co.setIdUsuario(rs.getInt("idUsuario"));
                    co.setIdCarro(rs.getInt("idCarro"));
                    co.setOrigem(rs.getString("origem"));
                    co.setDestino(rs.getString("destino"));
                    co.setHoraSaida(rs.getString("horaSaida"));
                    co.setHoraChegada(rs.getString("horaChegada"));
                    co.setVagas(rs.getInt("vagas"));
                    co.setKgBagagem(rs.getInt("kgBagagem"));
                    co.setValor(rs.getDouble("valor"));
                    co.setIdPropostaCaronaOferecida(rs.getInt("idPropostaCaronaOferecida"));
                    co.setValorFechado(rs.getDouble("valorFechado"));
                    co.setTempoEspera(rs.getInt("tempoEspera"));
                    co.setObservacoes(rs.getString("observacoes"));
                    co.setData(rs.getString("data"));
            }
            rs.close();
            stmt.close();
            return co;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public ArrayList<CaronaOferecida> listAll(int idUsuario) {
        try {
        	ArrayList<CaronaOferecida> lista = null;
            CaronaOferecida co = new CaronaOferecida();
            String sql = "Select * From caronaoferecida WHERE idUsuario =" + idUsuario;
            PreparedStatement stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();     
            if (rs.next()) {
            	lista = new ArrayList<CaronaOferecida>();
                do {
                    co = new CaronaOferecida();
                    co.setIdCaronaOferecida(rs.getInt("idCaronaOferecida"));
                    co.setStatus(rs.getString("status"));
                    co.setIdUsuario(rs.getInt("idUsuario"));
                    co.setIdCarro(rs.getInt("idCarro"));
                    co.setOrigem(rs.getString("origem"));
                    co.setDestino(rs.getString("destino"));
                    co.setHoraSaida(rs.getString("horaSaida"));
                    co.setHoraChegada(rs.getString("horaChegada"));
                    co.setVagas(rs.getInt("vagas"));
                    co.setKgBagagem(rs.getInt("kgBagagem"));
                    co.setValor(rs.getDouble("valor"));
                    co.setIdPropostaCaronaOferecida(rs.getInt("idPropostaCaronaOferecida"));
                    co.setValorFechado(rs.getDouble("valorFechado"));
                    co.setTempoEspera(rs.getInt("tempoEspera"));
                    co.setObservacoes(rs.getString("observacoes"));
                    co.setData(rs.getString("data"));
                    lista.add(co);
                } while (rs.next());
            }
            rs.close();
            stmt.close();
            return lista;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public ArrayList<CaronaOferecida> listAll(String data, double precoDe, double precoAte, double kgBagagem) {
        try {
        	ArrayList<CaronaOferecida> lista = null;
            CaronaOferecida co = new CaronaOferecida();
            String sql = "Select * From caronaoferecida WHERE " +
            			 " data = \"" + data + "\"" +
            			 " AND valor >= " + precoDe +
            			 " AND valor <= " + precoAte +
            			 " AND kgBagagem >= " + kgBagagem;
            System.out.println(sql);
            PreparedStatement stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();     
            if (rs.next()) {
            	lista = new ArrayList<CaronaOferecida>();
                do {
                    co = new CaronaOferecida();
                    co.setIdCaronaOferecida(rs.getInt("idCaronaOferecida"));
                    co.setStatus(rs.getString("status"));
                    co.setIdUsuario(rs.getInt("idUsuario"));
                    co.setIdCarro(rs.getInt("idCarro"));
                    co.setOrigem(rs.getString("origem"));
                    co.setDestino(rs.getString("destino"));
                    co.setHoraSaida(rs.getString("horaSaida"));
                    co.setHoraChegada(rs.getString("horaChegada"));
                    co.setVagas(rs.getInt("vagas"));
                    co.setKgBagagem(rs.getInt("kgBagagem"));
                    co.setValor(rs.getDouble("valor"));
                    co.setIdPropostaCaronaOferecida(rs.getInt("idPropostaCaronaOferecida"));
                    co.setValorFechado(rs.getDouble("valorFechado"));
                    co.setTempoEspera(rs.getInt("tempoEspera"));
                    co.setObservacoes(rs.getString("observacoes"));
                    co.setData(rs.getString("data"));
                    lista.add(co);
                } while (rs.next());
            }
            rs.close();
            stmt.close();
            return lista;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public ArrayList<CaronaOferecida> getNovas() {
        try {
        	ArrayList<CaronaOferecida> lista = null;
            CaronaOferecida co = new CaronaOferecida();
            String sql = "Select * From caronaoferecida ORDER BY idCaronaOferecida DESC LIMIT 0,5";
            PreparedStatement stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();     
            if (rs.next()) {
            	lista = new ArrayList<CaronaOferecida>();
                do {
                    co = new CaronaOferecida();
                    co.setIdCaronaOferecida(rs.getInt("idCaronaOferecida"));
                    co.setStatus(rs.getString("status"));
                    co.setIdUsuario(rs.getInt("idUsuario"));
                    co.setIdCarro(rs.getInt("idCarro"));
                    co.setOrigem(rs.getString("origem"));
                    co.setDestino(rs.getString("destino"));
                    co.setHoraSaida(rs.getString("horaSaida"));
                    co.setHoraChegada(rs.getString("horaChegada"));
                    co.setVagas(rs.getInt("vagas"));
                    co.setKgBagagem(rs.getInt("kgBagagem"));
                    co.setValor(rs.getDouble("valor"));
                    co.setIdPropostaCaronaOferecida(rs.getInt("idPropostaCaronaOferecida"));
                    co.setValorFechado(rs.getDouble("valorFechado"));
                    co.setTempoEspera(rs.getInt("tempoEspera"));
                    co.setObservacoes(rs.getString("observacoes"));
                    co.setData(rs.getString("data"));
                    lista.add(co);
                } while (rs.next());
            }
            rs.close();
            stmt.close();
            return lista;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}