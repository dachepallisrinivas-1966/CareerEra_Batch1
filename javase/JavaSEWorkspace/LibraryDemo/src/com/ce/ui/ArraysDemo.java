package com.ce.ui;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] arr = {10,20,30,50,60,35};
		
		Arrays.sort(arr);
		
		for(int data : arr) {
			System.out.println(data);
		}

	}

}
