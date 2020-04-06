//sample program for static members
package com.staticmembers;

public class S13 {
static int i; 
static
{
	System.out.println(i);
	i=20;
}
	public static void main(String[] args) {
		System.out.println(i);

	}

}
