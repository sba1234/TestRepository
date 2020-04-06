package com.methods;
//program to check even numbers
public class CheckEven {
	public static boolean isEven(int a)
	{
		if(a%2==0)
			return true;
		else
			return false;
	}
	public static void printEven(int b)
	{
		for(int a=0;a<b;a++)
		{
			if(isEven(a))
				System.out.println(a);
		}
	}
	public static void main(String[] args) {
		printEven(10);
		
	}
		

}
