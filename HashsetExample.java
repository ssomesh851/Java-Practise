package com.example.prgms;

import java.util.*;

public class HashsetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap m = new HashMap();
		
		m.put("chiranjivi",700);
		
		m.put("mahesh",800);
		
		m.put("Java",700);
		
		m.put("Python",4566);
		
		m.put("chiranjivi",1000);
		
		System.out.println(m);
		
		System.out.println(m.put("chiranjivi",1014));
		
		Set s = m.keySet();

		System.out.println(s);
		
		Set s1 = m.entrySet();
		
		Iterator its = s1.iterator();
		
		while(its.hasNext()) {
			
			Map.Entry m1 = (Map.Entry)its.next();
			
			System.out.println(m1.getKey() + "========" + m1.getValue());
			
			if(m1.getKey().equals("nagarjuna"))
			
				m1.setValue(10000);				
		}

		System.out.println(m);
	}
}
