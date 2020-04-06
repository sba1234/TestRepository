//program for non-static members
package com.nonstatic;

public class Employee1 {
String id;
static int count;
{
	count++;
    id="TY"+count;
   
}
	public static void main(String[] args) {
	Employee1 ob1=new Employee1();
	Employee1 ob2=new Employee1();
	Employee1 ob3=new Employee1();

	System.out.println(ob1.id);
	System.out.println(ob2.id);
	System.out.println(ob3.id);
	System.out.println("Employee:"+count);
	}

}
