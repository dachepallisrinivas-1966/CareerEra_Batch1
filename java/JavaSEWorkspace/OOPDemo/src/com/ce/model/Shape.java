package com.ce.model;

public abstract class Shape {
	private double firstDimension;
	private double secondDimension;
	
	public Shape() {
		/* no implementation */
	}
	public Shape(double firstDimension) {
		this.firstDimension = firstDimension;
		this.secondDimension = 0.0;
	}
	public Shape(double firstDimension, double secondDimension) {
		this.firstDimension = firstDimension;
		this.secondDimension = secondDimension;
	}
	public void setFirstDimension(double firstDimension) {
		this.firstDimension = firstDimension;
	}
	public void setSecondDimension(double secondDimension) {
		this.secondDimension = secondDimension;
	}
	public double getFirstDimension() {
		return this.firstDimension;
	}
	public double getSecondDimension() {
		return this.secondDimension;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
}
