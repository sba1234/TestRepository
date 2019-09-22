//sample program for inheritance
package com.inheritance;

public class Bike extends TwoWheeler {
double mileage;
Bike()
{
	
}
Bike(String color,String name,double mileage)
{
	super(color,name);
	this.mileage=mileage;
}
}
