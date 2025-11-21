package com.example.Day1JavaMaven;

public class SavingsAccount extends Account {
	private double balance;

	public SavingsAccount(long accountNumber, String accHolderName, String bankName, String iFSC, String branchName,
			double balance) {
		super(accountNumber, accHolderName, bankName, iFSC, branchName);
		this.balance = balance;
	}
	

	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "SavingsAccount [balance=" + balance + ", AccountNumber=" + getAccountNumber()
				+ ", AccHolderName=" + getAccHolderName() + ", BankName=" + getBankName() + ", iFSC="
				+ getiFSC() + ", BranchName=" + getBranchName() + ", Pin=" + getPin() + "]";
	}
	
	
	public void withDraw(double amount) {
		if(amount<this.balance) {
			this.balance=this.balance-amount;
			System.out.println("Withdraw successful");
	}
	else 
		System.err.println("Insufficient funds");
	}

	public void deposit(double amount) {
		this.balance=this.balance+amount;
		System.out.println("Amount Depositted successfully");
	}


	//code for generate pin

}
