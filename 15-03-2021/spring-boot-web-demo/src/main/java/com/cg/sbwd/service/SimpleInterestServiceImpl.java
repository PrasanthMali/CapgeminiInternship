package com.cg.sbwd.service;

import org.springframework.stereotype.Service;

import com.cg.sbwd.model.SimpleInterest;

@Service
public class SimpleInterestServiceImpl implements ISimpleInterestService {

	@Override
	public SimpleInterest computeAllowances(SimpleInterest e) {
		e.setSimpleInterest((e.getPrincipal()*e.getRate()*e.getTime())/100.0);
		
		return e;
	}

}