//program for non-static members
package com.nonstatic;

public class Vanheusen {
String productCode;
int size;
String color;
static int countShirt;
Vanheusen()
{
	countShirt++;
	productCode="VAN"+countShirt;

}
Vanheusen(String color,int size)
{
	this();
	this.color=color;
	this.size=size;
	
}
	public static void main(String[] args) {
		Vanheusen ob1=new Vanheusen();
		System.out.println("color:"+ob1.color+"size:"+ob1.size+"productCode:"+ob1.productCode);
		Vanheusen ob2=new Vanheusen("blue",40);
		System.out.println("color:"+ob2.color+"size:"+ob2.size+"productCode:"+ob2.productCode);


	}

}
