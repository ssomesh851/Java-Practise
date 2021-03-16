package com.example.prgms;

public class NoLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		
		printName(count);
	}
		public static void printName(int count) {
			int max = 1000;
			if(count<=1000) {
				System.out.println("Good morning "+ count);
				count++;
				printName(count);
			
		}
	}
}
