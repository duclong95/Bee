package dao;

import java.util.ArrayList;

import models.Bee;

public class CreateDAO {

	private ArrayList<Bee> listBee;
	
	public CreateDAO() {
		listBee = new ArrayList<>();
	}
	
	public ArrayList<Bee> createList(){
		for(int i = 0;i<30;i++){
			Bee bee = new Bee();
			bee.setId(i+1);
			bee.setName("bee"+i);
			bee.setHealth(100);
			if(i<10){
				bee.setType(1);
			}
			else if(i>=10 && i<20){
				bee.setType(2);
			}
			else bee.setType(3);
			listBee.add(bee);
		}
		
		return listBee;
	}

}
