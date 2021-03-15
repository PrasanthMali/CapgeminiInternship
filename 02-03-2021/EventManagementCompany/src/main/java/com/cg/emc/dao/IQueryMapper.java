package com.cg.emc.dao;

public interface IQueryMapper {

	public static final String ADD_EVENT_QRY = 
			"INSERT INTO events(eventID,  title, eventDate, location, cost) VALUES(?,?,?,?)";
	public static final String MODIFY_EVENT_QRY = 
			"UPDATE events SET title=?,cost=?,eventDate=? WHERE eventID=?";
	public static final String DEL_EVENT_QRY = 
			"DELETE FROM events WHERE eventID=?";
	public static final String GET_ALL_EVENTS_QRY = 
			"SELECT * FROM events";
	public static final String GET_EVENT_QRY = 
			"SELECT * FROM events WHERE eventID=?";
}