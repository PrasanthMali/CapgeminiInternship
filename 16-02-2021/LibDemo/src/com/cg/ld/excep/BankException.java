package com.cg.ld.excep;

public class BankException extends Exception {

	private static final long serialVersionUID = 1L;

	public BankException(String errMsg) {
		super(errMsg);
	}
}