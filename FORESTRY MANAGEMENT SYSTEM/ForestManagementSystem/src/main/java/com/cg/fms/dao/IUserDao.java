package com.cg.fms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.fms.entity.User;

public interface IUserDao extends JpaRepository<User, String> {
	
}
