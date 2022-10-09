package com.ce.ui;

import java.util.Scanner;

public class StringBuilderPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = scan.nextLine();
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		if (str.equals(sb.toString())) {
			System.out.println(str + " is a palindrome");
		} else {
			System.out.println(str + " is not a palindrome");
		}
		
		scan.close();

	}

}
