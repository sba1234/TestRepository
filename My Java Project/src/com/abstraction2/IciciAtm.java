//sample program for ATM transaction
package com.abstraction2;

public class IciciAtm implements Atm {
int balance;
	
	public void deposit(int depositAmount)
	{
		balance=balance+depositAmount;
		System.out.println("SUCCESSFULLY DEPOSITED");
	}
    public void withdrawal(int withdrawlAmount)
    {
	if(withdrawlAmount<=balance)
	{
		balance=balance-withdrawlAmount;
	}
	else
	{
		System.out.println("INSUFFICIENT BALANCE PLEASE RETRY");
		
	}
    }
	public void checkBalance()
	{
		System.out.println("Balance amount is "+balance);
	}
}




