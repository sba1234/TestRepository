//sample program for class not found exception
package com.exception;

public class CE1 {

	public static void main(String[] args) {
	System.out.println(1);
	Class.forName("java.util.Scanner");
	System.out.println(2);

	}

}
