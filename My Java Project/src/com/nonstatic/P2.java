//program for non-static members
package com.nonstatic;

public class P2 {
	void test()
	{
		System.out.println("from test");
	}

	public static void main(String[] args) {
		System.out.println("from main");
		P2 ob1=new P2();
		ob1. test();
		System.out.println("main ends");

	}

}
