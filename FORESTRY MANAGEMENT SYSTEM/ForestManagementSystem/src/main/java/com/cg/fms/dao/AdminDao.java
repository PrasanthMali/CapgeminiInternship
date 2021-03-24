package com.cg.fms.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.fms.entity.Admin;

@Repository
public interface AdminDao extends JpaRepository<Admin, String>{

	Object findById(int i);

	Object existsByAdminId(int adminId);
	






}