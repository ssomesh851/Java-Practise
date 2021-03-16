package com.example.prgms;

public class Base {
	
	static int x = 10;
	static{
		
		m1();
		System.out.println("FSB");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            m1();
            
            System.out.println("main method");
	}
	public static void m1() {
		
		System.out.println(y);
	}
    static {
    	
    	System.out.println("SSB");
    }
    static int y = 20;
}
