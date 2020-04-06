//sample program for class not found exception and throws declaration
package com.exception;

public class CE7 {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println(1);
		Class.forName("java.util.Scanner");
		System.out.println(2);
	}

}
