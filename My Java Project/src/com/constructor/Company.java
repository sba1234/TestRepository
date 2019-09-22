//sample program for constructor
package com.constructor;

public class Company {

	public static void main(String[] args) {
		Laptop l1=new Laptop();
		System.out.println("brand: "+l1.brand+" ram:"+l1.ram+" processor:"+l1.processor);
		Laptop l2=new Laptop(8,"lenovo","octacore");
		System.out.println("brand: "+l2.brand+" ram:"+l2.ram+" processor:"+l2.processor);
		

	}

}
