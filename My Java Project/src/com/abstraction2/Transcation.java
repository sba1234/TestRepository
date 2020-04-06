//sample program for ATM transaction
package com.abstraction2;

public class Transcation {

	public static void main(String[] args) {
		Atm atm=new IciciAtm();
		atm.deposit(1000);
		atm.checkBalance();
		atm.withdrawal(100);
		atm.checkBalance();
		

	}

}
