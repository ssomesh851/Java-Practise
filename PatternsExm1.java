package com.example.prgms;
import java.util.Scanner;
public class PatternsExm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		int k = obj.nextInt();
		int i,j;
		for(i=1;i<k;i++) {
			for(j=k;j>=i;j--) {
				System.out.print(" ");
			}
			for(int a=1; a<=i; a++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for(i=1;i<=k;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(j=k;j>=i;j--){
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}