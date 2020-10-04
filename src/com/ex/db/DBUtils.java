package com.ex.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.logging.Logger;

public class DBUtils {
	Logger logger = Logger.getLogger(DBUtils.class.getName());

	public String getUser() {
		logger.info("dbUtils getting user");
		String resultString = null;
		try {
			Connection cn = ConnectionPool.getInstance().getConnection();
			
			Statement st = cn.createStatement();
			ResultSet rs = null;
			rs = st.executeQuery("SELECT name FROM user;");
			while (rs.next()) {
				resultString = rs.getString(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultString;
	}
	
		public String getExs() {
		logger.info("dbUtils getting exhibition");
		String resultString = null;
		try {
			Connection cn = ConnectionPool.getInstance().getConnection();
			
			Statement st = cn.createStatement();
			ResultSet rs = null;
			rs = st.executeQuery("SELECT name FROM exhibition;");
			while (rs.next()) {
				resultString = rs.getString(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultString;
	}

}
