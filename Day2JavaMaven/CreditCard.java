package com.example.Day2JavaMaven;

public class CreditCard implements Payment{

	@Override
	public void pay(double amount) {
		//validate the creditcard by number,cvv, validity date
		if (Payment.validateAmount(amount))		{
			System.out.println("Amount paid "+amount+" using creditcard");
			generateReceipt(amount);
		}
		else 
			System.out.println("Payment failed, Invaild amount");
	}
	

}
