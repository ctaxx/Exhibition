package com.ex.db;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionPool {

	private ConnectionPool() {
	}

	private static ConnectionPool instance = null;

	public static ConnectionPool getInstance() {
		if (instance == null)
			instance = new ConnectionPool();
		return instance;
	}

	public Connection getConnection() {
		Connection c = null;
		try {
			Context ctx = (Context)(new InitialContext().lookup("java:comp/env"));
			DataSource ds = (DataSource) ctx.lookup("jdbc/exspool");
			c = ds.getConnection();
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
	}
}
