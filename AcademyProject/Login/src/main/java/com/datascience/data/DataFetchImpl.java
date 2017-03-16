package com.datascience.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.datascience.Utilities.ApplicationConstants;
import com.datascience.user.User;

public class DataFetchImpl implements DataFetch {

	public void fetchData(String uName, String password, User user) {
		Connection conn = null;

		try {
			conn = getConnection();
			PreparedStatement ps = conn.prepareStatement(ApplicationConstants.uIdFetch);
			ps.setString(1, uName);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				
				user.setUserId(rs.getInt(1));
				PreparedStatement pStat = conn.prepareStatement(ApplicationConstants.nameFetch);
				pStat.setString(1, Integer.toString(rs.getInt(1)));
				ResultSet rSet = pStat.executeQuery();
				while (rSet.next()) {
					String name = rSet.getString(1) + rSet.getString(2);
					user.setName(name);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				closeConnection(conn);
			}
		}
	}

	public static Connection getConnection()
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Connection conn = null;
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		conn = DriverManager.getConnection(ApplicationConstants.dbUrl, ApplicationConstants.dbUserName,
				ApplicationConstants.dbPassword);
		return conn;
	}

	public static void closeConnection(Connection conn) {

		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
