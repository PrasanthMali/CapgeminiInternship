package com.cg.emc.dao;

import java.util.List;

import com.cg.emc.excep.EventManagementException;
import com.cg.emc.model.Event;

public class EventDAOJDBCImpl implements IEventDAO {

	@Override
	public String add(Event event) throws EventManagementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(String eventID) throws EventManagementException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Event get(String eventID) throws EventManagementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> getAll() throws EventManagementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Event event) throws EventManagementException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void persist() throws EventManagementException {
		// TODO Auto-generated method stub
		
	}

}
