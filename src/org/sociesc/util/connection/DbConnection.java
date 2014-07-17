package org.sociesc.util.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbConnection {

	private Connection conn;
	private String url = "jdbc:mysql://localhost:3306"; 
	private String database = "tsi";
	private String login = "root";
	private String password = "";
	
	public DbConnection() {
		this.getConnection();
	}
	
	public Connection getConnection() {
		if (conn == null) {
			try {
				// Registering the mysql Driver
	            Class.forName("com.mysql.jdbc.Driver").newInstance();
	            
	            try {
	            	// Criando a conexão
	            	conn = DriverManager.getConnection(getFullUrl(), getLogin(), getPassword());
	            	
	            } catch (Exception e) {
	                System.out.println("\nErro na criação de conexão!");
	                System.out.println(e.getMessage());
	            }
	        } catch (Exception e) {
	            System.out.println("\nDriver não pode ser carregado!");
                System.out.println(e.getMessage());
	        }
		}
	
		return conn;
	}

    public void executeUpdate(String sql) {
        
    	try {
            Statement stm = conn.createStatement();
            try {
                stm.executeUpdate(sql);
            } catch (Exception e) {
                System.out.println("\nErro no resultset!\n" + e);
            }
        } catch (Exception e) {
            System.out.println("\nErro no statement!");
        }

    }

    public ResultSet executeQuery(String sql) {
    	ResultSet rs = null;
        
        try {
            Statement stm = conn.createStatement();
            try {
                rs = stm.executeQuery(sql);
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println("\nErro no statement!");
        }
        
        return rs;
    }
    
    private String getFullUrl() {
    	return this.url + "/" + this.database;
    }
    
    private String getLogin() {
    	return this.login;
    }
    
    private String getPassword() {
    	return this.password;
    }
}
