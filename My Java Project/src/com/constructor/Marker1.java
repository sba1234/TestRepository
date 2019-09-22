//sample program using constructor to display marker properties
package com.constructor;

public class Marker1 {
	String colour;
	double length;
	Marker1(String colour,double length)
	{
	this.colour=colour;
	this.length=length;
	}

	public static void main(String[] args) {
     Marker1 m1=new Marker1("black",3.5);
     Marker1 m2=new Marker1("red",4.5);
     Marker1 m3=new Marker1("green",6.5);
     System.out.println("colour:"+m1.colour+"    length:"+m1.length);
     System.out.println("colour:"+m2.colour+"    length:"+m2.length);
     System.out.println("colour:"+m3.colour+"    length:"+m3.length);

	}

}
