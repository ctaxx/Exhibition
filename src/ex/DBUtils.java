package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class DBUtils {
	Logger logger = Logger.getLogger(DBUtils.class.getName());
	public void connect() {
		logger.info("dbUtils started");
		
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection cn = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/Exhibitions"
							+ "?useUnicode=true"
							+ "&serverTimezone=UTC"
							+ "&useSSL=true"
							+ "&verifyServerCertificate=false", "root","Gfhjkm1_");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
