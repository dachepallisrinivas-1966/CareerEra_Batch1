package com.ce.ui;

public class FunctionMinMaxArray {
	static int[] minMax(int[] arr) {
		int[] result = new int[2];
		result[0] = result[1] = arr[0];
		for(int index = 1; index < arr.length; index++) {
			if (arr[index] < result[0]) {
				result[0] = arr[index];
			}
			if (arr[index] > result[1]) {
				result[1] = arr[index];
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] array = {10,20,30,5,6,7,12};
		int[] output = minMax(array); 
		System.out.println("Minimum Value = " + output[0]);
		System.out.println("Maximum Value = " + output[1]);
	}

}
