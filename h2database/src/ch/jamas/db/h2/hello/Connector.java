package ch.jamas.db.h2.hello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
	private Connection connection;
	final static String DB_DRIVER="org.h2.Driver";
	final static String DB_NAME="test";
	final static String DB_HOST="localhost";
	
	final static String DB_URL = "jdbc:h2:tcp://"+DB_HOST+"/mem:"+DB_NAME;
	
	Connector(String dbUrl) throws ClassNotFoundException, SQLException {
		Class.forName(DB_DRIVER);
//		conn = DriverManager.getConnection(DB_CONNECT, "sa", "");
		connection = DriverManager.getConnection(DB_URL, "sa", "");
		// add application code here

	}
	
	public Connection getConnection() {
		return connection;
	}
	
	public int queryForInt(String sql){
		return 0;
	}

}
