//sample program for inheritance
package com.inheritance;

public class B1 extends A1 {
	B1(int i){
		super(i);
	}
	

	public static void main(String[] args) {
		A1 a=new A1(10);
System.out.println(a.i);
	}

}
