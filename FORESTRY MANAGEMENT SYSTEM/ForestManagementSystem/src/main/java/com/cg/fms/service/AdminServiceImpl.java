package com.cg.fms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fms.dao.AdminDao;
import com.cg.fms.entity.Admin;
import com.cg.fms.exception.AdminException;
import com.cg.fms.model.AdminModel;
@Service
public class AdminServiceImpl implements IAdminService {

	@Autowired
	private AdminDao adminDao;
	

	
	public AdminServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Admin getAdmin(String adminName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin addAdmin(Admin admin) throws AdminException {
		return admin;
	}



	@Override
	public Admin deleteAdmin(int adminId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Admin> getAllAdmins() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<AdminModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public AdminModel findById(int adminId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean existsByAdminId(int adminId) {
		// TODO Auto-generated method stub
		return false;
	}

}
