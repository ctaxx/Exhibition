package ex.db;

import java.sql.*;
import java.util.ResourceBundle;

public class ConnectorDB {
	public static Connection getConnection() throws SQLException {
		ResourceBundle resource = ResourceBundle.getBundle("database");
		String url = resource.getString("db.url");
		String user = resource.getString("db.user");
		String password = resource.getString("db.password");
	
		return DriverManager.getConnection(url, user, password);
		
	}
}
