package com.cg.fms.service;

import java.util.List;

import com.cg.fms.entity.Contract;

public interface ContractService {
	
	public Contract getContract(String contractNumber);
	public Contract addContract(Contract contract);
	public Contract updateContract(Contract contract);
	public Contract deleteContract(String contractNumber);
	public List<Contract> getAllContracts();
}