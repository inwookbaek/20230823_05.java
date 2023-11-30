package com.lec.ex02_board;

import java.io.FileReader;
import java.io.InputStream;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	
	private String path = ConnectionFactory.class
			.getResource("./jdbc.properties").getPath();
	
	private String DRV = null;
	private String URL = null;
	private String USR = null;
	private String PWD = null;
	
	private String insert = null;
	private String select = null;
	private String update = null;
	private String delete = null;
	
	public ConnectionFactory() {
		try {
			System.out.println();
			setUp();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void setUp() throws Exception {
		
		Properties p = new Properties();
		path = URLDecoder.decode(path, "utf-8");
		p.load(new FileReader(path));
//		p.load(new FileReader("jdbc.properties"));
		
		// 1. DB접속정보
		DRV = p.getProperty("jdbc.mariadb.drv");
		URL = p.getProperty("jdbc.mariadb.url");
		USR = p.getProperty("jdbc.mariadb.usr");
		PWD = p.getProperty("jdbc.mariadb.pwd");

		// 2. SQL정보
		insert = p.getProperty("insert");
		select = p.getProperty("select");
		update = p.getProperty("update");
		delete = p.getProperty("delete");
	
		Class.forName(DRV);
	}
	
	public Connection getConnection() {
		try {
			return DriverManager.getConnection(URL, USR, PWD);
		} catch (SQLException e) {
			System.out.println("DB연결실패!!!");
			e.printStackTrace();
			return null;
		}
	}

	public String getInsert() {
		return insert;
	}

	public String getSelect() {
		return select;
	}

	public String getUpdate() {
		return update;
	}

	public String getDelete() {
		return delete;
	}
}













