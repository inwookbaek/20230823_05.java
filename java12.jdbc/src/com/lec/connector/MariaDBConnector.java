package com.lec.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MariaDBConnector {

	public static Connection getConnection() {

		String DRV = "org.mariadb.jdbc.Driver";
		String URL = "jdbc:mariadb://localhost:3306/testdb";
		String USR = "root";
		String PWD = "12345";
		
		try {
			Class.forName(DRV);
			return DriverManager.getConnection(URL, USR, PWD);
		} catch (Exception e) {
			return null;
		}		
	}
	
	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();				
		} catch (Exception e) {
			// dummy
		}
	}

}
