package com.inheritance;

public class TestEngineer extends Employee{
	String tool;
	TestEngineer()
	{
		
	}
	TestEngineer(String name,double salary,String tool)
	{
		super(name,salary);
		this.tool=tool;
	}
void writeScripts()
{
	System.out.println("Testengineer is writing scripts using: "+tool);
}
}
