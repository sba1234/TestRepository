package com.inheritance;

public class Employee {
String id;
String name;
double salary;
static int count;
{
	count++;
	id="ty"+count;
}
Employee(){
	
}
Employee(String name,double salary)
{
	this.name=name;
	this.salary=salary;
}
void work()
{
	System.out.println("employee is working");
}
}
