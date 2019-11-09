package pubg.exception.client;

public class ClientException extends Exception {
	public ClientException() {
		super();
	}

	public ClientException(String description) {
		super(description);
	}

	public ClientException(Throwable cause) {
		super(cause);
	}

	public ClientException(String description, Throwable cause) {
		super(description, cause);
	}

}
