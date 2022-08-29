package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo1 {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:sqlserver://IMCCBCP108-BLL\\SQLEXPRESS2019;databaseName=test;user=sa;password=Password_123");
			// IMCCBCP108-BLL\\SQLEXPRESS2019
			System.out.println("Connected");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
