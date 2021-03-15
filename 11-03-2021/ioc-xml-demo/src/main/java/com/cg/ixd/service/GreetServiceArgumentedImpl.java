package com.cg.ixd.service;

public class GreetServiceArgumentedImpl implements IGreetService {
	
	private String greetNote;
	
	public GreetServiceArgumentedImpl() {
		//default constructor
	}

	public GreetServiceArgumentedImpl(String greetNote) {
		super();
		this.greetNote = greetNote;
	}

	public String getGreetNote() {
		return greetNote;
	}

	public void setGreetNote(String greetNote) {
		this.greetNote = greetNote;
	}

	@Override
	public String getGreeting(String userName) {
		return greetNote + " " + userName;
	}
	
}