package com.cg.fms.model;

import java.io.Serializable;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;



public class LandModel implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	private int landId;
	

	private String surveyNumber;
	

	private String ownerName;
	
	
	private String landArea;
	
	public LandModel() {
		// TODO Auto-generated constructor stub
	}


	public LandModel(int landId, String surveyNumber,String ownerName, String landArea) {
		super();
		this.landId = landId;
		this.surveyNumber = surveyNumber;
		this.ownerName = ownerName;
		this.landArea = landArea;
	}



	public int getLandId() {
		return landId;
	}

	public void setLandId(int landId) {
		this.landId = landId;
	}

	public String getSurveyNumber() {
		return surveyNumber;
	}

	public void setSurveyNumber(String surveyNumber) {
		this.surveyNumber = surveyNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getLandArea() {
		return landArea;
	}

	public void setLandArea(String landArea) {
		this.landArea = landArea;
	}
	
	

}
