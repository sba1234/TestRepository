package com.abstraction;

public class World {

	public static void main(String[] args) {
		Animal d1=new Dog();
		d1.talk();//functionality is provided by concrete class Dog
		System.out.println("+++++++++");
		Cat c1=new Cat();
		c1.talk();//functionality is provided by concrete class Cat
		System.out.println("*********");
		Animal a;
		a=new Dog();
		a.talk();//functionality is provided by abstract class Animal
		System.out.println("____________");
		a=new Cat();
		a.talk();//functionality is provided by abstract class animal

	}

}
