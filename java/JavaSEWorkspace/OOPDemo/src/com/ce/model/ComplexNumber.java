package com.ce.model;

public class ComplexNumber {
	private double realPart;
	private double imaginaryPart;
	
	public void setRealPart(double real) {
		realPart = real;
	}
	public void setImaginaryPart(double imag) {
		imaginaryPart = imag;
	}
	public double getRealPart() {
		return realPart;
	}
	public double getImaginaryPart() {
		return imaginaryPart;
	}
	
	public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
		ComplexNumber result = new ComplexNumber();
		result.realPart = c1.realPart + c2.realPart;
		result.imaginaryPart = c1.imaginaryPart + c2.imaginaryPart;
		return result;
	}
	
	@Override
	public String toString() {
//		String output = "";
//		output += String.valueOf(realPart);
//		if (imaginaryPart > 0)
//			output += "+";
//		else
//			output += "-";
//		output += String.valueOf(Math.abs(imaginaryPart));
//		output += "i";
//		return output;
		
		StringBuilder output = new StringBuilder();
		output.append(realPart);
		if (imaginaryPart > 0)
			output.append("+");
		else
			output.append("-");
		output.append(Math.abs(imaginaryPart));
		output.append("i");
		return output.toString();
		
	}
	
	@Override
	public boolean equals(Object obj) {
		ComplexNumber temp = (ComplexNumber)obj;
		if (this.realPart == temp.realPart && this.imaginaryPart == temp.imaginaryPart)
			return true;
		else
			return false;
	}
	
}


