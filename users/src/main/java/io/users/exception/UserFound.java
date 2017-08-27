package io.users.exception;

public class UserFound extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UserFound(String message) {
		super(message);
	}

}
