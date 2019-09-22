package com.inheritance;

public class MainClass4 {

	public static void display(Vehicle1 v)
	{
		System.out.println("color is "+v.color);
		if(v instanceof TwoWheeler)
		System.out.println("name is "+((TwoWheeler)v).name);
		if(v instanceof Bike)
		System.out.println("mileage is "+((Bike)v).mileage);
		System.out.println("____________");
	}
	public static void main(String[] args) {
		Bike b1=new Bike("red","CBZ-XTREME",50);
		TwoWheeler t1=new TwoWheeler("Black","Harley-Davidson");
		Vehicle1 v1=new Vehicle1("green");
		Bike b2=new Bike("orange","KTM",35);
		display(b1);
		display(t1);
		display(v1);
		display(b2);
				

	}

}
