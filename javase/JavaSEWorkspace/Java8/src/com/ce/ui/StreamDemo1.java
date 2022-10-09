package com.ce.ui;

import java.util.Arrays;

public class StreamDemo1 {

	public static void main(String[] args) {
		String[] names = new String[] {"Pyhton", "Java", "C#", "Javascript", "Ruby", "C", "C++", "Typescript" };
		
		Arrays.stream(names)
				.filter(name -> name.length() >= 4)
				.sorted()
				.forEach(name -> System.out.println(name));

	}

}
