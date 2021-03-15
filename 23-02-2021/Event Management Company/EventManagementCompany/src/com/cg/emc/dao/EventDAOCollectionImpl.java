package com.cg.emc.dao;

import java.util.Map;
import java.util.TreeMap;

import com.cg.emc.exception.EventManagementException;
import com.cg.emc.model.Event;

import java.util.ArrayList;
import java.util.List;



public class EventDAOCollectionImpl implements IEventDAO {
	
	private Map<String, Event> events;
	public EventDAOCollectionImpl( ) {
		events = new TreeMap<>();
	}
	@Override
	public String add(Event event) throws EventManagementException {
		String eventID = null;
		if (event != null ) {
			eventID = event.getEventID();
			events.put(eventID, event);
		}
		return eventID;
	}
	@Override
	public boolean delete(String eventID) throws EventManagementException {
		boolean isDone = false;
		if (eventID != null) {
			events.remove(eventID);
			isDone = true;
		}
		return isDone;
	}

	@Override
	public Event get(String eventID) throws EventManagementException {
		return events.get(eventID);
	}

	@Override
	public List<Event> getAll() throws EventManagementException {
		return new ArrayList<>(events.values());
	}

	@Override
	public boolean update(Event event) throws EventManagementException {
		boolean isDone = false;
		if (event != null) {
			String eventID = event.getEventID();
			events.replace(eventID, event);
			isDone = true;
		}
		return isDone;
	}

	@Override
	public void persist() throws EventManagementException {
		// TODO Auto-generated method stub
		
	}

}
