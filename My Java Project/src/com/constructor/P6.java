package com.constructor;

public class P6 {
	int i;
	P6()
	{
		i=20;
	}

	public static void main(String[] args) {
		P6 ob=new P6();
		P6 ob1=new P6();
		P6 ob2=new P6();
		System.out.println("i value for my 1st object: "+ob.i);
		System.out.println("i value for my 2nd object: "+ob1.i);
		System.out.println("i value for my 3rd object: "+ob2.i);

	}

}
