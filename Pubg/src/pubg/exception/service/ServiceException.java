package pubg.exception.service;

import pubg.exception.AppException;

public class ServiceException extends AppException {

	public ServiceException() {
		super();
	}

	public ServiceException(String description) {
		super(description);
	}

	public ServiceException(Throwable cause) {
		super(cause);
	}

	public ServiceException(String description, Throwable cause) {
		super(description, cause);
	}

}
