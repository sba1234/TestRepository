//sample program for static members
package com.staticmembers;

public class S7 {
static int i=30;
	public static void main(String[] args) {
		int i=20;
		System.out.println(i);
		System.out.println(S7.i);
		System.out.println(S6.i);

	}

}
