package com.ce.ui;

public class VarArgsDemo {

	static int sum(int ... arr) {
		int sum = 0;
		for(int data : arr) {
			sum += data;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		System.out.println(sum(10,20,30,40,50));
		System.out.println(sum(5,6,7));
	
	}

}
