package com.methods;
//program to design a calculator
public class Calculator {
public static void add(int a,int b)
{
	int add=a+b;
	System.out.println("the addition of "+a+" and "+b+" is "+add);
}
public static void diff(int c,int d)
{
    int diff=c-d;
	System.out.println("the difference of "+c+" and "+d+" is "+diff);
}
public static void prod(int e,int f)
{
    int prod=e*f;
	System.out.println("the product of "+e+" and "+f+" is "+prod);
}
public static void div(int g,int h)
{
    int div=g/h;
	System.out.println("the division of "+g+" and "+h+" is "+div);
}
public static void mod(int i,int j)
{
    int mod=i%j;
	System.out.println("the modulus of "+i+" and "+j+" is "+mod);
}
	public static void main(String[] args) {
		add(5,2);
		diff(4,9);
		prod(5,8);
		div(6,2);
		mod(15,2);
	}
}
