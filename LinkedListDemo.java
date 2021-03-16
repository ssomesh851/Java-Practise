package com.example.prgms;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l = new LinkedList();
		l.add("durga");
		l.add(30);
		l.add(null);
		l.add("durga");
		l.add(0,"software");
		l.add(0, "venky");
		l.removeLast();
		l.addFirst("cc");
		System.out.println(l);
		

	}

}
