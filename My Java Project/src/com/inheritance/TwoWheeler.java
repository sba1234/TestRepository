//sample program for inheritance
package com.inheritance;

public class TwoWheeler extends Vehicle1 {
String name;
TwoWheeler()
{
	
}
TwoWheeler(String color,String name)
{
	super(color);
	this.name=name;
}
}
