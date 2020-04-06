//program for non-static members
package com.nonstatic;

public class Exercise {
static int i;
int j;
void E1()
{
	//accessing static inside non-static context
	System.out.println(i);//directly
	Exercise.i=200;
	System.out.println(Exercise.i);//using class name
	//accessing non-static member fron non-static context
	System.out.println(j);//directly
	System.out.println(this.j);//using this
	
}

	public static void main(String[] args) {
		//accessing static member in to static method
		System.out.println(i);//directly
		Exercise.i=10;
		System.out.println(Exercise.i);//using class name
		//accessing non-static member into static method
		Exercise ob=new Exercise();//create object
		ob.j=10;//by creating an object and using an object reference
		ob.E1();
		System.out.println(i);
		System.out.println(ob.j);

	}

}
