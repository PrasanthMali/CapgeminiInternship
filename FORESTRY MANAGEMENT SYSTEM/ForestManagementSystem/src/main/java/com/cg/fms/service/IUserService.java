package com.cg.fms.service;

import com.cg.fms.entity.User;

public interface IUserService {
	public User login(String username,String password);
	public User logout(User user);
	public User addUser(User user);
	public User removeUser(User user);
	
}
