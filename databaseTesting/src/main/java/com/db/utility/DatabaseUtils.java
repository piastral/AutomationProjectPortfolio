package com.db.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class DatabaseUtils {
	

		
		private static String url = "jdbc:mysql://localhost:3307/testdb";
	    private static String username = "mohammad";
	    private static String password = "hajar";

	    public static Connection getConnection() throws Exception {
	        return DriverManager.getConnection(url, username, password);
	    }

	    public static void runSelectQuery(String query) {
	        try (Connection conn = getConnection();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(query)) {
	        	while(rs.next()) {
	        		System.out.println(rs.getString("first_name"));

	       /*     while (rs.next()) {
	                int id = rs.getInt("emp_id");
	                String firstName = rs.getString("first_name");
	                String lastName = rs.getString("last_name");
	                String email = rs.getString("email");
	                double salary = rs.getDouble("salary");
	                String department = rs.getString("department");
	                String status = rs.getString("status");

					
					  System.out.println(id + " | " + firstName + " | " + lastName + " | " + email
					  + " |" + salary + " |" + "|" +department + "|" + status + " |");
					 */
	               
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	
	}


