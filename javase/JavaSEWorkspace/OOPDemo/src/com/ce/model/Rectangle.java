package com.ce.model;

public class Rectangle extends Shape {

	public Rectangle() {
		super();
	}

	public Rectangle(double firstDimension, double secondDimension) {
		super(firstDimension, secondDimension);
	}

	@Override
	public double getArea() {
		return getFirstDimension()*getSecondDimension();
	}
	
	@Override
	public double getPerimeter() {
		return 2*(getFirstDimension() + getSecondDimension());
	}

}
