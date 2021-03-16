package com.example.prgms;

import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,5,8,7};
		
		ArrayList al = new ArrayList();
		
		al.add("A");
		al.add(10);
		al.add("A");
		al.add(null);
		al.add("a");
		al.remove(2);
		System.out.println(al);
		al.add(2,"m");
		al.add("n");
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		System.out.println(Arrays.binarySearch(a,5));
		

	}

}
