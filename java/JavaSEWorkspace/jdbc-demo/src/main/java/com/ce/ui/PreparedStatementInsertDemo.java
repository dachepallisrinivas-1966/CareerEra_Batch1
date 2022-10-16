package com.ce.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementInsertDemo {

	public static void main(String[] args) {
		
		String sql = "INSERT INTO jobs (job_id, job_title, min_salary, max_salary) VALUES (?,?,?,?)";
		
		// automatic resource management (try-with-resources)
		try (Scanner scan = new Scanner(System.in);
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "root");
		     PreparedStatement pst = con.prepareStatement(sql);) {

			String jobId = "";
			String jobTitle = "";
			int minSalary = 0;
			int maxSalary = 0;
			
			
			while (true) {
				System.out.print("Enter job id [0 to stop] : ");
				jobId = scan.next();
				if (jobId.equals("0"))
					break;
				System.out.print("Enter job title : ");
				jobTitle = scan.next();
				System.out.print("Enter min salary : ");
				minSalary = scan.nextInt();
				System.out.print("Enter max salary : ");
				maxSalary = scan.nextInt();
				
				
				pst.setString(1, jobId);
				pst.setString(2, jobTitle);
				pst.setInt(3, minSalary);
				pst.setInt(4, maxSalary);
				
				pst.executeUpdate();
				System.out.println("row inserted.");
			}
		
		} catch(SQLException excep) {
			excep.printStackTrace();
		} 
	
	}

}
