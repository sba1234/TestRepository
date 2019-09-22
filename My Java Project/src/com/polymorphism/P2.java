//program for polymorphism
package com.polymorphism;

public class P2 extends P1 {
	void bulletPrakash() {
		System.out.println("from BulletPrakash in P2");
	}
static void klRahul()
{
	System.out.println("from KLRahul in P2");
}
	public static void main(String[] args) {
		P1.klRahul();//from KLRahul in P1
		P2.klRahul();//from KLRahul in P2
		P1 ob1=new P2();
		ob1.klRahul();//from KLRahul in P1
		ob1.bulletPrakash();//from BulletPrakash in P2
		P1 ob2=new P1();
		ob2.klRahul();//from KLRahul in P1
		ob2.bulletPrakash();//from BulletPrakash in P1
		P2 ob3=new P2();
		ob3.klRahul();//from KLRahul in P2
		ob3.bulletPrakash();//from BulletPrakash in P2
		
		

	}

}
