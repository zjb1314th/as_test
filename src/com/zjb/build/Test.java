package com.zjb.build;

public class Test {

	public static void main(String[] args) {
		Student student = Student.builder().name("张三").age(12).build();

		System.out.println(student);
	}

}
