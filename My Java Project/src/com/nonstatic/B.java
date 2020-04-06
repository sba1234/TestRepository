//program for non-static members
package com.nonstatic;

public class B {
	int i;
	void test()
	{
		int i=30;
		System.out.println(i);
		System.out.println(this.i);
	}

	public static void main(String[] args) {
		B ob1=new B();
		ob1.test();
		B ob2=new B();
		ob2.i=20;
		ob2.i=200;
		ob2.test();

	}

}
