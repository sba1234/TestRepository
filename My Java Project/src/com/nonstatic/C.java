//program for non-static members
package com.nonstatic;

public class C {
int a;
void m1()
{
	int a=300;
	System.out.println(this.a);
	this.a=a;
	System.out.println(a);
	System.out.println(this.a);
}
	public static void main(String[] args) {
		C ob1=new C();
		ob1.a=20;
		ob1.m1();
		
		C ob2=new C();
		System.out.println(ob2.a);
		ob2.a=30;
		System.out.println(ob2.a);
		ob2.m1();

	}

}
