package com.db.tests;

import com.db.utility.DatabaseUtils;
/* important statement when passing the query make sure your while loop is running properly if you are using 
 * 
 * 
 * 
 */

public class DatabaseTest {
	public static void main(String[] args) {
		String query = "SELECT first_name FROM employee;";

        System.out.println("Running SQL Query...");
        DatabaseUtils.runSelectQuery(query);

        System.out.println("Query execution completed.");
    }
	}


