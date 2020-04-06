//sample program using constructor to display laptop properties
package com.constructor;

public class Laptop {
int ram;
String brand;
String processor;
Laptop()
{
	ram=4;
	brand="lenovo";
	processor="snapdragon";
}
	Laptop(int ram,String brand,String processor)
	{
		this.ram=ram;
		this.brand=brand;
		this.processor=processor;
	}
}