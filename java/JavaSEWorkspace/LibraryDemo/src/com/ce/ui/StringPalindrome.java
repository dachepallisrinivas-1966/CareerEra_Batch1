package com.ce.ui;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = scan.nextLine();
		String rev = "";
		for(int i = str.length() -1 ;  i >= 0; i--) {
			rev += str.charAt(i);
		}
		// System.out.println("Reverse String = " + rev);
		if (str.equals(rev)) {
			System.out.println(str + " is a palindrome");
		} else {
			System.out.println(str + " is not a palindrome");
		}
		scan.close();
	}

}
