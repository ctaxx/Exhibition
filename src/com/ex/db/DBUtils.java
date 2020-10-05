package com.ex.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.ex.entity.Exhibition;
import com.ex.entity.User;

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

	public List<Exhibition> getExs() {
		logger.info("dbUtils getting exhibition");
		List<Exhibition> result = new ArrayList<>();
		try {
			Connection cn = ConnectionPool.getInstance().getConnection();

			Statement st = cn.createStatement();
			ResultSet rs = null;
			rs = st.executeQuery("SELECT name FROM exhibition;");
			while (rs.next()) {
				Exhibition ex = new Exhibition.Builder().name(rs.getNString(1)).build();
				result.add(ex);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

}
