//sample program using constructor to display animal properties
package com.constructor;

public class World {

	public static void main(String[] args) {
		Animal a1=new Animal();
		System.out.println("height: "+a1.height+"weight:"+a1.weight);
		Animal a2=new Animal(10.5,20.5);
		System.out.println("height: "+a2.height+"weight:"+a2.weight);
		

	}

}
