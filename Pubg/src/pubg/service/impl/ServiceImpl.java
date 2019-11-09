package pubg.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;

import pubg.dao.Dao;
import pubg.service.Service;
import pubg.dao.impl.DAOImpl;
import pubg.entity.Pubg;
import pubg.exception.dao.DAOException;
import pubg.exception.service.ServiceException;

public class ServiceImpl implements Service {
	Dao dao = new DAOImpl();

	@Override
	public Pubg createPlayer(Pubg pubg) throws ServiceException {

		try {
			return dao.createPlayer(pubg);
		} catch (DAOException e) {
			throw new ServiceException("Service Failed To Find Data Because DAO sent Exception", e);
		}
	}

//	@Override
//	public ArrayList<Pubg> getAll() throws DAOExeption, SQLException {
//
//		return dao.getAll();
//	}
//
//	@Override
//	public String getPlayerHKills() throws DAOExeption, SQLException {
//
//		return dao.getPlayerHKills();
//	}
//
//	@Override
//	public int modifyHKills(String uname, int kills) throws DAOExeption, SQLException {
//
//		return dao.modifyHKills(uname, kills);
//	}
//
//	@Override
//	public int deletePlayer(String name) throws DAOExeption, SQLException {
//
//		return dao.deletePlayer(name);
//	}

}
