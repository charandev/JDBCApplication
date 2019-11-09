package pubg.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import pubg.entity.Pubg;
import pubg.exception.dao.DAOException;

public interface Dao {

	public Pubg createPlayer(Pubg pubg) throws DAOException;

	public ArrayList<Pubg> getAll() throws DAOException, SQLException;

	public String getPlayerHKills() throws DAOException, SQLException;

	public int modifyHKills(String uname, int kills) throws DAOException, SQLException;

	public int deletePlayer(String name) throws DAOException, SQLException;

}
