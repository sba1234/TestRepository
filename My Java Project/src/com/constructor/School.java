//sample program for constructor
package com.constructor;

public class School {
	School()
	{
		System.out.println("Students");
	}
	School(int a)
	{
		System.out.println("Teachers");
	}

	public static void main(String[] args) {
		School ob=new School();
		School ob1=new School(20);

	}

}
