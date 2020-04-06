////sample program for handling Exception using scanner class
package com.exception;
import java.util.Scanner;
public class Employee {
	int salary;
 void readSalary()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the salary");
	int salary=sc.nextInt();
	if(salary<this.salary)
	{
		System.out.println("Invalid salary");
		try {
		throw new ArithmeticException();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			readSalary();
		}
	}
	else
		this.salary=salary;
}
 public Employee(int salary) {
	 
	 this.salary=salary;
 }
	public static void main(String[] args) {
		Employee e=new Employee(1000);
		System.out.println("employee salary is "+e.salary);
		e.readSalary();
		System.out.println("Raised salary is "+e.salary);

	}

}
