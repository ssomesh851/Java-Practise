package com.example.prgms;

import java.util.Random;

public class RandomNumberExm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating an object of Random class
		Random random = new Random();
		// Generates random integers 0 to 49
		
		int x = random.nextInt(50);
		
		//generates random integers 0 to 999
		
		int y = random.nextInt(1000);
		
		//Prints random integer values
		
		System.out.println("Randomly generated integer values");
		System.out.println(x);
		System.out.println(y);

	}

}
