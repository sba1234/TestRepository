package com.inheritance;

public class F extends E {
	int y;

	public static void main(String[] args) {
		F ob1=new F();
		System.out.println("x:"+ob1.x);
		System.out.println("y:"+ob1.y);
		System.out.println(ob1);
		E ob2=new E();
		System.out.println("x:"+ob2.x);
		//System.out.println("y:"+ob2.y);cte
		ob2.x=200;
		System.out.println("x:"+ob2.x);
		System.out.println(ob2);

	}

}
