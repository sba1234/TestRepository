//sample program using constructor to display watch properties
package com.constructor;

public class Wrist {

	public static void main(String[] args) {
		Watch w1=new Watch();
		System.out.println("type: "+w1.type+"  price: "+w1.price);
		Watch w2=new Watch("digital",1.25);
		System.out.println("type: "+w2.type+"  price: "+w2.price);
		

	}

}
