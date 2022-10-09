package com.ce.ui;

import java.util.Scanner;

public class SingleArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no. of cells : ");
		int size = scan.nextInt();
		double[] arr = new double[size];
		
		for(int i = 0; i < size; i++) {
			System.out.print("Enter value in a[" + i + "]: ");
			arr[i] = scan.nextInt();
		}
		
		// System.out.println(arr);
		
		for(int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("-------------------------------------");
		
		for(double data : arr) {
			System.out.println(data);
		}
		
		
		System.out.println("=========================================");
		
		for(double data : arr) {
			System.out.println(data);
		}
	
		
		scan.close();
	}

}
