package org.gyt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlJdbcExample {

	/**
	 * @param args
	 * @throws SQLException
	 * @author sandeep
	 */
	public static void main(String[] args) {

		System.out
				.println("-------- MySQL JDBC Connection Testing ------------\n");
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver class not found !");
			e.printStackTrace();
			return;
		}
		Connection conn = null;

		try {
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/db1", "root", "mysql");
		} catch (SQLException e1) {
		
			e1.printStackTrace();
		}

		if (conn != null) {
			System.out.println("\n \t Now Connected To Database\n \n ");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

			System.out
					.println("-------- MySQL JDBC Connection Success ------------\n\n");

		} else {
			System.out.println("Failed to make connection!");
		}

		String sqlQuery = "select * from studnet;";

		Statement st = null;
		try {
			st = conn.createStatement();
		} catch (SQLException e2) {
			
			e2.printStackTrace();
		}

		ResultSet rs = null;
		try {
			rs = st.executeQuery(sqlQuery);
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

		System.out.println("\t+-----------------------+");
		
		System.out.println("\t|\t student \t|");

		System.out.println("\t+-----------+-----------+");

		System.out.println("\t| name      | roll      |");

		System.out.println("\t+-----------+-----------+");

		try {
			while (rs.next()) {
				System.out.println("\t|  " + rs.getString(1) + "  |"
						+ rs.getString(2) + "   |");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		System.out.println("\t+-----------+-----------+");
	}

}
