//sample program for class not found exception and handling exception
package com.exception;

public class CE6 {

	public static void main(String[] args) {
	System.out.println(1);
	try {
		int c=10/10;
	Class.forName("java.util.Scanner");
	}
	catch(ClassNotFoundException e)
	{
		System.out.println(e);
	}
	System.out.println(2);

	}

}
