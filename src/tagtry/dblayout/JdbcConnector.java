package tagtry.dblayout;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcConnector {
	public static String userName = "root";
	public static String password = "toor";
	public static String serverName = "localhost";
	public static String portNumber = "3306";
	public static String dbName = "tagtry";
	private static Connection conn = null;

	public static Connection open() throws SQLException {

		Properties connectionProps = new Properties();
		connectionProps.put("user", userName);
		connectionProps.put("password", password);
		
		if (connectionProps.equals("mysql")) {
			conn = DriverManager.getConnection("jdbc:mysql://" + serverName
					+ ":" + portNumber + "/", connectionProps);
		} else if (connectionProps.equals("derby")) {
			conn = DriverManager.getConnection("jdbc:mysql://" + dbName
					+ ";create=true", connectionProps);
		}
		System.out.println("Connected to database");
		return conn;
	}

	public static void close() throws SQLException {
		if (conn != null) {
			conn.close();
		}
	}

}
