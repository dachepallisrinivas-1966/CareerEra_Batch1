package com.ce.ui;

import java.util.Scanner;

public class BestDenomination2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter amount: ");
		int amount = scan.nextInt();
		int[] denoms = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
		int notes;
		for(int i = 0; i < denoms.length; i++) {
			if (amount >= denoms[i]) {
				notes = amount/denoms[i];
				System.out.println(denoms[i] + " " + notes + " = " + denoms[i]*notes);
				amount %= denoms[i];
			} 
		}
		scan.close();
	}

}


