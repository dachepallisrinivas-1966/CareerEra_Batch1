package com.ce.ui;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadTextFileDemo2 {

	public static void main(String[] args) {
		
		/* try with resource */
		try (Scanner scan = new Scanner(System.in);
			 FileReader fr = new FileReader("names.txt");
			 BufferedReader br = new BufferedReader(fr))   {
			String line = null;

			while (true) {
				line  = br.readLine();
				if (line == null)
					break;
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not present");
		} catch (IOException e) {
			System.out.println("Could not read file");
		} 
	}

}
