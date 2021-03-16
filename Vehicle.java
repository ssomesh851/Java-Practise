package com.example.prgms;

abstract class Vehicle {
	
	public abstract int getNoOfWheels();
	
}
class Bus extends Vehicle{
	public int getNoOfWheels() {
		return 6;
	}
}

class auto extends Vehicle{
	public int getNoOfWheels() {
		return 3;
	}
}


