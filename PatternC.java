package com.example.prgms;

public class PatternC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i <= 7; i++) {
			for(int j = 0; j <= 5; j++) {
				if((i == 0 && j >=2 ) || (i == 4 && j >= 2) || (i >=1 && i <= 3 && j == 0) || (j==5 && i>=2 && i <=3) || (j==3 && i == 2))
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");	
		}
		
	}

}
