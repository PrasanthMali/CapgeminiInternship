package com.cg.emc.dao;

import java.util.List;

import com.cg.emc.excep.EventManagementException;
import com.cg.emc.model.Event;

public interface IEventDAO {
	String add(Event event) throws EventManagementException;
	boolean delete(String eventID) throws EventManagementException;
	Event get(String eventID) throws EventManagementException;
	List<Event> getAll() throws EventManagementException;
	boolean update(Event event) throws EventManagementException;
	void persist() throws EventManagementException;

}
