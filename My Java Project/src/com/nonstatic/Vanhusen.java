//wap to create a class vanhusen shirt having properties String colour,
//int size String product code the product code of 1st shirt is van1.
//create two constructors of the class one will be parametroised other
//non parametroised constructor.
package com.nonstatic;

public class Vanhusen {
	String colour;
	int size;
	String productCode;
	static int countShirt;
	{
		countShirt++;
		productCode="van"+countShirt;

	}
	Vanhusen()
	{
		colour="blue";
		size=42;
		
	}
	Vanhusen(String colour,int size)
	{
		this.colour=colour;
		this.size=size;
		
	}

	public static void main(String[] args) {
		Vanhusen v1=new Vanhusen();
		System.out.println("colour: "+v1.colour+"size "+v1.size+"productcode "+v1.productCode);
		Vanhusen v2=new Vanhusen("black",38);
		System.out.println("colour: "+v2.colour+"size "+v2.size+"productcode "+v2.productCode);
		Vanhusen v3=new Vanhusen("white",40);
		System.out.println("colour: "+v3.colour+"size "+v3.size+"productcode "+v3.productCode);
		
	}

}
