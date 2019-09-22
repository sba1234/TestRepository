package com.arrays;
//program to create array and store all even numbers and display numbers divisible by 3
public class A4 {

	public static void main(String[] args) {
		int [] a=new int[10];
		for(int i=0,j=10;i<a.length;j++)
		{
			if(j%2==0)
			{
				a[i]=j;
				i++;
			}
		}
			for(int i=0;i<a.length;i++)
			{
		      if(i%3==0)
		    	  System.out.println("elements present in "+i+"th position is " +a[i]);
			}
			

	}

}

