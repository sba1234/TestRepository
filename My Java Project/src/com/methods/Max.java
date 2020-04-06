package com.methods;
//program to return max of 2 numbers
public class Max {
public static int max(int a,int b)
{
	if(a>b)
		return a;
	else
		return b;
}
	public static void main(String[] args) {
		int max1=max(10,20);
		System.out.println(max1);
		System.out.println(max(20,50));

	}

}
