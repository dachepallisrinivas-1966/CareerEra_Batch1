package com.ce.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.ce.exception.InvalidTxnException;
import com.ce.exception.OperationFailedException;
import com.ce.model.Txn;

public class TxnDAOImpl implements TxnDAO {
	
	private Map<Long, Txn> txns;
	
	public TxnDAOImpl() {
		this.txns = new TreeMap<>();
	}
	
	private long nextTxnId() {
		long txnId = 1;
		if (!txns.isEmpty()) {
			txnId = (Long)((TreeMap<Long,Txn>)txns).lastKey() + 1;
		}
		return txnId;
	}

	@Override
	public Txn add(Txn txn) throws InvalidTxnException, OperationFailedException {
		if (txn != null) {
			long txnId = nextTxnId();
			txn.setTxnId(txnId);
			txns.put(txnId, txn);
		}
		return txn;
	}

	@Override
	public Txn save(Txn txn) throws InvalidTxnException, OperationFailedException {
		if (txn != null) {
			txns.replace(txn.getTxnId(), txn);
		}
		return txn;
	}

	@Override
	public void deleteById(long txnId) throws OperationFailedException {
		txns.remove(txnId);

	}

	@Override
	public List<Txn> getAll() throws OperationFailedException {
		return new ArrayList<Txn>(txns.values());
	}

	@Override
	public Txn getById(long txnId) throws OperationFailedException {
		return txns.get(txnId);
	}

}
