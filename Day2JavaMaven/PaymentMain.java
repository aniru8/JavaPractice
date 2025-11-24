package com.example.Day2JavaMaven;


//Payment,Upi,CreditCard,PaymentMain
public class PaymentMain {

	public static void main(String[] args) {
		CreditCard cc=new CreditCard();
		cc.pay(4500);
		
		Upi upi=new Upi();
		upi.pay(50);
		
		Payment payment=new CreditCard();
		payment.pay(8080);
		
		Payment payment1=(amount)->{
			if (Payment.validateAmount(amount))		{
				System.out.println("Amount paid "+amount+" using upi");
				
			}
			else {
				System.out.println("Payment failed, Invaild amount");
		

	}

 };
}
}