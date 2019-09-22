package com.methods;
//program to display maximum of 2 numbers
public class Maximum {
   public static void maximum(int a,int b)
   {
	if(a>b)
		System.out.println(a);
	else
		System.out.println(b);
   }
      public static void main(String[] args) {
		maximum(10,20);
		maximum(20,500);
	}
}
