package com.example.prgms;

public class PyramidExm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,row=6;

		/*for(i=0; i<row; i++) {
			for(j=row-i; j>1; j--) {
				System.out.print(" ");
		}
			//System.out.println();
			
		for(j = 0; j<=i; j++) {
			System.out.print("* ");
		}

		System.out.println();
	}
		*/
		
		
		for(i=0; i<4; i++) {
			for(j=4; j>1; j--) {
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			for(int a = 2; a<=i; a++) {
			System.out.print();
		}
				
	}
}
