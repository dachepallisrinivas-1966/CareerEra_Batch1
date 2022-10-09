package com.ce.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.print("Enter two numbers: ");
			int firstNumber = scan.nextInt();
			int secondNumber = scan.nextInt();
			int result;
			result = firstNumber + secondNumber;
			System.out.println("Sum = " + result);
			result = firstNumber - secondNumber;
			System.out.println("Difference = " + result);
			
			try {
				result = firstNumber / secondNumber;
				System.out.println("Quotient = " + result);
				result = firstNumber % secondNumber;
				System.out.println("Remainder = " + result);
			} catch(ArithmeticException excep) {
				System.out.println("cannot calculate quotient and remainder - denominator is 0.");
			}
			
			result = firstNumber * secondNumber;
			System.out.println("Product = " + result);
		} catch(InputMismatchException excep) {
			System.out.println("please give integer inputs only");
		} finally {
			scan.close();
		}

	}

}
