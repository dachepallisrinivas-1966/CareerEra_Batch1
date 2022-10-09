package com.ce.ui;

import java.util.Scanner;

public class StringWordCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = scan.nextLine();
		int wordCount = 1;
		for(int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				wordCount++;
			}
		}
		System.out.println("No. of words : " + wordCount);
		scan.close();
	}

}
