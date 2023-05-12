package org.example.encapsulation;

class BankAccount {
	private String accountNumber;
	private double balance;

	public BankAccount(String accountNumber, double initialBalance) {
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println(amount + " deposited successfully. New balance: " + balance);
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && balance >= amount) {
			balance -= amount;
			System.out.println(amount + " withdrawn successfully. New balance: " + balance);
		} else {
			System.out.println("Insufficient balance.");
		}
	}
}

public class Main {
	public static void main(String[] args) {
		BankAccount account = new BankAccount("123456789", 1000.0);

		// Accessing account details using public methods
		System.out.println("Account number: " + account.getAccountNumber());
		System.out.println("Current balance: " + account.getBalance());

		// Depositing and withdrawing money
		account.deposit(500.0);
		account.withdraw(200.0);
	}
}

