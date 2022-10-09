package com.ce.model;

public class Circle extends Shape {
	
	public static final double PI = 3.14;

	public Circle() {
		super();
	}

	public Circle(double firstDimension) {
		super(firstDimension);
	}

	@Override
	public double getArea() {
		return PI*getFirstDimension()*getFirstDimension();
	}

	@Override
	public double getPerimeter() {
		return 2*PI*getFirstDimension();
	}

}
