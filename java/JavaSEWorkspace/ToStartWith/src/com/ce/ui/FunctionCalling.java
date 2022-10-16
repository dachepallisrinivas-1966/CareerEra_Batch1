package com.ce.ui;

public class FunctionCalling {

	static void change(int value) {
		value++;
	}
	
	public static void main(String[] args) {
		int x = 10;
		change(x);
		System.out.println(x);

	}

}
