//sample program for Method over riding
package com.methodoverriding;

public class Company {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.works();
		Developer d1=new Developer();
		d1.works();
		Tester t1=new Tester();
		t1.works();

	}

}
