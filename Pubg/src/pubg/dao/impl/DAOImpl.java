package pubg.dao.impl;

import java.sql.*;
import java.util.ArrayList;

import pubg.dao.Dao;
import pubg.entity.Pubg;
import pubg.exception.dao.DAOException;
import pubg.util.Util;

public class DAOImpl implements Dao {
	Util util = new Util();

	@Override
	public Pubg createPlayer(Pubg pubg) throws DAOException {
		try {
			Connection con = util.getConnection();
			PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO pubg VALUES(?,?,?)");
			preparedStatement.setInt(1, pubg.getId());
			preparedStatement.setString(2, pubg.getUserName());
			preparedStatement.setInt(3, pubg.gethKills());
			preparedStatement.executeUpdate();
			util.closeConnection();
		} catch (NullPointerException | SQLException e) {
			throw new DAOException("Error In DB. Restart It", e);
		}

		return pubg;

	}

	@Override
	public ArrayList<Pubg> getAll() throws DAOException, SQLException {
		ArrayList<Pubg> allelements = new ArrayList<>();
		Pubg pubg = new Pubg();
		Connection con = util.getConnection();
		PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM pubg");
		ResultSet rs;
		rs = preparedStatement.executeQuery();
		while (rs.next()) {

			pubg.setId(rs.getInt(1));
			pubg.setUserName(rs.getString(2));
			pubg.sethKills(rs.getInt(3));
			allelements.add(pubg);
		}

		util.closeConnection();
		return allelements;
	}

	@Override
	public String getPlayerHKills() throws DAOException, SQLException {
		Connection con = util.getConnection();
		PreparedStatement preparedStatement = con
				.prepareStatement("SELECT uname FROM pubg WHERE hkills = (SELECT max(hkills) FROM pubg)");
		ResultSet rs = preparedStatement.executeQuery();
		rs.next();
		String name = rs.getString(1);
		util.closeConnection();

		return name;

	}

	@Override
	public int modifyHKills(String uname, int kills) throws DAOException, SQLException {
		Connection con = util.getConnection();
		Pubg pubg = new Pubg();
		PreparedStatement preparedStatement = con.prepareStatement("update pubg set hkills=? where uname=?");

		preparedStatement.setInt(1, kills);
		preparedStatement.setString(2, uname);

		int st = preparedStatement.executeUpdate();

		util.closeConnection();
		return st;
	}

	@Override
	public int deletePlayer(String name) throws DAOException, SQLException {
		Connection con = util.getConnection();
		PreparedStatement preparedStatement = con.prepareStatement("delete from pubg where uname=?");
		preparedStatement.setString(1, name);
		int count = preparedStatement.executeUpdate();
		util.closeConnection();
		return count;
	}

}
