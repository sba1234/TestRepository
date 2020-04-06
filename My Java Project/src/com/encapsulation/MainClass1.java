//sample program for encapsulation
package com.encapsulation;

public class MainClass1 {

	public static void main(String[] args) {
		Voter v1=new Voter(24,01);
		System.out.println("age of voter with id "+v1.getId()+" is "+v1.getAge());
		v1.setId(02);
		v1.setAge(16);
		System.out.println("age of voter with id "+v1.getId()+" is "+v1.getAge());
	}

}
