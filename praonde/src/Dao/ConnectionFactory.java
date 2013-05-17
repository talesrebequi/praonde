package Dao;

import java.sql.*;

public class ConnectionFactory {
	 
	public Connection getConnection() {
		
		try{   
	      Class.forName ("org.gjt.mm.mysql.Driver");  
	    }catch (ClassNotFoundException e)  {    
	          e.printStackTrace();   
	    } 
		try {
			System.out.println("Conectando ao banco");
			return DriverManager.getConnection("jdbc:mysql://198.27.68.39/grupocep_praonde", "grupocep_praonde", "praonde");
			//return DriverManager.getConnection("jdbc:mysql://localhost/praonde", "root", "");
			
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
				
	}
}