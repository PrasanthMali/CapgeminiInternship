package com.cg.emc.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import com.cg.emc.excep.EventManagementException;
import com.cg.emc.model.Event;

public class EventDAOIOStreamImpl implements IEventDAO {
	public static final String DATA_STORE_FILE_NAME = "Event.dat";

	private Map<String, Event> events;

	@SuppressWarnings("unchecked")
	public EventDAOIOStreamImpl() throws EventManagementException {
		File file = new File(DATA_STORE_FILE_NAME);

		if (!file.exists()) {
			events = new TreeMap<>();
		} else {
			try (ObjectInputStream fin = new ObjectInputStream(
					new FileInputStream(DATA_STORE_FILE_NAME))) {

				Object obj = fin.readObject();

				if (obj instanceof Map) {
					events = (Map<String, Event>) obj;
				} else {
					throw new EventManagementException("Not a valid DataStore");
				}
			} catch (IOException | ClassNotFoundException exp) {
				throw new EventManagementException("Loading Data Failed");
			}
		}
	}

	@Override
	public String add(Event event) throws EventManagementException {
		String id = null;
		if (event != null) {
			id = event.getEventID();
			events.put(id, event);
		}
		return id;
	}

	@Override
	public boolean delete(String id) throws EventManagementException {
		boolean isDone = false;
		if (id != null) {
			events.remove(id);
			isDone = true;
		}
		return isDone;
	}

	@Override
	public Event get(String id) throws EventManagementException {
		return events.get(id);
	}

	@Override
	public List<Event> getAll() throws EventManagementException {
		return new ArrayList<Event>(events.values());
	}

	@Override
	public boolean update(Event event) throws EventManagementException {
		boolean isDone = false;
		if (event != null) {
			String id = event.getEventID();
			events.replace(id, event);
		}
		return isDone;
	}

	@Override
	public void persist() throws EventManagementException {
		try (ObjectOutputStream fout = new ObjectOutputStream(
				new FileOutputStream(DATA_STORE_FILE_NAME))) {
			fout.writeObject(events);
		} catch (IOException exp) {
			throw new EventManagementException("Saving Data Failed" + exp.getMessage());
		}
	}
	}