package models;

import java.io.Serializable;

public class Bee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private float health;
	private int type;

	public Bee() {
		// TODO Auto-generated constructor stub
	}

	public Bee(int id, String name, float health, int type) {
		super();
		this.id = id;
		this.name = name;
		this.health = health;
		this.type = type;
	}	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getHealth() {
		return health;
	}

	public void setHealth(float health) {
		this.health = health;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	public String getStatus(){
		switch(type){
			case 1: if(health<70) return "Dead";
			case 2: if(health<20) return "Dead";
			case 3: if(health<40) return "Dead";
		}
		return "Alive";
	}
	public String type(){
		switch(type){
			case 1: return "worker";
			case 2: return "queen";
			case 3: return "drone";		
		}
		return null;
	}

}
