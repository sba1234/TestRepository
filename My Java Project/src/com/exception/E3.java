//sample program for NullpointerException
package com.exception;

public class E3 {
int i;
	public static void main(String[] args) {
		System.out.println(1);
	E3 ob;
	System.out.println(2);
	ob=null;
	System.out.println(3);
	System.out.println(ob.i);
	System.out.println(4);

	}

}
