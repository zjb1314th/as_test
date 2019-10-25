package com.zjb.build;

public class StudentBuilder {
	private String name = "Test";
	
	private int age = 0;
	
	private String address = "Test";
	
	public StudentBuilder name(String name) {
		this.name = name;
		return this;
	}
	
	public StudentBuilder age(int age) {
		this.age = age;
		return this;
	}
	
	public StudentBuilder address(String address) {
		this.address = address;
		return this;
	}
	
	public Student build() {
		return new Student(this.name, this.age, this.address);
	}
}
