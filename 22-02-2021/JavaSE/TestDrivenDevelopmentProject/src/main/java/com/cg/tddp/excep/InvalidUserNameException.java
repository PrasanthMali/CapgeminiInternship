package com.cg.tddp.excep;

public class InvalidUserNameException extends Exception {
	public InvalidUserNameException(String errMsg) {
		super(errMsg);
	}
}