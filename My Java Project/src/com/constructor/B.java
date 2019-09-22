//sample program for constructor
package com.constructor;

public class B {
	B()
	{
		this(10);
		System.out.println("from B()");
	}
	B(int i)
	{
	
		System.out.println("from B(int)");
	}

	public static void main(String[] args) {
		B ob1=new B();      //from B(int)    from B()
		System.out.println(" ------------------ ");
		B ob2=new B(10);//from B(int)
	}
}
