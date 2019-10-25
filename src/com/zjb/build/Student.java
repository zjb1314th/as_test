package com.zjb.build;

public class Student {

	private String name;

	private int age;

	private String address;

	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public static StudentBuilder builder() {
		return new StudentBuilder();
	}

	public String toString() {
		return "Student(name = " + name + ", age = " + age + ", address = " + address + ")";
	}

}
