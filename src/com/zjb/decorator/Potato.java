package com.zjb.decorator;

public class Potato implements Food {
	
	private Food food = null;
	
	public Potato(Food food) {
		this.food = food;
	}

	@Override
	public String getDes() {
		return food.getDes() + ", 土豆";
	}

	@Override
	public Double getCost() {
		return food.getCost() + 2D;
	}

}
