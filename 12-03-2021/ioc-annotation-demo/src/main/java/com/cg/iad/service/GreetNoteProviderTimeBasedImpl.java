package com.cg.iad.service;

import java.time.LocalTime;

import org.springframework.stereotype.Component;
@Component("gnpt")
public class GreetNoteProviderTimeBasedImpl implements IGreetNoteProvider {
	@Override
	public String getGreetNote() {
		String greetNote="";
		int h = LocalTime.now().getHour();
		if(h>=4 && h<=11) {
			greetNote="Good Morning";
		}else if(h>=12 && h<=16) {
			greetNote="Good noon";
		}
		else {
			greetNote="Good Evening";
		}
		return greetNote;
	}

}