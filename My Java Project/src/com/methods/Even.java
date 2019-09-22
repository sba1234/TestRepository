package com.methods;
//program to display even numbers upto given limit
public class Even {
	public static void display(int a,int b)
	{
		while(a<=b)
		{
			if(a%2==0) 
				System.out.println(a);
			a++;
			
		}
	}
	public static void main(String[] args) {
		display(1,50);
		

	}

}
