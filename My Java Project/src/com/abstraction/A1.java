package com.abstraction;

abstract class A1 {
abstract void test();//its mandatory to make A1 as abstract as its having abstract 
                      //method test()
void test1()
{
	
}
public static void main(String[] args) {
	A1 ob=new A1();//class A1 is abstract cannot be instantiated
	A3 ob1=new A3();
}
}
