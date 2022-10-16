package com.ce.model;

public class Sample {
	static {
		System.out.println("in static block");
	}
	public Sample() {
		System.out.println("in constructor");
	}
	
	{
		System.out.println("in first instance block");
	}
	{
		System.out.println("in second instance block");
	}
}
