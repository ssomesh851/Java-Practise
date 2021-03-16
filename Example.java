package com.example.prgms;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n = "Hi am somesh";
		String[] str = n.split(" ");
		
		for(int i = 0; i < 3; i++) {
			char[] s1 = str[i].toCharArray();
			for(int j = s1.length - 1; j >= 0; j--){
			System.out.print(s1[j]);
		}
	}
		int count = 1;
		for(int i = 1; i < 10; i++) {
			int a = i/count;
			System.out.println(a);
			count++;		
		}

	}
}
