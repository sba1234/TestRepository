package com.patterns;
//program for right angled triangle
/*1
* 2 2
* 3 3 3
* 4 4 4 4
* 5 5 5 5 5
*/
public class Pattern02 {

	public static void main(String[] args) {
		
				int n=5;
				int k=1;
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<n;j++)
					{
						if(i>=j)
							System.out.print(k +" ");
						
					}
					System.out.println();
					k++;
				}

			}
}

