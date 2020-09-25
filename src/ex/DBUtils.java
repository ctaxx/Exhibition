package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.logging.Logger;

public class DBUtils {
	Logger logger = Logger.getLogger(DBUtils.class.getName());

	public String getUser() {
		logger.info("dbUtils started");
		String resultString = null;
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Exhibitions" + "?useUnicode=true"
					+ "&serverTimezone=UTC" + "&useSSL=true" + "&verifyServerCertificate=false", "root", "Gfhjkm1_");
//			Connection cn = ConnectorDB.getConnection();
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

}
