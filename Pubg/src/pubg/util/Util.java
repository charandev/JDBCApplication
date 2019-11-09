package pubg.util;

import java.sql.*;

import pubg.exception.dao.DAOException;

public class Util {
	static Connection con = null;
	static final String url = "jdbc:mysql://localhost:3306/pubg?useSSL=false";
	static final String un = "root";
	static final String pwd = "Welcome123";

	public Util() {
	}

	public Connection getConnection() throws DAOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, un, pwd);
		} catch (SQLException | ClassNotFoundException e) {
//			throw new DAOExeption("Error Creating Connection", e);
		}
		return con;
	}

	public void closeConnection() throws DAOException {
		try {
			con.close();
		} catch (SQLException e) {
//			throw new DAOExeption("Error Closing Connection", e);
		}
	}
}
