package com.ce.ui;

public class FunctionSum {

	static int sum(int[] arr) {
		int sum = 0;
		for(int data : arr) {
			sum += data;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		int[] first = {10,20,30,40,50};
		int[] second = {5,6,7};
		
	
		System.out.println(sum(first));
		System.out.println(sum(second));
		System.out.println(sum(new int[] {10,20,30,40,50}));
		System.out.println(sum(new int[] {5,6,7}));
		
	}

}
