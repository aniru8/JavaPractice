package com.example.Day1JavaMaven;

abstract public class Account {
	private long accountNumber;
	private String accHolderName;
	private String bankName;
	private String iFSC;
	private String branchName;
	private int pin;
	
	public Account(long accountNumber, String accHolderName, String bankName, String iFSC, String branchName) {
		super();
		this.accountNumber = accountNumber;
		this.accHolderName = accHolderName;
		this.bankName = bankName;
		this.iFSC = iFSC;
		this.branchName = branchName;
		this.pin = generatePin();
	}
	
	private int generatePin() {
		int newPin=(int)Math.round(Math.random()*10000);
		return newPin;
	}
	
	
	
	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getiFSC() {
		return iFSC;
	}

	public void setiFSC(String iFSC) {
		this.iFSC = iFSC;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
	public int getPin() {
		return pin;
	}

	
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accHolderName=" + accHolderName + ", bankName=" + bankName
				+ ", iFSC=" + iFSC + ", branchName=" + branchName + ", pin=" + pin + "]";
	}
	
	public abstract void withDraw(double amount);
	
	public abstract void deposit(double amount) ;
	
}
