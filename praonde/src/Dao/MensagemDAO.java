package Dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.ArrayList;

import Utilities.Conexao;
import Dao.Usuario;

public class MensagemDAO {
    private static PreparedStatement pstmt = null;
    private static ResultSet rs = null;
 /**   
    public static boolean create(Usuario usuario) {
        try {
            usuario.setIdUsuario(Conexao.getAutoInc("usuarios"));
            pstmt = Conexao.getConnection().prepareStatement(
                    "Insert Into usuarios(idUsuario, email, nome, endereco, cpf, nascimento, pais, " +
                    "cidade, usualter, dtalter, senha, telefone, celular) Values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pstmt.setInt(1, usuario.getIdUsuario());
            pstmt.setString(2, usuario.getEmail());
            pstmt.setString(3,usuario.getNome());
            pstmt.setString(4, usuario.getEndereco());
            pstmt.setInt(5, usuario.getCpf());
            pstmt.setString(6, usuario.getNascimento());
            pstmt.setString(6, usuario.getPais());
            pstmt.setString(6, usuario.getCidade());
            pstmt.setInt(6, usuario.getUsualter());
            pstmt.setString(6, usuario.getDtalter());
            pstmt.setString(6, usuario.getSenha());
            pstmt.setString(6, usuario.getTelefone());
            pstmt.setString(6, usuario.getCelular());
            
            pstmt.executeUpdate();
            pstmt.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
  **/  
    
	private Connection connection;
    public ConnectionFactory conexta;
	
	public MensagemDAO() {
		this.connection = new ConnectionFactory().getConnection();	
	}
	
    public void adiciona(Mensagem msg) {
		String sql = "INSERT INTO mensagens (idMensagem, idUsuario1, idUsuario2, mensagem, dataHora, lida) " +
				"VALUES (?,?,?,?,?,?)";
		try {	
			// prepared statement para inserção		
			PreparedStatement stmt = connection.prepareStatement(sql);
			FileInputStream fis = null;
			// seta os valores
			
			stmt.setInt(1,msg.getIdMensagem());
			stmt.setInt(2, msg.getIdUsuario1());
			stmt.setInt(3, msg.getIdUsuario2());
			stmt.setString(4, msg.getMensagem());
			stmt.setString(5, msg.getDataHora());
			stmt.setInt(6, msg.getLida());
			
			// executa
			stmt.execute();
			stmt.close();
			connection.close();
			
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}		
	}
    
    public void remove (int ids[]){
		String auxiliar="";
		for (int i=0; i<ids.length; i++){
			if(auxiliar=="" && ids[i]!=0){
				auxiliar= Integer.toString(ids[i]);
			}else if (ids[i]!=0){
				auxiliar=auxiliar+ ", " + Integer.toString(ids[i]);
			}
		}
		System.out.println("Auxiliar: " + auxiliar);
		String sql = "delete from mensagens where idMensagem in("+auxiliar+")";
		try{
			PreparedStatement stmt = connection.prepareStatement(sql);			
			stmt.execute();
			stmt.close();
			connection.close();
		}catch (SQLException e){
			throw new RuntimeException(e);
		}
	}

    public ArrayList<Mensagem> getListaMensagens(int idUsuario1, int idUsuario2) {
        try {
            ArrayList<Mensagem> listAll = new ArrayList<Mensagem>();
            Mensagem msg = new Mensagem();
            String sql = "SELECT * FROM mensagens WHERE idUsuario1 = " + idUsuario1 + " and idUsuario2 = " + idUsuario2 +
             			 " OR idUsuario1 = " + idUsuario2 + " and idUsuario2 = " + idUsuario1;
            PreparedStatement stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();
            if (rs.next()) {
                listAll = new ArrayList<Mensagem>();
                do {
                	msg = new Mensagem();
                	msg.setIdMensagem(rs.getInt("idMensagem"));
                	msg.setIdUsuario1(rs.getInt("idUsuario1"));
                	msg.setIdUsuario2(rs.getInt("idUsuario2"));
                    msg.setMensagem(rs.getString("mensagem"));
                    msg.setLida(rs.getInt("lida"));
                    msg.setDataHora(rs.getString("dataHora"));
                    listAll.add(msg);
                } while (rs.next());
            }
            rs.close();
            stmt.close();
            return listAll;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }    
    
    public ArrayList<Usuario> getConversas(int idUsuario) {
        try {
            ArrayList<Usuario> listAll = new ArrayList<Usuario>();
            UsuarioDAO udao = new UsuarioDAO();
            Usuario usu = new Usuario();
            String sql = "SELECT idUsuario2 FROM mensagens WHERE idUsuario1 =" + idUsuario +" group by idUsuario2";
            PreparedStatement stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();
            if (rs.next()) {
                do {
                	usu = udao.getById(rs.getInt("idUsuario2"));
                	listAll.add(usu);
                } while (rs.next());
            }
            rs.close();
            String sql2 = "SELECT idUsuario1 FROM mensagens WHERE idUsuario2 =" + idUsuario + " group by idUsuario1";
            stmt = connection.prepareStatement(sql2);
            rs = stmt.executeQuery();
            if (rs.next()) {
                do {
                	usu = udao.getById(rs.getInt("idUsuario1"));
                	listAll.add(usu);
                } while (rs.next());
            }
            
            ArrayList<Usuario> listaArrumada = new ArrayList<Usuario>();
                      
            boolean achou = false;
            
            for(Usuario usux : listAll){
            	for (Usuario usuy : listaArrumada){
            		if(usux.getIdUsuario()==usuy.getIdUsuario()){
            			achou = true;
            		}
            	}
            	if (!achou){
            		listaArrumada.add(usux);
            	}
            }
            
        	System.out.println(listaArrumada.size());
        	
            rs.close();
            stmt.close();
            return listaArrumada;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }	
    
    public int getNaoLidas(int idUsuario) {
        try {
            int naoLidas = 0;
            String sql = "SELECT COUNT(*) naoLidas FROM mensagens WHERE idUsuario2 =" + idUsuario +" AND lida = 0";
            PreparedStatement stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();
            if (rs.next()) {
            	naoLidas = rs.getInt("naoLidas");
            }
            rs.close();
            stmt.close();
            return naoLidas;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }	

    public int getNaoLidas(int idUsuario1, int idUsuario2) {
        try {
            int naoLidas = 0;
            String sql = "SELECT COUNT(*) naoLidas FROM mensagens WHERE idUsuario2 =" + idUsuario1 +" AND " +
            		"idUsuario1 = " + idUsuario2 + " AND lida = 0";
            PreparedStatement stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();
            if (rs.next()) {
            	naoLidas = rs.getInt("naoLidas");
            }
            rs.close();
            stmt.close();
            return naoLidas;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public int updateLidas(int idUsuario1, int idUsuario2) {
        try {
            int naoLidas = 0;
            String sql = "UPDATE mensagens SET lida = 1 WHERE idUsuario2 =" + idUsuario1 +" AND " +
            		"idUsuario1 = " + idUsuario2 + " AND lida = 0";
            PreparedStatement stmt = connection.prepareStatement(sql);
            System.out.println(sql);
            stmt.executeUpdate();
            stmt.close();
            return naoLidas;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
}