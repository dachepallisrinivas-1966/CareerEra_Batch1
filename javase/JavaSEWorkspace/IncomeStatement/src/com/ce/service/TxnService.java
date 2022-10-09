package com.ce.service;

import java.util.List;

import com.ce.exception.InvalidTxnException;
import com.ce.exception.OperationFailedException;
import com.ce.model.Txn;
import com.ce.model.TxnType;

public interface TxnService {
	Txn add(Txn txn) throws InvalidTxnException, OperationFailedException;
	Txn save(Txn txn) throws InvalidTxnException, OperationFailedException;
	void deleteById(long txnId) throws OperationFailedException;
	List<Txn> getAll() throws OperationFailedException;
	Txn getById(long txnId) throws OperationFailedException;
	double getTotalValue(List<Txn> txns, TxnType type);
}
