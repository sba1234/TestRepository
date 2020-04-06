package com.arrays;
//program to create array and store all numbers which are divisible by 5 and copy in another array
public class A2 {
	
	public static void main(String[] args) {
		int [] a=new int[5];
		for(int i=0,j=0;i<a.length;j++)
		{
			if(j%5==0)
			{
				a[i++]=j;
			}
		}
		System.out.println("elements present in 1st array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		int [] b=new int[5];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		System.out.println("elements present in 2nd array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(b[i]);
		}
		System.out.println("elements present at odd indices");
		for(int i=0;i<b.length;i++)
		{
			if(i%2==1)
				System.out.println(b[i]);
		}
	}
}
