package com.patterns;
//program for right angled triangle
/*1 1 1 1 1
*   2 2 2 2
*     3 3 3
*       4 4 
*         5 
*/
public class Pattern35 {

	public static void main(String[] args) {
		
				int n=5;
				int k=1;
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<n;j++)
					{
						if(i<=j)
							System.out.print(k +" ");
						else
							System.out.print(" "+" ");
						
					}
					System.out.println();
					k++;
				}

			}
}
