package com.ce.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.ce.exception.InvalidTxnException;
import com.ce.exception.OperationFailedException;
import com.ce.model.Txn;
import com.ce.model.TxnType;
import com.ce.service.TxnService;
import com.ce.service.TxnServiceImpl;

public class TxnUI {

	private static final String DATE_FORMAT = "dd-MMM-yy";
	
	private TxnService txnService;
	
	Scanner scan = new Scanner(System.in);
	
	public TxnUI() {
		this.txnService = new TxnServiceImpl(); 
	}
	
	public void run() {
		
		MenuOption menu = null;
		MenuOption[] options = MenuOption.values();
		
		while (menu != MenuOption.QUIT) {
			for(MenuOption option : options) {
				System.out.println(option.ordinal() + "\t" + option);
			}
			System.out.println("Enter Choice: ");
			int choice = scan.nextInt();
			
			if (choice < 0 || choice >= options.length) {
				System.out.println("Invalid Choice");
				continue;
			}
			
			menu = options[choice];
			
			try {
				switch(menu) {
				case LIST:
					doList();
					break;
				case ADD:
					doAdd();
					break;
				case REMOVE:
					doRemove();
					break;
				case QUIT:
					System.out.println("Thank You!");
					break;
				}
			} catch(OperationFailedException excep) {
				System.out.println(excep.getMessage());
			}
		}
	}
	
	
	private void doList() throws OperationFailedException {
		List<Txn> txns = txnService.getAll();
		
		if (txns == null || txns.isEmpty()) {
			System.out.println("No transactions found!");
		} else {
			for(Txn t : txns) {
				System.out.println(t);
			}
			
			double totalCredit = txnService.getTotalValue(txns, TxnType.CREDIT);
			double totalDebit = txnService.getTotalValue(txns, TxnType.DEBIT);
			double balance = totalCredit - totalDebit;
			System.out.println("Total Credit: " + totalCredit);
			System.out.println("Total Debit: " + totalDebit);
			System.out.println("Balance: " + balance);
		}
		
	}
	
	
	private void doAdd() throws OperationFailedException {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
		
		System.out.print("Enter desp: ");
		String desp = scan.next();
		System.out.print("Enter Type (CREDIT/DEBIT): ");
		TxnType type = TxnType.valueOf(scan.next());
		System.out.print("Enter amount: ");
		double amount = scan.nextDouble();
		System.out.println("Enter date of Txn(" + DATE_FORMAT + "):" );
		LocalDate txnDate = LocalDate.parse(scan.next(), formatter);
		
		try {
			Txn txn = txnService.add(new Txn(0, desp, amount, txnDate, type));
			System.out.println("Transaction recorded with id: " + txn.getTxnId());
		} catch(InvalidTxnException excep) {
			System.out.println(excep.getMessage());
		}
		
	}
	
	private void doRemove() throws OperationFailedException {
		System.out.println("Enter TxnId: ");
		int txnId = scan.nextInt();
		txnService.deleteById(txnId);
		System.out.println("Txn removed");
	}
	
	
	public static void main(String[] args) {
		TxnUI txnUI = new TxnUI();
		txnUI.run();
	}

}
