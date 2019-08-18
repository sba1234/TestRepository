package com.patterns;
//program for right angled triangle
/*        A
*       B B
*     C C C
*   D D D D
* E E E E E
*/
public class Pattern26 {

	public static void main(String[] args) {
		int n=5;
		char ch='A';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			 if(i+j>=(n-1))
					System.out.print(ch+" ");
			 else
				 System.out.print(" "+" ");
			}
			System.out.println();
			ch++;
		}
	}
}
