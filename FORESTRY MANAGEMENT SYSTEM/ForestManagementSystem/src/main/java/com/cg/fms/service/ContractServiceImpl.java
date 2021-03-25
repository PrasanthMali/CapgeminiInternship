package com.cg.fms.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fms.dao.ContractDao;
import com.cg.fms.entity.Contract;
import com.cg.fms.exception.ContractException;
@Service
public class ContractServiceImpl implements ContractService {
	
	@Autowired
	private ContractDao contractDao;
	
	@Autowired
	private EMParser parser;
	
	public ContractServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	

	public ContractServiceImpl(ContractDao contractDao) {
		super();
		this.contractDao = contractDao;
		this.parser = parser;
	}



	@Override
	public Contract getContract(String contractNumber) throws ContractException {
		if (!contractDao.existsById(contractNumber))
			throw new ContractException("No contract found for the given number");
		return parser.parse(contractDao.findById(contractNumber).get());
	}

	@Override
	public Contract addContract(Contract contract) throws ContractException {
		if (contract != null) {
			if (contractDao.existsById(contract.getContractNumber())) {
				throw new ContractException("Contract with this number already exists");
			}

			contract = contractDao.save(contract);
		}

		return contract;
	}



	@Override
	public void deleteContract(String contractNumber) {
		contractDao.deleteById(contractNumber);
	}
	
	

	@Override
	public List<Contract> getAllContracts() {
		

		return contractDao.findAll().stream().map(parser::parse).collect(Collectors.toList());
	}
	
	
	

	@Override
	public Contract updateContract(Contract contract) throws ContractException {
		if (contract != null) {
			if (contractDao.existsById(contract.getContractNumber())) {
				throw new ContractException("Contract with this doesnot exisit");
			}

			contract = contractDao.save(contract);
		}

		return contract;
	}

}
