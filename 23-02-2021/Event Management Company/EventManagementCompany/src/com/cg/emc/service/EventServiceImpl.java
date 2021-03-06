package com.cg.emc.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.emc.dao.EventDAOCollectionImpl;
import com.cg.emc.dao.IEventDAO;
import com.cg.emc.exception.EventManagementException;
import com.cg.emc.model.Event;

public class EventServiceImpl implements IEventService {
	
	private IEventDAO eventDao;

	public IEventDAO getDAO(){
		return eventDao;
	}
	
	public EventServiceImpl() throws EventManagementException {
		eventDao = new EventDAOCollectionImpl();
		
		//eventDao = new BookDAOIOStreamImpl();
		
		
		// bookDao = new BookDAOJDBCImpl();
		
	}
	
	public boolean isValidEventID(String eventID){
		
		/*
		 * First letter must be capital
		 * Followed by three digits
		 */
		Pattern eventIDPattern = Pattern.compile("[A-Z]\\d{3}");
		Matcher eventIDMatcher = eventIDPattern.matcher(eventID);
		
		return eventIDMatcher.matches();
	}
	
	public boolean isValidTitle(String title){
		/*
		 * First Letter should be capital
		 * Minimum length is 4 chars
		 * Maximum length is 20 chars.		
		 */
		Pattern titlePattern = Pattern.compile("[A-Z]\\w{3,19}");
		Matcher titleMatcher = titlePattern.matcher(title);
		
		return titleMatcher.matches();
	}
	
	public boolean isValidCost(double cost){
		/*
		 * Price is between 5 and 5000
		 */
		return cost>=5 && cost<=5000;
	}
	
	public boolean isValidEventDate(LocalDate eventDate){
		/*
		 * publish date should not be greater than the current day.
		 */
		LocalDate today = LocalDate.now();
		//return publishDate.isBefore(today) || publishDate.equals(today);
		return today.isAfter(eventDate) || today.equals(eventDate);
	}
	
	public boolean isValidBook(Event event) throws EventManagementException {
		boolean isValid=false;
		
		List<String> errMsgs = new ArrayList<>();
		
		if(!isValidEventID(event.getEventID()))
			errMsgs.add("EventID should start with a capital alphabet followed by 3 digits");
		
		if(!isValidTitle(event.getTitle()))
			errMsgs.add("Title must start with capital and must be in between 4 to 20 chars in length");
		
		if(!isValidCost(event.getCost()))
			errMsgs.add("Cost must be between INR.5 and INR.5000");
		
		if(!isValidEventDate(event.getEventDate()))
			errMsgs.add("Event Date should not be a future date");
		
		if(errMsgs.isEmpty())
			isValid=true;
		else
			throw new EventManagementException(errMsgs.toString());
		
		return isValid;
	}


	@Override
	public String add(Event event) throws EventManagementException {
		String eventID = null;
		if(event!=null && isValidEvent(event)){
			eventID=eventDao.add(event);
		}
		return eventID;
	}

	@Override
	public boolean delete(String eventID) throws EventManagementException {
		boolean isDone=false;
		if(eventID!=null && isValidEventID(eventID)){
			eventDao.delete(event);
			isDone = true;
		} else{
			throw new EventManagementException("eventID should be a capital letter followed by 3 digits");
		}
		return isDone;
	}

	@Override
	public Event get(String eventID) throws EventManagementException {
		return eventDao.get(eventID);
	}

	@Override
	public List<Event> getAll() throws EventManagementException {
		return eventDao.getAll();
	}

	@Override
	public boolean update(Event event) throws EventManagementException {
		boolean isDone = false;
		
		if(event!=null && isValidEvent(event)){
			isDone = eventDao.update(event);
		}
		
		return isDone;
	}


	@Override
	public void persist() throws EventManagementException {
		eventDao.persist();
	}
}