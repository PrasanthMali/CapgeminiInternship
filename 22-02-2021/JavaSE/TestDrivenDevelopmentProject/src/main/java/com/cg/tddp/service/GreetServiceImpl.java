package com.cg.tddp.service;

import com.cg.tddp.excep.InvalidUserNameException;

public class GreetServiceImpl implements GreetService {
	
	@Override
	public String greet(String userName) throws InvalidUserNameException {
		
		if (userName != null && userName.isEmpty()) {
			throw new InvalidUserNameException("user name can not be empty");
		}
		
		return userName==null?null:"Hello "+userName;
	}
	
}