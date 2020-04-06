//sample program for inheritance
package com.inheritance;

public class Loan {
String type;
double roi;
int tennure;
double amount;
void interest(int i)
{
	amount=i+(i*roi*tennure)/100;
	System.out.println(amount);
	
}
Loan()
{
	
}
Loan(String type,double roi,int tennure)
{
	this.type=type;
	this.roi=roi;
	this.tennure=tennure;
}
}
