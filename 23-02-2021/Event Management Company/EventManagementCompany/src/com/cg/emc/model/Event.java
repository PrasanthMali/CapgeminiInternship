package com.cg.emc.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Event implements Serializable, Comparable<Event> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String eventID;
	private String title;
	private LocalDate eventDate;
	private String location;
	private double cost;

	public Event() {
		/* default constructor */
	}
	
	public Event(String eventID, String title, LocalDate eventDate, String location, double cost) {
		super();
		this.eventID = eventID;
		this.title = title;
		this.eventDate = eventDate;
		this.location = location;
		this.cost = cost;
	}

	public String getEventID() {
		return eventID;
	}

	public void setEventID(String eventID) {
		this.eventID = eventID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getEventDate() {
		return eventDate;
	}

	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Event [eventID=" + eventID + ", title=" + title + ", eventDate=" + eventDate + ", location=" + location
				+ ", cost=" + cost + "]";
	}

	@Override
	public int compareTo(Event event) {
		LocalDate firstEventDate = this.eventDate;
		LocalDate secondEventDate = event.eventDate;
		return firstEventDate.compareTo(secondEventDate);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eventDate == null) ? 0 : eventDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		if (eventDate == null) {
			if (other.eventDate != null)
				return false;
		} else if (!eventDate.equals(other.eventDate))
			return false;
		return true;
	}
	
	
}
