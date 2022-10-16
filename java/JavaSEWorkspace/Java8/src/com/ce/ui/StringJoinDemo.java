package com.ce.ui;

import java.util.ArrayList;
import java.util.List;

public class StringJoinDemo {

	public static void main(String[] args) {
		String joinedStr = String.join("-", "Hello", "World", "How", "are", "you?");
		System.out.println(joinedStr);
		
		List<String> names = new ArrayList<>();
		names.add("Srinivas");
		names.add("James Gosling");
		names.add("Ed Frank");
		names.add("Kris Warth");
		names.add("Mike Sheridan");
		names.add("Patrick Naughton");
		
		String joinedStr2 = String.join(":", names);
		System.out.println(joinedStr2);
		
	}

}