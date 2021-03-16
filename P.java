package com.example.prgms;

class Test{
	int x = 888;
}
class C extends Test{
	int x = 999;
}
public class P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		
		System.out.println(test.x);

		C c = new C();
		
		System.out.println(c.x);

		Test test1 = new C();

		System.out.println(test1.x);

	}

}
