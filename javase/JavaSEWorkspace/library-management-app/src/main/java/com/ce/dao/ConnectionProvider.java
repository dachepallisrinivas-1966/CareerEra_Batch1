package com.ce.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	
	private static ConnectionProvider instance;
	private static Connection con;
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/hr";
	private static final String USERNAME = "root";
	private static String PASSWORD = "root";
	
	
	private ConnectionProvider() throws SQLException {
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch(ClassNotFoundException excep) {
			System.err.println("Driver not found");
		}
	}
	
	public static Connection getConnection() {
		return con;
	}
	
	public static ConnectionProvider getInstance() throws SQLException {
		if (instance == null) {
			instance = new ConnectionProvider();
		} else if (getConnection().isClosed()) {
			instance = new ConnectionProvider();
		}
		return instance;
	}

	
}
