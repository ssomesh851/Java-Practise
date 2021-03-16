package com.example.prgms;
import java.util.*;
public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t = new TreeSet(new MyComparator());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCD");
		t.add("A");
		System.out.println(t);

	}

}
class MyComparator implements Comparator{
	public int Compare(object obj1, object obj2) {

		String s1 = obj1.toString();
		String s2 = obj2.toString();
		int l1 = s1.length();
		int l2 = s2.length();
		if(l1<l2)
			return -1;
		elseif(l1>l2)
		    return +1;
		else
			s1.compareTo(s2);

	}
}