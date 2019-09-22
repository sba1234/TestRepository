package com.inheritance;

public class MainClass {

	public static void main(String[] args) {
		System.out.println(D.i);
		//System.out.println(C.j);//cte
		System.out.println(D.j);
		C.i=100;
		System.out.println(D.i);
		D.j=200;
		//System.out.println(C.j);//cte
		System.out.println(D.j);
		

	}

}
