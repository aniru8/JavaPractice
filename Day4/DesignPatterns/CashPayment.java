package com.example.Day4.DesignPatterns;

public class CashPayment implements Payment{

	@Override
	public void pay(double amount) {
		System.out.println("Payment of amount "+amount+" completed. Thank you.");
		
	}
	

}
