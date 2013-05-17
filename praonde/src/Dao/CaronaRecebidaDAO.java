package Dao;

import java.sql.*;
import java.util.ArrayList;

import Utilities.Conexao;

public class CaronaRecebidaDAO {
    private static PreparedStatement pstmt = null;
    
    private static ResultSet rs = null;
	private Connection connection;
    public ConnectionFactory conexta;
	
	public CaronaRecebidaDAO() {
		this.connection = new ConnectionFactory().getConnection();	
	}
/**	
    public void adiciona(CaronaPedida carona) {
		String sql = "INSERT INTO caronas (idCaronaRecebida, idCaronaOferecida, idUsuario) " +
				" VALUES (?,?,?)";
		try {	
			// prepared statement para inserção		
			PreparedStatement stmt = connection.prepareStatement(sql);						
			// seta os valores
			stmt.setInt(1,carona.getIdCaronaRecebida());
			stmt.setInt(2,carona.getIdCaronaOferecida());
			stmt.setInt(3, carona.getIdUsuario());
			
			// executa
			stmt.execute();
			stmt.close();
			connection.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}		
	}
    
    public static boolean update(CaronaPedida carona) {
        try {
            pstmt = Conexao.getConnection().prepareStatement(
                    "Update caronas Set idCaronaRecebida=?, idCaronaOferecida=?, idUsuario=? where idCaronaRecebida = ?");
            pstmt.setInt(1, carona.getIdCaronaRecebida());
            pstmt.setInt(2, carona.getIdCaronaOferecida());
            pstmt.setInt(3, carona.getIdUsuario());
            
            pstmt.executeUpdate();
            pstmt.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static boolean delete(CaronaPedida carona) {
        try {
            pstmt = Conexao.getConnection().prepareStatement(
                    "Delete From caronas Where idCaronaRecebida = ?");
            pstmt.setInt(1, carona.getIdCaronaRecebida());
            pstmt.executeUpdate();
            pstmt.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static ArrayList<CaronaPedida> getAll() {
        try {
            ArrayList<CaronaPedida> listAll = null;
            CaronaPedida carona = new CaronaPedida();
            pstmt = Conexao.getConnection().prepareStatement(
                    "Select * From caronasRecebidas Order By idCaronaOferecida");
            rs = pstmt.executeQuery();
            if (rs.next()) {
                listAll = new ArrayList<CaronaPedida>();
                do {
                    carona = new CaronaPedida();
                    carona.setIdCaronaRecebida(rs.getInt("idCaronaRecebida"));
                    carona.setIdCaronaOferecida(rs.getInt("idCaronaOferecida"));
                    carona.setIdUsuario(rs.getInt("idUsuario"));
                    listAll.add(carona);
                } while (rs.next());
            }
            rs.close();
            pstmt.close();
            return listAll;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static CaronaPedida getById(int Id) {
        try {
            CaronaPedida carona = null;
            pstmt = Conexao.getConnection().prepareStatement(
                    "Select * From caronasRecebidas Where idCaronaRecebida = ?");
            pstmt.setInt(1, Id);
            rs = pstmt.executeQuery();
            if (rs.next()) {
            	carona = new CaronaPedida();
                carona.setIdCaronaRecebida(rs.getInt("idCaronaRecebida"));
                carona.setIdCaronaOferecida(rs.getInt("idCaronaOferecida"));
                carona.setIdUsuario(rs.getInt("idUsuario"));
            }
            rs.close();
            pstmt.close();
            return carona;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
            
	public int getLast() {
		try{
			int id = 0;
			PreparedStatement stmt = this.connection.prepareStatement("SELECT MAX( idCaronaRecebida ) as idCaronaRecebida FROM caronasRecebidas");
			ResultSet rs = stmt.executeQuery();
			while (rs.next())
			id = rs.getInt("idCaronaRecebida");
			rs.close();
			stmt.close();
			return id;
		}catch (SQLException e){
		throw new RuntimeException(e);
		}
	}   
    **/
}