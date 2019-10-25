package com.zjb.publish;

public class Teacher extends Subscriber{

	@Override
	public void doAction() {
		System.out.println("老师接到了学校的通知!");
	}

}
