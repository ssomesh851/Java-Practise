package com.example.prgms;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class CalculatorExm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	final Logger logger = Logger.getLogger(CalculatorExm.class);
	
	logger.info("calcular program started");
	System.out.println("Welcome to the Calculator");
		
		Scanner obj = new Scanner(System.in);
		while(true) {
		System.out.println("Enter the values:");
		float a = obj.nextFloat();
		float b = obj.nextFloat();
		
		float d = 0;
		
		System.out.println("choose the operations which you would like to perform");
		System.out.println("1. Addition(+)\t2. Substraction(-) \t3. Multiplication(*)\t 4. Division(/)");
		char operator = obj.next().charAt(0);
		
		switch(operator) {
		case '+':
			d = a+b;
			//System.out.println("the addition value of a and b is"+ d);
			break;
			
		case '-':
			d = a-b;
			//System.out.println("the substraction of a and b is"+ d);
			break;
		
		case '*':
			d = a*b;
			//System.out.println("the mulitplication of a and b is"+ d);
			break;
		case '/':
			d = a/b;
			//System.out.println("the division value of a and b is"+ d);
			break;
		default:
			//System.out.println("you have entered wrong keyword");
			break;
		}
		
		System.out.printf("%.1f %c %.1f = %.1f", a, operator, b, d);
		System.out.println();
		
		}
		
		
		
		
	
		

	}

}
