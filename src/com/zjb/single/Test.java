package com.zjb.single;

public class Test {

	public static void main(String[] args) {
		
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		System.out.println(s1.equals(s2));
	}

}
