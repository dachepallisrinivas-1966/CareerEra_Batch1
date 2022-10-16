package com.ce.ui;

import com.ce.exception.InsufficientBalanceException;
import com.ce.model.Account;

public class ExceptionApp3 {

	public static void main(String[] args) {
		Account first = new Account(101, "srinivas", 30000.0);
		first.deposit(5000);
		System.out.println(first.getBalance());
		try {
			first.withdraw(6000);
		} catch (InsufficientBalanceException excep) {
			System.out.println(excep.getMessage());
		}
		System.out.println(first.getBalance());

	}

}
