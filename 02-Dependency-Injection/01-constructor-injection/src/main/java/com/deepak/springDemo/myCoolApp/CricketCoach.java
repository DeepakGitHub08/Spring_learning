package com.deepak.springDemo.myCoolApp;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practise Fast Bowling for 15 minutes";
    }
}

