//sample program for constructor
package com.constructor;

public class P3 {
	P3(){
		System.out.println("P3() constructor");
	}
	P3(int i)
	{
		System.out.println("P3(int) constructor");
	}

	public static void main(String[] args) {
	P3 ob=new P3();
	System.out.println("++++++");
	P3 ob1=new P3();

	}

}
