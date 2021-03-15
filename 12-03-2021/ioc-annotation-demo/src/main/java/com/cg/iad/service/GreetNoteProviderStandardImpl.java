package com.cg.iad.service;

import org.springframework.stereotype.Component;

@Component("gnps")
public class GreetNoteProviderStandardImpl implements IGreetNoteProvider {
	
	public String getGreetNote() {
		return "Hello! Welcome";
	}
}