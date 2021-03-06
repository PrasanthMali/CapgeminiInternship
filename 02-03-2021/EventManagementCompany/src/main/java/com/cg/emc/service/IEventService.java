package com.cg.emc.service;

import java.util.List;

import com.cg.emc.exception.EventManagementException;
import com.cg.emc.model.Event;

public interface IEventService {
	String add(Event event) throws EventManagementException;
	boolean delete(String eventID) throws EventManagementException;
	Event get(String eventID) throws EventManagementException;
	List<Event> getAll() throws EventManagementException;
	boolean update(Event event) throws EventManagementException;
	void persist() throws EventManagementException;
}
