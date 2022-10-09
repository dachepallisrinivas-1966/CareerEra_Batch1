package com.ce.ui;

import java.util.Scanner;

public class BestDenomination {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter amount: ");
		int amount = scan.nextInt();
		// 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1
		int notes;
		if (amount >= 2000) {
			notes = amount/2000;
			System.out.println("2000 x " + notes + " = " + 2000*notes);
			amount %= 2000;
		} 
		if (amount >= 500) {
			notes = amount/500;
			System.out.println("500 x " + notes + " = " + 500*notes);
			amount %= 500;
		}
		if (amount >= 200) {
			notes = amount/200;
			System.out.println("200 x " + notes + " = " + 200*notes);
			amount %= 200;
		}
		if (amount >= 100) {
			notes = amount/100;
			System.out.println("100 x " + notes + " = " + 100*notes);
			amount %= 100;
		}
		if (amount >= 50) {
			notes = amount/50;
			System.out.println("50 x " + notes + " = " + 50*notes);
			amount %= 50;
		}
		if (amount >= 20) {
			notes = amount/20;
			System.out.println("20 x " + notes + " = " + 20*notes);
			amount %= 20;
		}
		if (amount >= 10) {
			notes = amount/10;
			System.out.println("10 x " + notes + " = " + 10*notes);
			amount %= 10;
		}
		if (amount >= 5) {
			notes = amount/5;
			System.out.println("5 x " + notes + " = " + 5*notes);
			amount %= 5;
		}
		if (amount >= 2) {
			notes = amount/2;
			System.out.println("2 x " + notes + " = " + 2*notes);
			amount %= 2;
		}
		if (amount >= 1) {
			notes = amount;
			System.out.println("1 x " + notes + " = " + notes);
			amount %= 1;
		}
				
		scan.close();
	}

}


