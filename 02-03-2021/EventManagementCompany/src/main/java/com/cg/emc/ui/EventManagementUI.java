package com.cg.emc.ui;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.cg.emc.exception.EventManagementException;
import com.cg.emc.model.Event;
import com.cg.emc.model.EventManagementAppMenu;
import com.cg.emc.service.EventServiceImpl;
import com.cg.emc.service.IEventService;

public class EventManagementUI {

	private static IEventService eventService;
	private static Scanner scan;
	private static DateTimeFormatter dtFormater;

	public static void main(String[] args) throws EventManagementException {

		eventService = (IEventService) new EventServiceImpl();


		scan = new Scanner(System.in);
		dtFormater = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		EventManagementAppMenu menu = null;

		while (menu != EventManagementAppMenu.QUIT) {

			System.out.println("Choice\tMenu Item");
			System.out.println("===========================");
			for (EventManagementAppMenu m : EventManagementAppMenu.values()) {
				System.out.println(m.ordinal() + "\t" + m.name());
			}
			System.out.print("Choice: ");
			int choice = -1;
			if (scan.hasNextInt())
				choice = scan.nextInt();
			else {
				scan.next();
				System.out.println("Pleae choose a choice displayed");
				continue;
			}

			if (choice < 0 || choice >= EventManagementAppMenu.values().length) {
				System.out.println("Invalid Choice");
			} else {
				menu = EventManagementAppMenu.values()[choice];
				switch (menu) {
				case ADD:
					doAdd();
					break;
				case LIST:
					doList();
					break;
				case SEARCH:
					doSearch();
					break;
				case REMOVE:
					doRemove();
					break;
				case QUIT:
					System.out.println("ThanQ Come Again!");
					break;
				}
			}

		}

		scan.close();
		try {
			eventService.persist();
		} catch (EventManagementException e) {
			e.printStackTrace();
		}

	}

	private static void doAdd() {
		try {
			Event event = new Event();
			System.out.print("EventID : ");
			event.setEventID(scan.next());
			System.out.print("Title: ");
			event.setTitle(scan.next());
			System.out.print("EventDate(dd-MM-yyyy): ");
			String eventDtStr = scan.next();

			try {
				event.setEventDate(LocalDate.parse(eventDtStr, dtFormater));
			} catch (DateTimeException exp) {
				throw new EventManagementException(
						"Date must be in the format day(dd)-month(MM)-year(yyyy)");
			}
			System.out.print("Cost of the Event : ");
			if (scan.hasNextDouble())
				event.setCost(scan.nextDouble());
			else {
				scan.next();
				throw new EventManagementException("Cost is a number");
			}
			System.out.print("Location : ");
			event.setLocation(scan.next());

			String eventID = eventService.add(event);
			System.out.println("Event is Added with eventID : " + eventID);
		} catch (EventManagementException exp) {
			System.out.println(exp.getMessage());
		}
	}

	private static void doList() {
		List<Event> events;
		try {
			events = eventService.getAll();
			if (events.isEmpty()) {
				System.out.println("No events To display");
			} else {
				for (Event b : events)
					System.out.println(b);
			}
		} catch (EventManagementException exp) {
			System.out.println(exp.getMessage());
		}
	}

	private static void doSearch() {
		System.out.print("EventID : ");
		String eventID = scan.next();

		try {
			Event event = eventService.get(eventID);
			if (event != null) {
				System.out.println(event);
			} else {
				System.out.println("No Such Event");
			}
		} catch (EventManagementException exp) {
			System.out.println(exp.getMessage());
		}
	}

	private static void doRemove() {
		System.out.print("EventID : ");
		String eventID = scan.next();
		try {
			boolean isDone = eventService.delete(eventID);
			if (isDone) {
				System.out.println("Event is Deleted");
			} else {
				System.out.println("No Such Event");
			}
		} catch (EventManagementException exp) {
			System.out.println(exp.getMessage());
		}
	}
}