package com.example.prgms;

public class ExmLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		int count = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(" * ");
			}
			//count++;
			System.out.println();
			
		}
		
		for(int b = 0; b < a; b++) {
			for(int c = 2*(a-b); c>=0; c--) {
				System.out.print(" ");
			}
			for(int d = 0; d <= b; d++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

}
