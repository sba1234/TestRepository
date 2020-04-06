//sample program to display vehicle properties
package com.assignments;

public class Rider {

	public static void main(String[] args) {
		Vehicle v1=new Vehicle();
		Vehicle v2=new Vehicle();
		Vehicle v3=new Vehicle();
		v1.name="benz";
		v1.colour="White";
		v1.speed=250.55;
		System.out.println("vehicle name: "+v1.name+"\nvehicle colour: "+v1.colour+"\nvehicle speed kmph: "+v1.speed);
		System.out.println();
		v2.name="Rolls Royce";
		v2.colour="Black";
		v2.speed=300.20;
		System.out.println("vehicle name: "+v2.name+"\nvehicle colour: "+v2.colour+"\nvehicle speed kmph: "+v2.speed);
		System.out.println();
		v3.name="BMW";
		v3.colour="Red";
		v3.speed=415.0;
		System.out.println("vehicle name: "+v3.name+"\nvehicle colour: "+v3.colour+"\nvehicle speed kmph: "+v3.speed);
		
		
		

	}

}
