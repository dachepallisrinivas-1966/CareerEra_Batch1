package com.ce.ui;


class A {
	A() {
		System.out.println("A - constructor");
	}
	A(int x) {
		System.out.println("A - x = " + x);
	}
}

class B extends A{
	B() {
		System.out.println("B - constructor");
	}
	B(int y) {
		System.out.println("B - y = " + y);
	}
}




public class Dummy {
	public static void main(String[] args) {
		B obj = new B(100);
		
	}
	
}
