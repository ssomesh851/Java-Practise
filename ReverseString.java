package com.example.prgms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome to Edureka";
		String[] strArray = str.split(" ");
		for(String temp: strArray) {
			//System.out.println(temp);
		}
		for(int i = 0; i < strArray.length; i++) {
			char[] s1 = strArray[i].toCharArray();
			for(int j = s1.length-1; j>=0; j--) {
				System.out.print(s1[j]);}
				System.out.println("");
			}
		}

	}