package com.zjb.decorator;

public class Main {

	public static void main(String[] args) {
		MushRoom mr = new MushRoom(new MushRoom(new Rice()));
		
		System.out.println(mr.getDes());
		System.out.println(mr.getCost());
	}

}
