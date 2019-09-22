//sample program for class not found exception and handling exception
package com.exception;

public class CE2 {

	public static void main(String[] args) {
	System.out.println(1);
	try {
	Class.forName("java.util.Scanner");
	}
	catch(ClassNotFoundException e)
	{
		System.out.println(e);
	}
	System.out.println(2);

	}

}
