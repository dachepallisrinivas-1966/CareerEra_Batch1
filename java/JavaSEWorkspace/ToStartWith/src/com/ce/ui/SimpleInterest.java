package com.ce.ui;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter principle: ");
		int principle = scan.nextInt();
		System.out.print("Enter time: ");
		int time = scan.nextInt();
		System.out.print("Enter rate: ");
		int rate = scan.nextInt();
		double simpleInterest = principle*time*rate/100.0;
		System.out.println("Simple Interest = " + simpleInterest);
		scan.close();
	}

}


