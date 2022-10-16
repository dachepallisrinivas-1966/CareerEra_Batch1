package com.ce.ui.extras;

import java.util.HashSet;
import java.util.Set;

public class Pangram {

	public static void main(String[] args) {
		String input = "The quick brown fox jumps over the lazy dog";
		Set<Character> chars = new HashSet<>();
		input = input.toLowerCase();
		input = input.replaceAll("[ ]", "");
		
		for(char ch : input.toCharArray()) {
			chars.add(ch);
		}
		
		if (chars.size() == 26)
			System.out.println("pangram");
		else
			System.out.println("not pangram");
	}

}
