package com.cg.sbwd.service;

import com.cg.sbwd.model.SimpleInterest;

@FunctionalInterface
public interface ISimpleInterestService {
	SimpleInterest computeAllowances(SimpleInterest e);
}