package com.zjb.extend;

public class Father {
	
	private String testStr = "father field";
	
	public Father() {
		System.out.println("进入Father的构造方法，此时Father中的testStr=" + testStr);
		testMethod();
	}

	public void testMethod() {
		System.out.println("进入Father的testMethod方法，此时Father中的testStr=" + testStr);
	}
	
}
