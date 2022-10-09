package com.ce.ui;

import java.util.Arrays;
import java.util.OptionalDouble;

public class StreamDemo2 {

	public static void main(String[] args) {
		String[] marks = {"50", "90", "56", "98", "37" };
		
		int totalMarks = Arrays.stream(marks)
				.mapToInt(mark -> Integer.parseInt(mark))
				.filter(mark -> mark > 50)
				.sum();
		
		System.out.println("Total Marks = " + totalMarks);
		
		OptionalDouble avg = Arrays.stream(marks)
				.mapToInt(mark -> Integer.parseInt(mark))
				.average();
		System.out.println("Average Marks = " + avg.getAsDouble());

	}

}
