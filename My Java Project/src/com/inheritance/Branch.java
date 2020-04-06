//sample program for inheritance
package com.inheritance;

public class Branch {

	public static void main(String[] args) {
		HomeLoan h1=new HomeLoan("homeloan",8.5,2,"Hindupur");
		System.out.println("Home: "+h1.type+" roi: "+h1.roi+" tennure: "+h1.tennure+" place: "+h1.place);
		h1.interest(500000);

	}

}
