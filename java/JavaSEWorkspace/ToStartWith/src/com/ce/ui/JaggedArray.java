package com.ce.ui;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter rows of matrix: ");
		int rows = scan.nextInt();
		
		int[][] jarr = new int[rows][];
		int i,j;
		for(i=0; i<rows; i++) {
			System.out.print("Enter no. of columns in row " + i + ":");
			jarr[i] = new int[scan.nextInt()];
		}
		
		System.out.println("Enter values in jagged array ...");
		for(i=0; i<rows; i++) {
			for(j=0; j < jarr[i].length ; j++) {
				jarr[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("jagged array ...");
		for(i=0; i<rows; i++) {
			for(j=0; j < jarr[i].length ; j++) {
				System.out.print(jarr[i][j] + "\t");
			}
			System.out.println();
		}
		
		scan.close();
	}

}
