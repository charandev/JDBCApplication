package pubg.service;

import java.sql.SQLException;
import java.util.ArrayList;

import pubg.entity.Pubg;
import pubg.exception.dao.DAOException;
import pubg.exception.service.ServiceException;

public interface Service {

	public Pubg createPlayer(Pubg pubg) throws ServiceException;

//	public ArrayList<Pubg> getAll() throws DAOException, SQLException;
//
//	public String getPlayerHKills() throws DAOException, SQLException;
//
//	public int modifyHKills(String uname, int kills) throws DAOException, SQLException;
//
//	public int deletePlayer(String name) throws DAOException, SQLException;

}
