package com.example.prgms;

import java.util.Stack;

public class ExampleStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stack follows LastInFirstOut
		Stack s = new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println(s);
		System.out.println(s.search("A"));
		System.out.println(s.search("Z"));
		System.out.println(s.search("C"));
		
		

	}

}
