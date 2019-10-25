package com.zjb.publish;

public class Student extends Subscriber {

	@Override
	public void doAction() {
		System.out.println("学生接到了学校的通知!");
	}

}
