//program for non-static members
package com.nonstatic;

public class C1 {
int i;
int j;
C1(){
	
}
C1(int i,int j)
{
	this.i=i;
	this.j=j;

}
static C1 generationObject(int i,int j)
{
	return new C1(i,j);
}
C1 initialize(int i,int j)
{
	this.i=i;
	this.j=j;
	return this;
}
void display()
{
	System.out.println("i: "+this.i);
	System.out.println("j: "+this.j);
}
	public static void main(String[] args) {
		C1 ob= C1.generationObject(10, 20);
		ob.display();
		ob.initialize(100, 200).display();

	}

}
