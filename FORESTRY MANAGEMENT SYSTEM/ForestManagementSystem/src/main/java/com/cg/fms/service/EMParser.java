package com.cg.fms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fms.dao.AdminDao;
import com.cg.fms.entity.Admin;
import com.cg.fms.model.AdminModel;

@Service
public class EMParser {
	
	@Autowired
	private AdminDao adminDao;
	
	
//	@Autowired
//	private ContractDao contractDao;
	
	public AdminModel parse(Admin source) {
		return source==null?null:
			new AdminModel(source.getAdminId(),
						source.getAdminName(),
						source.getAdminPassword());
			
	}
	
	public Admin parse(AdminModel source) {
		return source==null?null:
			new Admin(source.getAdminId(),
						source.getAdminName(),
						source.getAdminPassword());
			
	}
//	public Contract parse(ContractModel source) {
//		return source==null?null : 
//			new Contract (source.getContractNumber(),
//					source.getCustomerId(),
//					source.getProductId(),
//					source.getDeliveryDate(),source.getDeliveryPlace(),source.getQuantity(),
//					source.getSchedulerId();
//		
//	}
	
	
	
	
	
	
}