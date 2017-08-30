package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDAO {

	String url = "jdbc:mysql://localhost:3306/beedb";
	String username = "root";
	String password = "root";
	
	public ConnectDAO() {
		// TODO Auto-generated constructor stub
		
		
	}
	public Connection getConnection(){
		Connection conn = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,username,password);
			System.out.println("Connected");
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return conn;
	}

}
