package com.cg.fms.service;

import java.util.List;

import com.cg.fms.entity.Admin;
import com.cg.fms.exception.AdminException;
public interface IAdminService {

	public Admin getAdmin(String adminName);

	public Admin addAdmin(Admin admin)throws AdminException;
	
	public Admin updateAdmin(Admin admin);

	public Admin deleteAdmin(int adminId);

	public List<Admin> getAllAdmins();

	

	
}
