//sample program for inheritance
package com.inheritance;

public class Tyss {

	public static void main(String[] args) {
		TestEngineer t1=new TestEngineer("syed",30.5,"selenium");
		t1.writeScripts();
		t1.work();
		System.out.println("id: "+t1.id);
		System.out.println("name "+t1.name);
		System.out.println("salary "+t1.salary);
		System.out.println("tool "+t1.tool);
		System.out.println("___________");
		TestEngineer t2=new TestEngineer("Ahmed",30.5,"selenium");
		t2.writeScripts();
		t2.work();
		System.out.println("id: "+t2.id);
		System.out.println("name "+t2.name);
		System.out.println("salary "+t2.salary);
		System.out.println("tool "+t2.tool);
		
		
		

	}

}
