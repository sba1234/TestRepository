//program for non-static members
package com.nonstatic;

public class A {
	int i;
	void test() //called method
	{
		System.out.println("from test()");
		System.out.println(i);//10
		System.out.println("this: "+this);//A@15d
		i=20;
		System.out.println(this.i);//20
		System.out.println("end of test");
	}

	public static void main(String[] args) {// calling method
		System.out.println("from main");
		A ob=new A();
		ob.i=10;
		ob.test();//calling test
		//System.out.println(this);//cte
		System.out.println("ob: "+ob);//A@15d
		System.out.println("end main");

	}

}
