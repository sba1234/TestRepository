package com.patterns;
//program for right angled triangle
/*A A A A A
* * * * *
* B B B
* * *
* C
*/
public class Pattern19 {

	public static void main(String[] args) {
		int n=5;
		char ch='A';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			 if(i+j<=(n-1))
			 {
				 if(i%2==0)
				System.out.print(ch+" ");
				 else
					 System.out.print('*'+" ");
			}
			}
			System.out.println();
			if(i%2==0)
				ch++;
}
}
}
