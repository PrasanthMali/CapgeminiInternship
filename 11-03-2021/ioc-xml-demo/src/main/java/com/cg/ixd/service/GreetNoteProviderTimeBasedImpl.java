package com.cg.ixd.service;

import java.time.LocalTime;

public class GreetNoteProviderTimeBasedImpl implements IGreetNoteProvider {
	
	@Override
	public String getGreetNote() {
		String greetNote= "";
		
		int h = LocalTime.now().getHour();
		
		if (h>=4 && h<=11) {
			greetNote="Good Morning";
		}
		else if (h>=12 && h<=16) {
			greetNote="Good Afternon";
		}
		else {
			greetNote = "Good Evening";
		}
		return greetNote;
	}

}
