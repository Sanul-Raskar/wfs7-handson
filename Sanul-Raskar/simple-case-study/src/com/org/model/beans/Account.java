package com.org.model.beans;

public class Account {
	private int accountNumber;
	private String customerName;
	private double balance;
	private static int accountCounter = 0;
	public Account(String customerName) {
		super();
		this.accountNumber = ++accountCounter;
		this.customerName = customerName;
		this.balance = 5000;
	}
	
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", customerName=" + customerName + ", balance=" + balance
				+ "]";
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static int getAccountCounter() {
		return accountCounter;
	}
	public static void setAccountCounter(int accountCounter) {
		Account.accountCounter = accountCounter;
	}
	
}
