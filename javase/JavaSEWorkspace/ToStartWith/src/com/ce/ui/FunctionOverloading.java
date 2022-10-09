package com.ce.ui;

public class FunctionOverloading {

	static int area(int length, int breadth) {
		return length*breadth;
	}
	
	static double area(int  first, int second, int third) {
		int s = (first+second+third)/2;
		return Math.sqrt(s*(s-first)*(s-second)*(s-third));
	}
	
	static double area(int radius) {
		return Math.PI*radius*radius;
	}
	
	public static void main(String[] args) {
		System.out.println("Circle Area = " + area(6));
		System.out.println("Rectangle Area = " + area(3,4));
		System.out.println("Triangle Area = " + area(9,8,7));
	}

}
