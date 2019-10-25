package com.zjb.publish;

public class Main {

	public static void main(String[] args) {
		Teacher t = new Teacher();
		Student s = new Student();
		
		t.subscribe();
		s.subscribe();
		
		Pubilsher.publish();
		
		t.cancel();
		Pubilsher.publish();
	}

}
