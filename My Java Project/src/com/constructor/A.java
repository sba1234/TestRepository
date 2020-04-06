//sample program for constructor
package com.constructor;

public class A {
	A()
	{
		System.out.println("from A()");
	}
	A(int i)
	{
		this();
		System.out.println("from A(int)");
	}

	public static void main(String[] args) {
		A ob1=new A();      //from A()
		System.out.println(" ------------------ ");
		A ob2=new A(10);//from A(int)
		

	}

}
