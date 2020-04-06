//sample program for ArrayIndexOutOfBoundsException
package com.exception;

public class E2 {

	public static void main(String[] args) {
		System.out.println(1);
		int[] a=new int[3];
		System.out.println(2);
		System.out.println(a[1]);
		System.out.println(3);
		System.out.println(a[3]);
		System.out.println(4);
	}

}
