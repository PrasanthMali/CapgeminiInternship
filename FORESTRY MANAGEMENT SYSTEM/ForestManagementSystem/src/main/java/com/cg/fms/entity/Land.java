package com.cg.fms.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "lands_details")
public class Land implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int landId;

	@Column(name = "survey_number")
	@NotEmpty(message = "survry number  cannot be empty")
	@NotNull(message = "survey number cannot be omitted")
	private String surveyNumber;

	@Column(name = "owner_namer")
	@NotEmpty(message = "owner name  cannot be empty")
	@NotNull(message = "owner name cannot be omitted")
	private String ownerName;

	@Column(name = "land_area")
	@NotEmpty(message = "land area  cannot be empty")
	@NotNull(message = "land area cannot be omitted")
	private String landArea;

	public Land() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Land(int landId,
			@NotEmpty(message = "survry number  cannot be empty") @NotNull(message = "survey number cannot be omitted") String surveyNumber,
			@NotEmpty(message = "owner name  cannot be empty") @NotNull(message = "owner name cannot be omitted") String ownerName,
			@NotEmpty(message = "land area  cannot be empty") @NotNull(message = "land area cannot be omitted") String landArea) {
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
