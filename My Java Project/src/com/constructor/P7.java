package com.constructor;

public class P7 {
	boolean x;
	double y;
	P7(boolean x,double y)
	{
		this.x=x;
		this.y=y;
	}

	public static void main(String[] args) {
		P7 ob1=new P7(false,2.2);
		P7 ob2=new P7(true,3.3);
		P7 ob3=new P7(false,4.4);
		System.out.println("x: "+ob1.x+"   y:"+ob1.y);
		System.out.println("x: "+ob2.x+"   y:"+ob2.y);
		System.out.println("x: "+ob3.x+"   y:"+ob3.y);

	}

}
