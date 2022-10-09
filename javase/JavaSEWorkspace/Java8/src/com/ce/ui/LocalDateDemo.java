package com.ce.ui;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class LocalDateDemo {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		LocalDate birthDay = LocalDate.of(1966, Month.APRIL, 9);
		System.out.println(birthDay);
		LocalDate myDay = LocalDate.parse("1947-08-15");
		System.out.println(myDay);
		
		Period period = Period.between(birthDay, today);
		System.out.printf("%d Year(s) %d Month(s) %d Day(s)\n", period.getYears(), period.getMonths(), period.getDays());
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
		System.out.println(dtf.format(today));

	}

}
