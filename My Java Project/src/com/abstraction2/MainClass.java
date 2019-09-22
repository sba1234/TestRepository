//sample program for interface
package com.abstraction2;

public class MainClass {

	public static void main(String[] args) {
		//In1 ob1=new In1();//can't instantiate an interface and interface doesn't
		                  // have constructor
		
		In1 ob2;//can create reference variable of an interface
		
		In1 ob=new Imp();//Imp is concrete hence can be instantiated
		ob.test();

	}

}//WebDriver driver=new RemoteWebDriver();
