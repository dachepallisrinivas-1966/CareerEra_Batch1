package com.ce.exception;

public class InvalidUserException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidUserException() {
		/* default constructor */
	}
	public InvalidUserException(String message) {
		super(message);
	}
}
