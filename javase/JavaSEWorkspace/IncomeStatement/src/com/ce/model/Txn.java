package com.ce.model;

import java.time.LocalDate;

public class Txn {
	private long txnId;
	private String desp;
	private double amount;
	private LocalDate txnDate;
	private TxnType type;
	
	public Txn() {
		/* default constructor */
	}
	
	public Txn(long txnId, String desp, double amount, LocalDate txnDate, TxnType type) {
		this.txnId = txnId;
		this.desp = desp;
		this.amount = amount;
		this.txnDate = txnDate;
		this.type = type;
	}

	public long getTxnId() {
		return txnId;
	}

	public void setTxnId(long txnId) {
		this.txnId = txnId;
	}

	public String getDesp() {
		return desp;
	}

	public void setDesp(String desp) {
		this.desp = desp;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDate getTxnDate() {
		return txnDate;
	}

	public void setTxnDate(LocalDate txnDate) {
		this.txnDate = txnDate;
	}

	public TxnType getType() {
		return type;
	}

	public void setType(TxnType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return String.format("Txn [txnId=%s, desp=%s, amount=%s, txnDate=%s, type=%s]", txnId, desp, amount, txnDate,
				type);
	}
	
	
	
}
