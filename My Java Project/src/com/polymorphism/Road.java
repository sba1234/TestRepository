//program for polymorphism
package com.polymorphism;

public class Road {

	public static void main(String[] args) {
		Vehicle[] vehicle=new Vehicle[5];
		vehicle[0]=new Vehicle("Red");
		vehicle[1]=new Car("Black","Jaugar");
		vehicle[2]=new Car("Maroon","R8");
		vehicle[3]=new Audi("White","Q6","SUV");
		vehicle[4]=new Audi("Blue","A8","Sedan");
		
		for(Vehicle v:vehicle)
		{
			System.out.println("vehicle number "+v.vno);
			System.out.println("color "+v.color);
			if(v instanceof Car)
				System.out.println("name "+((Car)v).name);
			if(v instanceof Audi)
				System.out.println("type "+((Audi)v).type);
			v.move();
			v.move("Australia");
			System.out.println("________________");
		}
		
		
		

	}

}
