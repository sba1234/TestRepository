//sample program using constructor to display watch  properties
package com.constructor;

public class Watch {
	String type;
	double price;
	Watch()
	{
		type="analog";
		price=20.5;
	}
	Watch(String type,double price)
	{
		this.type=type;
		this.price=price;
	}

	

	}


