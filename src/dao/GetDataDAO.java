package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import models.Bee;

public class GetDataDAO {

	private Connection conn = null;
	
	private ArrayList<Bee> listBee;
	
	public GetDataDAO() {
		listBee = new ArrayList<>();
	}
	
	public ArrayList<Bee> getBee(){		
		String sql = "Select * from bee";
		try {
			ConnectDAO connectDAO = new ConnectDAO();
			conn = connectDAO.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				Bee bee = new Bee();
				bee.setId(rs.getInt(1));
				bee.setName(rs.getString(2));
				bee.setHealth(rs.getFloat(3));
				bee.setType(rs.getInt(4));
				listBee.add(bee);
			}
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listBee;
		
	}
	

}
