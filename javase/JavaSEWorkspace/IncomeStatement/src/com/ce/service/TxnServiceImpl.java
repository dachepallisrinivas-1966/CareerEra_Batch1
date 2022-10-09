package com.ce.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.ce.dao.TxnDAO;
import com.ce.dao.TxnDAOImpl;
import com.ce.exception.InvalidTxnException;
import com.ce.exception.OperationFailedException;
import com.ce.model.Txn;
import com.ce.model.TxnType;

public class TxnServiceImpl implements TxnService {
	
	private TxnDAO txnDao;
	
	public TxnServiceImpl() {
		this.txnDao = new TxnDAOImpl();
	}
	
	private boolean isValid(Txn txn) throws InvalidTxnException {
		List<String> errMsgs = new ArrayList<>();
		
		if (txn.getDesp() == null || txn.getDesp().isBlank()) 
			errMsgs.add("Txn Description cannot be blank");
		
		if (txn.getAmount() < 0)
			errMsgs.add("Txn Amount cannot be negative");
		
		if (txn.getTxnDate() == null || txn.getTxnDate().isAfter(LocalDate.now()))
			errMsgs.add("Txn Date cannot be a future date");
		
		if (txn.getType() == null)
			errMsgs.add("Txn Type is a mandatory");
		
		
		if (!errMsgs.isEmpty()) 
			throw new InvalidTxnException(errMsgs.toString());
		
		return errMsgs.isEmpty();
	}

	@Override
	public Txn add(Txn txn) throws InvalidTxnException, OperationFailedException {
		if (txn != null && isValid(txn)) {
			txnDao.add(txn);
		}
		return txn;
	}

	@Override
	public Txn save(Txn txn) throws InvalidTxnException, OperationFailedException {
		if (txn != null && isValid(txn)) {
			txnDao.save(txn);
		}
		return txn;
	}

	@Override
	public void deleteById(long txnId) throws OperationFailedException {
		txnDao.deleteById(txnId);

	}

	@Override
	public List<Txn> getAll() throws OperationFailedException {
		return txnDao.getAll();
	}

	@Override
	public Txn getById(long txnId) throws OperationFailedException {
		return txnDao.getById(txnId);
	}

	@Override
	public double getTotalValue(List<Txn> txns, TxnType type) {
		double totalValue = 0;
		for(Txn t : txns) {
			if (t.getType() == type) {
				totalValue += t.getAmount();
			}
		}
		return totalValue;
	}

}
