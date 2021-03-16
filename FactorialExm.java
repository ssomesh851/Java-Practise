package com.example.prgms;

import java.math.BigInteger;
import java.util.*;
public class FactorialExm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);
		System.out.println("enter the number:");
		int a = obj.nextInt();

		int factorial = fact(a);

		System.out.println("the factorial number is:  "+ factorial);

	}

	static int fact(int i) {
	    int output;
	    if(i==1) {
	    	return 1;
	    }
		
		output = (fact(i-1)*i);
		return output;

	}

}
