package com.cg.sbwd.service;

 

import java.time.LocalTime;

 

import org.springframework.stereotype.Service;

 

@Service
public class GreetServiceTimeBasedImpl implements IGreetService {

 

    @Override
    public String getGreeting() {
        String greeting = null;
        int hour = LocalTime.now().getHour();
        if (hour >=4 && hour < 12)
            greeting = "Good Morning";
        else if (hour >= 12 && hour <= 16)
            greeting = "Good Afternoon";
        else
            greeting = "Good Evening";
        return greeting;
    }

 

}