package com.ce.ui;

import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
			System.out.println("connected.");
		} catch (ClassNotFoundException excep) {
			System.out.println("database driver not found");
		} catch (SQLException excep) {
			System.out.println("could not connect to database");
		}

	}

}
