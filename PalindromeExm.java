package com.example.prgms;

import java.util.Scanner;

public class PalindromeExm {
	
	static void checkpalindrome(String input) {
		//assume that result is true
		boolean res = true;
		int length = input.length();
		
		for(int i = 0; i <= length/2; i++) {
			if(input.charAt(i) != input.charAt(length-i-1)) {
				res = false;
				break;
			}
		}
		System.out.println(input+"is palindrome:"+res);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		String str = obj.nextLine();
		checkpalindrome(str);

	}

}
