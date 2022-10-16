package com.ce.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionApp2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter two numbers: ");
		int firstNumber = scan.nextInt();
		int secondNumber = scan.nextInt();
		int result;
		result = firstNumber + secondNumber;
		System.out.println("Sum = " + result);
		result = firstNumber - secondNumber;
		System.out.println("Difference = " + result);

		if (secondNumber != 0) {
			result = firstNumber / secondNumber;
			System.out.println("Quotient = " + result);
			result = firstNumber % secondNumber;
			System.out.println("Remainder = " + result);
		} else {
			System.out.println("cannot calculate quotient and remainder since denonimator is 0 ");
		}

		result = firstNumber * secondNumber;
		System.out.println("Product = " + result);
		scan.close();

	}

}
