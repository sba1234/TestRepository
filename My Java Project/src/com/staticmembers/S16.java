//sample program for static members
package com.staticmembers;

public class S16 {
static
{
	//System.out.println(i);//cte(illegal forward reference error)
}
static int i;
	public static void main(String[] args) {
System.out.println(i);
	}
}
