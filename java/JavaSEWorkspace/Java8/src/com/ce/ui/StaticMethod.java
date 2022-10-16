package com.ce.ui;

interface Test2 {
	static void print() {
		System.out.println("print method");
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		Test2.print();
	}

}
