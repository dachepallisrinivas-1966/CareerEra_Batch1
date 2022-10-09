package com.ce.ui;

import java.util.Scanner;

public class DateValidation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter dd mm yy: ");
		int dd = scan.nextInt();
		int mm = scan.nextInt();
		int yy = scan.nextInt();
		
		boolean isValid = true;
		
		if (dd < 1 || dd > 31 || mm < 1 || mm > 12 || yy < 1) {
			isValid = false;
		} else if (mm == 2) {
			if (yy % 4 == 0 && yy % 100 != 0 || yy % 400 == 0) {
				if (dd > 29) {
					isValid = false;
				}
			} else if (dd > 28) {
				isValid = false;
			}
		} else if (mm == 4 || mm == 6 || mm == 9 || mm == 11 && dd > 30) {
			isValid = false;
		}
		
		if (isValid)
			System.out.println("valid date");
		else
			System.out.println("invalid date");
		
		scan.close();
	}

}
