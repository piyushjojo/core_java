package com.app.banking;

import static java.lang.Thread.*;

public class JointBankAccount {
	private double balance;

	public JointBankAccount(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}

	// update balance : 10K , amt 5K
	public void updateBalance(double amt) throws Exception {
		System.out.println("Updating bal strted : " + currentThread().getName());
		balance = balance + amt;//15K
		System.out.println("Cancelling updates, after a dly");
		Thread.sleep(20);//c1 : Blocked on sleep : releasing CPU
		balance = balance - amt;
		System.out.println("Updations over by " + currentThread().getName());
	}// 10K

	// chk balance
	public double checkBalance() throws Exception {
		System.out.println("Checking balance : by "+ currentThread().getName());
		Thread.sleep(37);
		return balance;

	}

}
