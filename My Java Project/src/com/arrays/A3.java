package com.arrays;
//program to create array and store numbers divisible by 8
public class A3 {

	public static void main(String[] args) {
		int [] a=new int[10];
		for(int i=0,j=50;i<a.length;j++)
		{
			if(j%8==0)
			{
				a[i]=j;
				i++;
			}
		}
			for(int i=0;i<a.length;i++)
			{
				System.out.println("element at " +i + "th position is "+ a[i]);
			}
			

	}

}
