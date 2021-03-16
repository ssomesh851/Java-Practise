package com.example.prgms;

public class Fibonociexm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sum of last two elements will be the next element
		int n = 50, a = 0, b = 1;
		System.out.println("Upto"+n+":");
		while(a<=n) {
			System.out.print(a + "+");
			int c = a+b;
			a = b;
			b = c;
			
		}
		
	
		

	}

}
