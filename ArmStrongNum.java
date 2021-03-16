package com.example.prgms;

public class ArmStrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c=0,a,temp;
		int n = 371; // it is the number to check the armstrong
		//int n1 = 371;
		temp=n;
		while(n>0) {
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
			System.out.println(a+" "+n);
			System.out.println(c);
		}
		
		if(temp==c)
			System.out.println("armstrong number");
		else
			System.out.println("Not armstrong number");

	}

}
