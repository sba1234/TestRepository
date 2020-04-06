//sample program to display songs by using Array
package com.array3;

public class Demo2 {

	public static void main(String[] args) {
		Songs[] s= {new Songs("teri meri",4.2,"RFAK"), new Songs("abcd",4.3,"abcd")};
		for(Songs s2:s)
		{
			System.out.println("title: "+s2.title);
			System.out.println("singer: "+s2.singer);
			System.out.println("duration: "+s2.duration);
		}
	}
}
