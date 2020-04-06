//sample program for display Array size
package com.array2;

public class A1 {
static int[] createArray(int size)
{
	int[]array=new int[size];
	for(int i=0;i<array.length;i++)
	{
		array[i]=i+1;
	}
	return array;
}
	public static void main(String[] args) {
		int[] array=createArray(10);
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}

	}

}
/*output
 * 1
2
3
4
5
6
7
8
9
10*/
