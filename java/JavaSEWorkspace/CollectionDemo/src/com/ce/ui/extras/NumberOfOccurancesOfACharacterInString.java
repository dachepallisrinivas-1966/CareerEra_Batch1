package com.ce.ui.extras;

public class NumberOfOccurancesOfACharacterInString {

	public static void main(String[] args) {
		String str = "hello world";
		int initialLength = str.length();
		
		String ch = "o";
		str = str.replace(ch, "");
		int lengthAfterReplace = str.length();
		System.out.println(initialLength - lengthAfterReplace);

	}

}
