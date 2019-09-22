package com.inheritance;

public class Road {

	public static void main(String[] args) {
		Vehicle v1=new Vehicle("Red",9);
		System.out.println("color: "+v1.color);
		System.out.println("vno: "+v1.vno);
		Car c1=new Car("white",100,"BMW");
		System.out.println("color: "+c1.color);
		System.out.println("vno: "+c1.vno);
		System.out.println("brand: "+c1.brand);
		c1.move();
		v1.move();

	}

}
