package com.ce.ui;

import java.util.Scanner;

public class StringSplitWordCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = scan.nextLine();
		String[] words = str.split(" ");
		System.out.println("Word count = " + words.length);
		scan.close();
	}

}
