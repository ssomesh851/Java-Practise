package com.example.prgms;

import java.util.Scanner;

public class Patternds {
	// TODO Auto-generated method stub
	static Scanner obj = new Scanner(System.in);
	

   // System.out.println("Please Provide a Input as Integer");
	static int n = obj.nextInt();
	void display(int n)
	{
		// Outer for loop for number of lines
		for (int i = 0; i<=n; i++) {
			// Inner for loop for logic execution
			for (int j = 0; j<= n / 2; j++) {
				//System.out.print(j);
				// prints two column lines
				if ((j == 0 || j == n / 2) && i != 0 ||
						// print first line of alphabet
						i == 0  && j != n / 2 ||
						// prints middle line
						i == n / 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		

	     //System.out.println("Please Provide a Input as Integer");
		Scanner sc = new Scanner(System.in);
		//int input = sc.nextInt();
		Patternds a = new Patternds();
		a.display(n);
	}
}
