package com.example.prgms;

import java.util.*;

public class ArraySearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10, 5, 20, 11, 6};
		for(int i=1; i<a.length; i++) {
			System.out.println(a[i]);
		}
		//System.out.println(a);
		System.out.println(Arrays.binarySearch(a,6));
		System.out.println(Arrays.binarySearch(a,14));
		
	}

}
