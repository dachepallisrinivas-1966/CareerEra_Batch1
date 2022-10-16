package com.ce.ui;

import com.ce.model.Circle;
import com.ce.model.Rectangle;
import com.ce.model.Shape;

public class AbstractApp {

	public static void main(String[] args) {
//		Rectangle rect = new Rectangle(10, 5);
//		System.out.println("Area = " + rect.getArea());
//		System.out.println("Perimeter = " + rect.getPerimeter());
//		
//		Circle cir = new Circle(5);
//		System.out.println("Area = " + cir.getArea());
//		System.out.println("Perimeter = " + cir.getPerimeter());
//		
		
		// polymorphism 
		Shape  shape = new Rectangle(10, 5);
		System.out.println("Area = " + shape.getArea());
		System.out.println("Perimeter = " + shape.getPerimeter());
		
		shape = new Circle(5);
		System.out.println("Area = " + shape.getArea());
		System.out.println("Perimeter = " + shape.getPerimeter());
		

		
	}

}
