//sample program for interface
package com.abstraction2;

public class MainClass1 {

	public static void main(String[] args) {
	I4 ob;
	ob=new X();//uc
	ob.test1();
	((I5)ob).test2();

	}

}
