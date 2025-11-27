package com.example.Day4.DesignPatterns;

public class UpiPayment implements Payment{
	
	private CashPayment cash=new CashPayment();
	
	@Override
	public void pay(double amount) {
		System.out.println("User validated");
		System.out.println("Pin verified successfully");
		System.out.println("Payment done");
		cash.pay(amount);		
		
	}

}
