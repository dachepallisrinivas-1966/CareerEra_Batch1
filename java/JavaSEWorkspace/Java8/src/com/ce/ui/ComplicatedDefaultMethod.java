package com.ce.ui;

interface A {
	default void show() {
		System.out.println("A - show()");
	}
}

interface B {
	default void show() {
		System.out.println("B - show()");
	}
}

class  C  implements A, B {
	@Override
	public void show() {
		A.super.show();
		B.super.show();
		
	}
}
public class ComplicatedDefaultMethod {

	public static void main(String[] args) {
		C obj = new C();
		obj.show();

	}

}
