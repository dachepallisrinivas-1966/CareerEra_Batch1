package com.ce.ui;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter mobile number: ");
		String mno = scanner.next();
		if (mno.matches("[1-9][0-9]{9}"))
			System.out.println("Valid Mobile Number");
		else
			System.out.println("Invalid Mobile Number");
		
		Pattern pattern = Pattern.compile("[1-9][0-9]{9}");
		Matcher matcher = pattern.matcher(mno);
		if (matcher.matches())
			System.out.println("valid");
		else
			System.out.println("invalid");
		
		scanner.close();
	}
}