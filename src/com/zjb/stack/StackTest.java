package com.zjb.stack;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		st.push("Java");
		st.push("C++");
		st.push("PHP");
		
		System.out.println("The stack top is: " + st.peek());
		System.out.println("The stack top is: " + st.pop());
		System.out.println("The stack top is: " + st.peek());
	}

}
