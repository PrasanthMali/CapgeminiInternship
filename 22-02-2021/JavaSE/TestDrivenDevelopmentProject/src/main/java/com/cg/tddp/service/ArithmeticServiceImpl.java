package com.cg.tddp.service;

import com.cg.tddp.excep.ZeroNotAllowedException;

public class ArithmeticServiceImpl implements ArithmeticService {

	@Override
	public int subtract(int ... a) {
		int diff = a[0];
		for(int i = 1; i < a.length; i++) {
			diff -= a[i];
		}
		return diff;
	}

	@Override
	public int divide(int... a) throws ZeroNotAllowedException {
		
		int zeroIndex = -1;
		for(int i = 1; i < a.length; i++) {
			if (a[i] == 0) {
				zeroIndex = i;
				break;
			}
		}
		
		if (zeroIndex >= 1) {
			throw new ZeroNotAllowedException();
		}
		
		int quot = a[0];
		for(int i = 1; i < a.length; i++) {
			quot /= a[i];
		}
		return quot;
	}

}