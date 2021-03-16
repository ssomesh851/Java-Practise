package com.example.prgms;

import java.util.*;

public class OccurenceOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String str = obj.nextLine();
		
		int Initiallenth = str.length();
		
		System.out.println("Enter the charcater which you want to find the number of occurence");
		
		//Scanner obj1 = new Scanner(System.in);
		
		String str1 = obj.next();
		
		str = str.replace(str1,"");
		
		int finalLength = str.length();
		
		System.out.println("Total number of occurences of"+ str1 +" "+(Initiallenth - finalLength));
	}

}
