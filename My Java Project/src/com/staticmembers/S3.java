//sample program for static members
package com.staticmembers;

public class S3 {
static int a=20;
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(S3.a);
		S3.a=30;
		System.out.println(a);

	}

}
