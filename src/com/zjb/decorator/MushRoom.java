package com.zjb.decorator;

public class MushRoom implements Food {

	
	private Food food = null;
	
	public MushRoom(Food food) {
		this.food = food;
	}
	
	@Override
	public String getDes() {
		return food.getDes() + ", 蘑菇";
	}

	@Override
	public Double getCost() {
		return food.getCost() + 2D;
	}

}
