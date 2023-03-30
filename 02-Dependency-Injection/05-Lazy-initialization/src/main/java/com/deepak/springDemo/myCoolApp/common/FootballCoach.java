package com.deepak.springDemo.myCoolApp.common;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice Free Kick for 10 minutes";
    }
}
