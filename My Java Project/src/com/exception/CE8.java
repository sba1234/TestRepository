//sample program for class not found exception and throws declaration
package com.exception;

public class CE8 {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println(1);
		Class.forName("java.util.scanner");
		System.out.println(2);
	}

}
