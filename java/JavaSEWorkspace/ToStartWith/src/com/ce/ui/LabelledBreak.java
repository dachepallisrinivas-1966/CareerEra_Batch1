package com.ce.ui;

import java.util.Scanner;

public class LabelledBreak {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int choice = 4;
		first:
			do {
				System.out.println("1. Add");
				System.out.println("2. Subtract");
				System.out.println("3. Multiply");
				System.out.println("4. Exit");
				System.out.println("Enter choice: ");
				choice = scan.nextInt();
				switch (choice) {
					case 1: doAdd(); break;
					case 2: doSubtract(); break;
					case 3: doMultiply(); break;
					case 4: break first;
				}
			} while (choice != 4);
		
		scan.close();
	}

	private static void doAdd() {
		System.out.println("Enter 2 numbers: ");
		int a = scan.nextInt();
		System.out.println("Enter 2 numbers : ");
		int b = scan.nextInt();
		System.out.println("Result = " + (a+b));
		
	}
	private static void doSubtract() {
		System.out.println("Enter 2 numbers: ");
		int a = scan.nextInt();
		System.out.println("Enter 2 numbers : ");
		int b = scan.nextInt();
		System.out.println("Result = " + (a-b));
		
	}
	private static void doMultiply() {
		System.out.println("Enter 2 numbers: ");
		int a = scan.nextInt();
		System.out.println("Enter 2 numbers : ");
		int b = scan.nextInt();
		System.out.println("Result = " + (a*b));
		
	}
}
