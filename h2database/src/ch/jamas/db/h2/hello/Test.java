package ch.jamas.db.h2.hello;

import java.sql.*;

public class Test {
	
	final static String DB_LOCATION="C://local//dev//db//test";
	final static String DB_CONNECT="jdbc:h2:"+DB_LOCATION;
	final static String DB_DRIVER="org.h2.Driver";
	
	final static String DB_NAME="test";
	final static String DB_HOST="localhost";
	
	final static String DB_URL = "jdbc:h2:tcp://"+DB_HOST+"/mem:"+DB_NAME;
	
	Connection conn;
	
	
	
	public static void main(String[] a) throws Exception {
		System.out.println("Test H2 database");
		Class.forName(DB_DRIVER);
//		conn = DriverManager.getConnection(DB_CONNECT, "sa", "");
		conn = DriverManager.getConnection(DB_URL, "sa", "");
		// add application code here
		conn.close();
	}
	
	
	public static ResultSet query(Connection conn, String sql) throws SQLException {
		return conn.createStatement().executeQuery(sql);
		}
}