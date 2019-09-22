//sample program for static members
package com.staticmembers;

public class S14 {
static 
{
	int i=20;
	System.out.println(i);
}
	public static void main(String[] args) {
		System.out.println("from main");
		//System.out.println(i);//compile time error

	}

}
