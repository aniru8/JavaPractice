package com.example.Day7.MultiThread;

public class BankAccount {
	private double balance=29200;
	
	
	public synchronized void withDraw(double amount) {
	
		System.out.println(Thread.currentThread().getName()+" is Running"); 
		synchronized(this) {
			if(amount>balance)
			System.out.println("Insufficient funds");
		
		else {
		System.out.println(Thread.currentThread().getName()+" withdrawing"); 
		balance=balance-amount;
		System.out.println("Your account balance is "+balance);
		}
	}
}
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		Runnable r=()->{
			account.withDraw(100 );
		};
		Thread t1=new Thread(r,"User1");
		Thread t2=new Thread(r,"User2");
		
		t1.start();
		t2.start();
				

	}

}
