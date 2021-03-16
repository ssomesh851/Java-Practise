package com.example.prgms;

public class Student {
	
	int roll_no;
	String name;
	
	Student(int roll_no, String name){
		this.roll_no = roll_no;
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student stud = new Student(10,"durga");
        System.out.println();
	}

}
