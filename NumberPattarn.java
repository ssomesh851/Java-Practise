package com.example.prgms;

public class NumberPattarn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,k=5;
		/*
		for(i=1;i<k;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}


		for(i=1;i<=k;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(j=k;j>=i;j--) {
				System.out.print(" *");
			}
			System.out.println();
		}

		for(i=1;i<k;i++) {
			System.out.print(" ");
			for(j=1; j<=i; j++) {
			System.out.print("*");
		}
			System.out.println();	
	}
		for(i=1;i<=k;i++) {
			System.out.print(" ");
			for(j=k;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		 //left traingle
		  *
		  
		for(i=1;i<k;i++) {
			for(j=k;j>=i;j--) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for(i=k;i>=1;i--) {
			for(j=i;j<=k;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

		
		
		//sandglass star pattern
		
		for(i=k;i>=1;i--) {
			for(j=k;j>=i;j--) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		for(i=1;i<=k;i++) {
			for(j=k;j>=i;j--) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
	  */	
   		for(i=0;i<7;i++) {
   			for(j=7;j>i;j--) {
   				System.out.print(" ");
		}
   			for(j=0;j<=i;j++) {
   				if(i==4 || j==0 || j==i) {
   					System.out.print(" "+"adm");
   				}
   				else {
   					System.out.print(" "+" ");
   				}
   			}
   			System.out.println();
   		}
	}
}