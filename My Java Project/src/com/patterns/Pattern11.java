package com.patterns;
//program for right angled triangle
/*A
* 1 2
* A B C
* 1 2 3 4
* A B C D E
*/
public class Pattern11 {

	public static void main(String[] args) {
		int n=5;
		int k=1;
		char ch='A';
		for(int i=0;i<n;i++)
		{
			ch='A';
			k=1;
			for(int j=0;j<n;j++)
			{
			 if(i>=j)
			 {
				 if(i%2==0)
				System.out.print(ch++ +" ");
				 else
					 System.out.print(k++ +" ");
			}
			}
			System.out.println();
			if(i%2==0)
				ch++;
}
}
}



