package com.cg.fms.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "schedulers_details")
public class Scheduler {
	@Id
	private String schedulerId;

	@Column(name = "scheduler_name")
	@NotEmpty(message = "scheduler name cannot be empty")
	@NotNull(message = "scheduler name cannot be omitted")
	private String schedulerName;

	@Column(name = "scheduler_contact")
	@Pattern(regexp = "[1-9][0-9]{9}", message = "mobile number is expected to be 10 digits and should not start with 0")
	@NotNull(message = "scheduler contact cannot be omitted")
	private String schedulerContact;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Set<Contract>contract;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Order> order;
	
	@Column(name = "truck_number")
	@NotEmpty(message = "truck number cannot be empty")
	@NotNull(message = "truck number cannot be omitted")
	private String truckNumber;

	public Scheduler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Scheduler(String schedulerId,
			@NotEmpty(message = "scheduler name cannot be empty") @NotNull(message = "scheduler name cannot be omitted") String schedulerName,
			@Pattern(regexp = "[1-9][0-9]{9}", message = "mobile number is expected to be 10 digits and should not start with 0") @NotNull(message = "scheduler contact cannot be omitted") String schedulerContact,
			@NotEmpty(message = "truck number cannot be empty") @NotNull(message = "truck number cannot be omitted") String truckNumber) {
		super();
		this.schedulerId = schedulerId;
		this.schedulerName = schedulerName;
		this.schedulerContact = schedulerContact;
		this.truckNumber = truckNumber;
	}

	public String getSchedulerId() {
		return schedulerId;
	}

	public void setSchedulerId(String schedulerId) {
		this.schedulerId = schedulerId;
	}

	public String getSchedulerName() {
		return schedulerName;
	}

	public void setSchedulerName(String schedulerName) {
		this.schedulerName = schedulerName;
	}

	public String getSchedulerContact() {
		return schedulerContact;
	}

	public void setSchedulerContact(String schedulerContact) {
		this.schedulerContact = schedulerContact;
	}

	public String getTruckNumber() {
		return truckNumber;
	}

	public void setTruckNumber(String truckNumber) {
		this.truckNumber = truckNumber;
	}

}
