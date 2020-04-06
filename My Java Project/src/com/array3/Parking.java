//sample program to display bikes by using Array
package com.array3;

public class Parking {
	public static void display(Bikes[] parking)
	{
		for(int i=0;i<parking.length;i++)
		{
			System.out.println(parking[i].brand);
			System.out.println(parking[i].mileage);
			System.out.println(parking[i].color);
			System.out.println("******************");
		}
	}

	public static void main(String[] args) {
		Bikes[] parking=new Bikes[5];
		parking[0]= new Bikes("R15",20.5,"Red");
		parking[1]= new Bikes("Pulsar",45.0,"Black");
		parking[2]= new Bikes("Passion",60,"Blue");
		parking[3]= new Bikes("BMW",15.0,"Purple");
		parking[4]= new Bikes("Apache",30.5,"Yellow");
		display(parking);





	}

}
