package dao;

import java.util.ArrayList;

import models.Bee;

public class DamageDAO {

	public DamageDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<Bee> damage(ArrayList<Bee> listBee){
		float dmg = (float) (Math.random() *50 +1);
		for(int i = 0; i<listBee.size();i++){
			listBee.get(i).setHealth(listBee.get(i).getHealth()-dmg);
			if(listBee.get(i).getHealth()<=0) listBee.get(i).setHealth(0);
		}
		return listBee;
	}

}
