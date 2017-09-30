package br.com.taticoweb.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {
	
	private static DatabaseConfig config;
	
	public static DatabaseConfig getInstance() {
		if (config == null) {
			config = new DatabaseConfig();
		}
		return config;
	}
	
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/android_webapp?autoReconnect=true&useSSL=false", "root", "darlon");
	}
}

