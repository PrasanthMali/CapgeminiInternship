package com.cg.emc.dao;

import com.cg.emc.model.Event;
import com.cg.emc.util.ConnectionProvider;
import com.cg.emc.exception.EventManagementException;


import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EventDAOJDBCImpl implements IEventDAO {

	ConnectionProvider conProvider;
	public EventDAOJDBCImpl() throws EventManagementException {
		try {
			conProvider = ConnectionProvider.getInstance();
		} catch (ClassNotFoundException | IOException exp) {
			throw new EventManagementException("Database is not reachable");
		}
	}

	@Override
	public String add(Event event) throws EventManagementException {
		String eventID = null;
		if (event != null) {
			try (Connection con = conProvider.getConnection();PreparedStatement pInsert = con.prepareStatement(IQueryMapper.ADD_EVENT_QRY)) {

				pInsert.setString(1, event.getEventID());
				pInsert.setString(2, event.getTitle());
				pInsert.setDate(3, Date.valueOf(event.getEventDate()));
				pInsert.setString(4, event.getLocation(eventID));
				pInsert.setDouble(5, event.getCost());

				int rowCount = pInsert.executeUpdate();

				if (rowCount == 1) {
					eventID = event.getEventID();
				}
			} catch (SQLException exp) {
				throw new EventManagementException("Event is not inserted");
			}
		}
		return eventID;
	}

	@Override
	public boolean delete(String eventID) throws EventManagementException {
		boolean isDone = false;

		try (Connection con = conProvider.getConnection();PreparedStatement pDelete = con.prepareStatement(IQueryMapper.DEL_EVENT_QRY)) {
			pDelete.setString(1, eventID);
			int rowCount = pDelete.executeUpdate();
			if (rowCount == 1) {
				isDone = true;
			}
		} catch (SQLException exp) {
			throw new EventManagementException("Event is not inserted");
		}
		return isDone;
	}

	@Override
	public Event get(String eventID) throws EventManagementException {
		Event event=null;
		try (Connection con = conProvider.getConnection();PreparedStatement pSelect = con.prepareStatement(IQueryMapper.GET_EVENT_QRY)) {

			pSelect.setString(1, eventID);
			ResultSet rs = pSelect.executeQuery();
			
			if(rs.next()){
				event = new Event();
				event.setEventID(rs.getString("eventID"));
				event.setTitle(rs.getString("Title"));
				event.setEventDate(rs.getDate("EventDate").toLocalDate());
				event.setCost(rs.getDouble("Cost"));
				event.setLocation(((Event) rs).getLocation("Location"));
				
			}
		} catch (SQLException exp) {
			throw new EventManagementException("Event is not available");
		}		
		return event;
	}

	@Override
	public List<Event> getAll() throws EventManagementException {
		List<Event> events=null;
		try (Connection con = conProvider.getConnection();PreparedStatement pSelect = con.prepareStatement(IQueryMapper.GET_ALL_EVENTS_QRY)) {
			ResultSet rs = pSelect.executeQuery();
			events = new ArrayList<Event>();
			while(rs.next()){
				Event event = new Event();
				event.setEventID(rs.getString("eventID"));
				event.setTitle(rs.getString("title"));
				event.setCost(rs.getDouble("cost"));
				event.setEventDate(rs.getDate("eventdate").toLocalDate());
				event.add(event);
			}
			
		} catch (SQLException exp) {
			throw new EventManagementException("No Events are available.");
		}		
		return events;	
	}

	@Override
	public boolean update(Event event) throws EventManagementException {
		boolean isDone = false;
		if (event != null) {
			try (Connection con = conProvider.getConnection();PreparedStatement pUpdate = con.prepareStatement(IQueryMapper.MODIFY_EVENT_QRY)) {
				pUpdate.setString(1, event.getTitle());
				pUpdate.setDouble(2, event.getCost());
				pUpdate.setDate(3, Date.valueOf(event.getEventDate()));
				pUpdate.setString(4, event.getEventID());

				int rowCount = pUpdate.executeUpdate();

				if (rowCount == 1) {
					isDone = true;
				}
			} catch (SQLException exp) {
				throw new EventManagementException("Event is not updated.");
			}
		}
		return isDone;
	}

	@Override
	public void persist() throws EventManagementException {
		/* no implementation required */
		
	}
}