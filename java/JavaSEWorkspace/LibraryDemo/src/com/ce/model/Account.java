package com.ce.model;

import com.ce.exception.InsufficientBalanceException;

public class Account {
	private long acNum;
	private String acName;
	private double balance;
	
	public final static int MIN_BALANCE = 500;
	
	public Account() {
		/* default constructor */
	}
	
	public Account(long acNum, String acName, double balance) {
		super();
		this.acNum = acNum;
		this.acName = acName;
		this.balance = balance;
	}
	
	public void deposit(long amount) {
		balance += amount;
	}
	
//	public void withdraw(long amount) {
//		try {
//			if (balance - MIN_BALANCE < amount) {
//				throw new InsufficientBalanceException("transaction declined due to insufficient balance");
//			}
//			
//			balance -= amount;
//			
//		} catch(InsufficientBalanceException excep) {
//			System.err.println(excep.getMessage());
//		}
//	}

	
	public void withdraw(long amount) throws InsufficientBalanceException {

		if (balance - MIN_BALANCE < amount) {
				throw new InsufficientBalanceException("transaction declined due to insufficient balance");
		}
		
		balance -= amount;
		
	}
	
	public long getAcNum() {
		return acNum;
	}

	public void setAcNum(long acNum) {
		this.acNum = acNum;
	}

	public String getAcName() {
		return acName;
	}

	public void setAcName(String acName) {
		this.acName = acName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
}
