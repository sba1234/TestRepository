//program for non-static members
package com.nonstatic;

public class Ns1 {
	{
		
	System.out.println("from block");
	}
	public static void main(String[] args) {
		Ns1 ob=new Ns1();
		System.out.println(new Ns1());
	}
}

