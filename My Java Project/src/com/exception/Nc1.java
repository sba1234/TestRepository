//sample program for null pointer Exception
package com.exception;

public class Nc1 {
int i;
	public static void main(String[] args) {
		System.out.println(1);
		Nc1 ob=null;
		System.out.println(2);
		try
		{
			ob.i=10;
			System.out.println(3);
		}
		catch(NullPointerException e)
		{
			System.out.println("caught the exception-------->"+e);
		}
		System.out.println(4);
	}

}
