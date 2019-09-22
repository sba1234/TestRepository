//program for polymorphism
package com.polymorphism;

public class B extends A {
void test()
{
	System.out.println("from test() of B");
}
	public static void main(String[] args) {
		A ob;
		ob=new A();
		ob.test();
		System.out.println("________");
		ob=new B();//auto upcasting
		ob.test();
		System.out.println("________");
		A ob2=new B();//is-a,MO,DTC
		ob2.test();
		B ob3=(B) ob2;
		ob3.test();
	}

}
