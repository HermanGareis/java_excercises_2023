package com.mkyong.hashing.exceptions;

public abstract class BaseException extends Exception {
	

	private static final long serialVersionUID = 1L;
	private final String message;

	
	protected BaseException(String msg) {
		this.message = msg;
	}

	public String getMessage() {
		return this.message;
	}
}