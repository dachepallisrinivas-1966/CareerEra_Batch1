package com.ce.ui;

import java.util.Scanner;

public class EnumDemo {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int choice, firstNumber, secondNumber;
		
		do {
			for(ArithmeticOperation menuOption : ArithmeticOperation.values()) {
				System.out.println(menuOption.ordinal() + "\t" + menuOption.name());
			}
			System.out.print("Enter choice: ");
			choice = scan.nextInt();
			if (choice >= 0 && choice < ArithmeticOperation.values().length-1) {
				System.out.print("Enter two numbers: ");
				firstNumber = scan.nextInt();
				secondNumber = scan.nextInt();
				
				switch(ArithmeticOperation.values()[choice]) {
					case ADD: System.out.println("Sum = " + (firstNumber + secondNumber)); 
								break;
					case SUBTRACT: System.out.println("Difference = " + (firstNumber - secondNumber)); 
								break;
					case MULTIPLY: System.out.println("Product = " + (firstNumber * secondNumber)); 
								break;
					case DIVIDE: System.out.println("Quotient = " + (firstNumber / secondNumber)); 
								break;
					default: break; 
				}
			}
		} while (choice != ArithmeticOperation.EXIT.ordinal());
		System.out.println("Thank you.");
		scan.close();
	}

}
