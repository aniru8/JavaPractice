package com.example.Day4.DesignPatterns;

public class NetBanking implements Payment{
	
	private CashPayment cash=new CashPayment();
	
	@Override
	public void pay(double amount) {
		System.out.println("User credentials validated");
		System.out.println("OTP verified successfully");
		System.out.println("Payment done");
		cash.pay(amount);		
		
	}

}
