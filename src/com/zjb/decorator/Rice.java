package com.zjb.decorator;

public class Rice implements Food {
	
	@Override
	public String getDes() {
		return "米饭";
	}

	@Override
	public Double getCost() {
		return 12D;
	}

}
