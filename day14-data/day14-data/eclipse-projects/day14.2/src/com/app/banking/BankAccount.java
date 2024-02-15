package com.app.banking;

import java.time.LocalDate;

import custom_exceptions.BankingException;

import static utils.BankingValidationRules.validateBalance;

/*
 * BankAccount : acctNo(int) , customer name , type(enum) , creationDate(java.time.LocalDate) , balance
 */
public class BankAccount {
	private int acctNo;
	private String customerName;
	private AcType acctType;
	private LocalDate creationDate;// wraper for holding the date : yyyy-MM-dd , immutable, no need of SDF for
									// parse n format
	private double balance;
//	private String ifsc;

	public BankAccount(int acctNo, String customerName, AcType acctType, LocalDate creationDate, double balance) {
		super();
		this.acctNo = acctNo;
		this.customerName = customerName;
		this.acctType = acctType;
		this.creationDate = creationDate;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", customerName=" + customerName + ", acctType=" + acctType
				+ ", creationDate=" + creationDate + ", balance=" + balance + "]";
	}
	// If you want to add account info in the HashMap , which method you will have
	// to override , for the correct working of hashing algo ? NONE (neither equals nor hashCode)
	//since key type of the Map : java.lang.Integer , which has alrdy followed the contract
	//HM<Integer,BankAccount>
	//What it will be in case of comp PK ? (acctId + ifsc) 
	//HM<AccountPK,BankAccount> : custom key class
	//B.L methods --w ,d , funds transfer
	public void deposit(double amount)
	{
		this.balance += amount;
	}
	public void withdraw(double amount) throws BankingException
	{
		validateBalance(balance-amount);
		this.balance -= amount;
	}
	public void fundsTransfer(BankAccount dest,double transferAmount) throws BankingException
	{
		this.withdraw(transferAmount);
		dest.deposit(transferAmount);
		System.out.println("Funds transferred from src "+this.acctNo+" into ---> "+dest.acctNo);
	}
}
