package com.codewithajay.exceptionhandling;

public class NegativeNumberException extends Exception {

	private static final long serialVersionUID = 1L;

	public NegativeNumberException(String msg) {
		super(msg);
	}
}
