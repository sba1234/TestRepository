package com.inheritance;

public class Vehicle {
	String color;
	int vno;
	void move()
	{
		System.out.println("Vehicle is moving");
	}
Vehicle()
{
	
}
Vehicle(String color,int vno)
{
	this.color=color;
	this.vno=vno;
}
}
