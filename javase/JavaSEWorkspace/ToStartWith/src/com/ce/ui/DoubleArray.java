package com.ce.ui;

import java.util.Scanner;

public class DoubleArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter rows of matrix: ");
		int rows = scan.nextInt();
		System.out.print("Enter columns of matrix: ");
		int cols = scan.nextInt();
		int[][] darr = new int[rows][cols];
		System.out.println("Enter values in matrix ...");
		int i, j;
		for(i=0; i<rows; i++) {
			for(j=0; j<cols; j++) {
				darr[i][j] = scan.nextInt();
			}
		}
		System.out.println("Matrix is ...");
		for(i=0; i<rows; i++) {
			for(j=0; j<cols; j++) {
				System.out.print(darr[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("Matrix (enhanced for) ...");
		for(int[]   row :  darr) {
			for(int data : row) {
				System.out.print(data + "\t");
			}
			System.out.println();
		}
		scan.close();
	}

}
