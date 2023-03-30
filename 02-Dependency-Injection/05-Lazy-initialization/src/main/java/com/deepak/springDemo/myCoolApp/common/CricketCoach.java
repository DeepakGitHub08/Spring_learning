package com.deepak.springDemo.myCoolApp.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practise Fast Bowling for 25 minutes";
    }
}

