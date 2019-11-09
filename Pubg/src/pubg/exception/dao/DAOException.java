package pubg.exception.dao;

import pubg.exception.AppException;

public class DAOException extends AppException {

	public DAOException() {
		super();
	}
	
	public DAOException(String description) {
		super(description);
	}

	public DAOException(Throwable cause) {
		super(cause);
	}
	
	public DAOException(String description, Throwable cause) {
		super(description, cause);
	}
	
	
}
