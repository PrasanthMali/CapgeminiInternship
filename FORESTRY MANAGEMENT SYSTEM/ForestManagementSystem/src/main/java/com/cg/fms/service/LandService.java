package com.cg.fms.service;

import java.util.List;

import com.cg.fms.entity.Land;

public interface LandService {
	public Land getLand(String surveyNumber);

	public Land addLand(Land land);

	public Land updateLand(Land land);

	public Land removeLandDetails(String surveyNumber);
	
	public List<Land> getAllLands();
}
