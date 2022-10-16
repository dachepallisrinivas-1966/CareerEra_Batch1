package com.ce.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultSetDemo2 {

	public static void main(String[] args) {
		String sql = "SELECT department_id, count(*) AS EmployeeCount FROM employees GROUP BY department_id ORDER BY department_id;";
		
		// automatic resource management (try-with-resources)
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "root");
		     PreparedStatement pst = con.prepareStatement(sql);
			 ResultSet rs = pst.executeQuery();) {

			while (rs.next()) {
				System.out.printf("%5s%5s\n",rs.getString(1), rs.getString(2));
			}
			
		} catch(SQLException excep) {
			excep.printStackTrace();
		} 

	}

}
