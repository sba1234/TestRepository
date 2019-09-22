package com.inheritance;

public class World {

	public static void main(String[] args) {
		Dog d1=new Dog(25.0,30.2,"Golden Retreiver");
		System.out.println("height: "+d1.height);
		System.out.println("weight: "+d1.weight);
		System.out.println("breed: "+d1.breed);
		Dog d2=new Dog(35.0,40.2,"German Shepard");
		System.out.println("height: "+d2.height);
		System.out.println("weight: "+d2.weight);
		System.out.println("breed: "+d2.breed);
		Dog d3=new Dog(15.0,20.2,"RottWeiler");
		System.out.println("height: "+d3.height);
		System.out.println("weight: "+d3.weight);
		System.out.println("breed: "+d3.breed);


	}

}
