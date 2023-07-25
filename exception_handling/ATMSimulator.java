package com.exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidInputException extends RuntimeException {

	public InvalidInputException(String message) {
		super(message);
	}

}

public class ATMSimulator {

	Scanner scanner = new Scanner(System.in);

	float getAccountBalance() throws InvalidInputException {
		System.out.println("Enter your account balance: ");
		try {
			float balance = scanner.nextFloat();
			if (balance <= 0) {
				throw new InvalidInputException("Balance cannot be negative");
			}
			return balance;
		} catch (InputMismatchException e) {
			throw new InvalidInputException("Please Enter Correct Amount");
		}
	}

	float getWithdrawalAmount() throws InvalidInputException {
		try {
		System.out.println("Enter withdrawal amount: ");
			float amount = scanner.nextFloat();
			if (amount <= 0) {
				throw new InvalidInputException("Amount cannot be negative");
			}
			return amount;
		} catch (InputMismatchException e) {
			throw new InvalidInputException("Please Enter Correct Amount");
		}
	}

	void withdraw() throws InvalidInputException {
		float balance = getAccountBalance();
		float amount = getWithdrawalAmount();

		if (amount > balance) {
			throw new InvalidInputException("Withdrawal Amount cannot be more than Account Balance");
		}

		System.out.println("Successfully Withdrawn");
		System.out.println("Remaining Balance: " + (balance - amount));
	}

	public static void main(String[] args) {
		ATMSimulator obj = new ATMSimulator();

		obj.withdraw();
		
		

	}
}
