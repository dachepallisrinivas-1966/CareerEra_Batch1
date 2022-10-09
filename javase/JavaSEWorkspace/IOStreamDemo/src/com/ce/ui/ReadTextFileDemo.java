package com.ce.ui;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadTextFileDemo {

	public static void main(String[] args) {
		Scanner scan = null;
		FileReader fr = null;
		
		try {
			scan = new Scanner(System.in);
			System.out.print("Enter filename: ");
			String fileName = scan.nextLine();
			
			fr = new FileReader(fileName);
			int ch;
			while (true) {
				ch = fr.read();
				if (ch == -1)
					break;
				System.out.print((char)ch);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not present");
		} catch (IOException e) {
			System.out.println("Could not read file");
		} finally {
			scan.close();
			try {
				fr.close();
			} catch (IOException excep) {
				System.out.println(excep.getMessage());
			}
		}

	}

}
 