package com.array2;

public class A2 {
	static void display(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
	public static void main(String[] args) {
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=i+1;
		}
		display(arr);

	}

}
/*output
1
2
3
4
5
*/
