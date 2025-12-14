package pack2.databaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "master";
		String dbURL = url + dbName;

		String username = "root";
		String password = "hajar";

		Connection connection = null;

		try {

			// Create an Objecr for driver class;
			String driver = "com.mysql.cj.jdbc.Driver";
			Class.forName(driver);

			// Connect to master Database getconnection return type is driver manager
			// Connection is interface
			connection = DriverManager.getConnection(dbURL, username, password);

			// Verify the connection and execute sql statement

			if (!connection.isClosed()) // the method isClosed has connection as return type
			{
				System.out.println("Succefully connected to master database");

				// Fire SQL selection Statments
				// statement is interface Executes the given SQL statement, which returns a
				// single
				// object.Creates a Statement object for sendingSQL statements to the
				// database.SQL statements without parameters are normallyexecuted
				// using Statement objects. If the same SQL statementis executed many times,
				// it may be more efficient to use a PreparedStatement object.

				Statement statement = connection.createStatement(); // returns new default statement object
				ResultSet resultSet = statement.executeQuery("select * from customers");
				/*
				 * A ResultSet object maintains a cursor pointing to its current row of data.
				 * Initially the cursor is positionedbefore the first row. The next method moves
				 * thecursor to the next row, and because it returns false when there are no
				 * more rows in the ResultSet object ,it can be used in a while loop
				 * 
				 */
				while (resultSet.next())
					System.out.println(resultSet.getInt("ID") + "--" + resultSet.getString("CustomerName") + "--"
							+ resultSet.getString("Country"));

			}

		} catch (Exception e) {

			e.printStackTrace();

		}

		finally {
			// close the connection
			try {
				connection.close();
			} catch (SQLException n) {
				n.printStackTrace();
			}

			try {
				if (connection.isClosed()) {
					System.out.println("Succesfully closed the connection to master database ");

				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

		}

	}

}
