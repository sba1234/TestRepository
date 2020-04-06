//sample program for static members
package com.staticmembers;

public class S12 {
static
{
	System.out.println("SIB-2");
}
	public static void main(String[] args) {
		System.out.println("from main");
	}
	static
	{
		System.out.println("SIB-1");

	}

}
