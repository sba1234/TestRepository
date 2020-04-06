//sample program for static members
package com.staticmembers;

public class S8 {
static void test()
{
	System.out.println("from test");
}
	public static void main(String[] args) {
		System.out.println("main begins");
		test();
		System.out.println("++++++");
		S8.test();
		System.out.println("main ends");

	}

}
