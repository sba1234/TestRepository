//sample program for class not found exception and handling exception 
package com.exception;

public class CE4 {

	public static void main(String[] args) {
	System.out.println(1);
	try {
	Class.forName("java.util.Scanner");//cte 
	}
	catch(ArithmeticException e)//we are using arithmeticexception instead of 
	                            //classnotfoundexception. so we get compile time error
	{
		System.out.println(e);
	}
	System.out.println(2);

	}

}
