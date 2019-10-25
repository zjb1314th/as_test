package com.zjb.single;

public class Single {
	
	private static Single single = new Single();
	
	public static Single getInstance() {
		return single;
	}

}
