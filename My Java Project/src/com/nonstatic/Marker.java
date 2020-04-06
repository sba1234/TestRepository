//write a program to design a class representing an entity known as marker having the following properties
//colour,name,length(double),price(int)
//design a method known as initialize to assign a value
//the method should accept the values which are to be initialized
package com.nonstatic;
public class Marker {
String colour;
String name;
double length;
int price;
void initializer(int price,double length,String colour,String name)
{
	this.colour=colour;
	this.length=length;
	this.name=name;
	this.price=price;
	System.out.println("colour= "+this.colour);
	System.out.println("length= "+this.length);
	System.out.println("name= "+this.name);
	System.out.println("price= "+this.price);
}
	public static void main(String[] args) {
	Marker ob=new Marker();
	ob.initializer(25,5.5,"black","cello");
	Marker ob1=new Marker();
	ob1.initializer(100, 3.5, "blue", " Rorito");

	}

}
