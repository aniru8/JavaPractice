package com.example.Day2JavaMaven;

public class Upi implements Payment {

	@Override
	public void pay(double amount) {
		if (Payment.validateAmount(amount))		{
			System.out.println("Amount paid "+amount+" using upi");
			generateReceipt(amount);
		}
		else 
			System.out.println("Payment failed, Invaild amount");
	}
	
		
	}
	
