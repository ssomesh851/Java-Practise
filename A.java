package com.example.prgms;

 class B {
	 
	 private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
 class A {
	 public static void main(String[] args) {
		 B b = new B();
		 b.setBalance(123);
		 System.out.println(b.getBalance());
	 }
 }
