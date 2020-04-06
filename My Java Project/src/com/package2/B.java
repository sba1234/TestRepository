//Accessing static variables in different package
package com.package2;
import com.package1.A;
public class B {

	public static void main(String[] args) {
	System.out.println(A.i);

	}

}
