package com.zjb.extend;

public class Son extends Father {
	
	private String testStr = "son field";
	
	public Son() {
		System.out.println("进入Son的构造方法，此时Son中的testStr=" + testStr);
	}

	public void testMethod() {
		System.out.println("进入Son的testMethod方法，此时Son中的testStr=" + testStr);
	}
	
	public static void main(String[] args) {
		new Son();
	}
}
