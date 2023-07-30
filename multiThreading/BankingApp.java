package com.multiThreading;

import java.util.Scanner;

class Account{
	
	private double accountBalance;
	
	public Account(double amount) {
		this.accountBalance=amount;
	}
	
	public double getAccountBalance() {
		return this.accountBalance;
	}
	
	public void withdraw(double amount) {
		if (amount>accountBalance) {
			System.out.println("Not enough Balance");
		} else {
			accountBalance = accountBalance-amount;
			System.out.println("Withdraw Successfull. Remaining Balance: "+getAccountBalance());
		}
	}
}


public class BankingApp extends Thread{
	
	static Account account;
	Scanner scanner = new Scanner(System.in);
	
	@Override
	public void run() {
			
			System.out.println("Enter Amount to Withdraw");
			double amount = scanner.nextDouble();
			account.withdraw(amount);
			
	}
	
	public static void main(String[] args) {
		BankingApp.account = new Account(1000);
		
		BankingApp thread1 = new BankingApp();
		BankingApp thread2 = new BankingApp();
		
		thread1.start();
		thread2.start();
	}

}
