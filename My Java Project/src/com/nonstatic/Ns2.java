//program for non-static members
package com.nonstatic;

public class Ns2 {
	{
		System.out.println("from IIB-1");
	}
	public static void main(String[] args) {
		System.out.println("from main");
		Ns2 ob=new Ns2();
		Ns2 ob1=new Ns2();
		System.out.println("main ends");

	}
	{
		System.out.println("from IIB-2");
	}
}
