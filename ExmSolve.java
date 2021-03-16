package com.example.prgms;

public class ExmSolve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 1;
		int max = 100;
		while(max>0) {
			int a = max%10;
			max = max/10;
			
			System.out.println("Percentile "+a);
			System.out.println("Modulo Division "+max);
			count++;
		}
		
		System.out.println(45.4%10);
		System.out.println(454/10);

	}

}
