package com.cg.iad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("gsa")
public class GreetServiceAdvancedImpl implements IGreetService {
	
	@Autowired
	@Qualifier("gnps")
	private IGreetNoteProvider greetNoteProvider;
	public String getGreeting (String userName) {
		return greetNoteProvider.getGreetNote() + " "+ userName;
	}
}