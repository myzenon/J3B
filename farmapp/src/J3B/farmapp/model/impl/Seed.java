package J3B.farmapp.model.impl;

import J3B.farmapp.model.Item;
import J3B.farmapp.model.Plantable;

public class Seed implements Plantable,Item{
	private String name;
	private Plant plant;
	public Seed(String name,Plant plant){
		this.name = name;
		this.plant = plant;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;	
	}
	public void plant(){
		
	}
	public Plant getPlant(){
		return plant;
	}
}
