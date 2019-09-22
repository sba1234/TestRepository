//program for polymorphism
package com.polymorphism;

public class Vehicle {
String vno;
String color;
static int count;
Vehicle()
{
	count++;
	vno="AP"+count;
}
Vehicle(String color)
{
	this();
	this.color=color;
}
void move()
{
	System.out.println("vehicle is moving");
}
void move(String location)
{
	System.out.println("vehicle is moving towards" + location );
}

}
