//program for non-static members
package com.nonstatic;

public class Employee2 {
	static int countEmployee;
	String id;
	String name;
	{
		countEmployee++;
		id="TY"+countEmployee;
	}
Employee2()
{
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
