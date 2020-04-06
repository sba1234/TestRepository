//sample program for Arithmetic Exception
package com.exception;

public class E4 {
	public static void main(String[] args) {
		System.out.println(1);
		int a=10, b=0, c;
		System.out.println(2);
		try
		{
			c=a/b;
			System.out.println(3);
		}
		catch(ArithmeticException e) {
			System.out.println("caught");
			System.out.println(e);
		}
		System.out.println(4);
	}
}
