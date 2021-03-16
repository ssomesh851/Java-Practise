package com.example.prgms;

import java.util.Scanner;

public class PatternExm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,k=5;
		
		/*
		for(i=1; i <= k; i++) {
			for(j = k; j>=i; j--) {
				System.out.print(" ");
			}
			for(int c = 1; c <= i; c++) {
				System.out.print(" *");
			}

			System.out.println();
		} 

		//2 nd pattern

		for(i = 0; i < k; i++) {
			for(j = 0; j <=i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

     //3rd pattern

		for(i = 0; i < k; i++) {
			for(j = k; j >= i; j--) {
				System.out.print(" ");
			}
			for(j = 0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	//4rth pattern

		for(i = 0; i < k; i++) {
			for(j= 0; j<k; j++) {
				System.out.print("*");
			}
			System.out.println();
		}




		for(i = 1; i < k; i++) {
			for(j = k; j> i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		 */

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the input: ");
		int n = obj.nextInt();
		// Diamond pattern
		/*

		for(i = 0; i < n; i++) {
			for(j = n; j >= i; j--) {
				System.out.print(" ");
			}
			for(j = 0; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for(i = 0; i <= n ; i++) {
			for(j = 0; j<=i; j++) {
				System.out.print(" ");
			}
			for(int e = n; e>=i; e--) {
				System.out.print(" *");
			}
			System.out.println();
		}

		
		//diagonal lines
		for(i = 1; i <= n; i++) {
			for(j = 1; j <= i; j++) {
				if(i >= 2 && j<=i-1) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}

			}
			System.out.println();
		}

		for(i = 1; i <= n; i++) {
			for(j = n; j>i; j--) {

				System.out.print(" ");
			}
			for(int s = 1; s<=i; s++) {
				if(i>=2 && s>1) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		*/
		
		for(i = 0; i < n; i++) {
			for(j = k; j >= i; j--) {
				if(i <= 2 && j <= 4) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
}