package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;

import models.Bee;

public class SaveDAO {

	public SaveDAO() {
		// TODO Auto-generated constructor stub
	}

	public void save(ArrayList<Bee> listBee){
		ConnectDAO connectDAO = new ConnectDAO();
		String sql = "Insert into bee values(?,?,?,?)";
		try {
			PreparedStatement preStmt = (PreparedStatement) connectDAO.getConnection().prepareStatement(sql);
			for(int i = 0; i<listBee.size();i++){				
				preStmt.setInt(1, listBee.get(i).getId());
				preStmt.setString(2, listBee.get(i).getName());
				preStmt.setFloat(3, listBee.get(i).getHealth());
				preStmt.setInt(4, listBee.get(i).getType());
				preStmt.execute(); 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
