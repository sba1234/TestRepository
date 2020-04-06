//sample program for inheritance
package com.inheritance;

public class HomeLoan extends Loan{
	String place;
	HomeLoan()
	{
		
	}
	HomeLoan(String type,double roi,int tennure,String place)
	{
		super(type,roi,tennure);
		this.place=place;
	}

}
