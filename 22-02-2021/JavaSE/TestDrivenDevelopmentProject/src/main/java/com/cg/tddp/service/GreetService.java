package com.cg.tddp.service;

import com.cg.tddp.excep.InvalidUserNameException;

public interface GreetService {
	String greet(String userName) throws InvalidUserNameException;
}