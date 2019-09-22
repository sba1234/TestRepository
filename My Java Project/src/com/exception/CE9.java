//sample program for exception and throws declaration
package com.exception;

public class CE9 {

	public static void main(String[] args) throws InterruptedException  {
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
	}

}
