package com.deepak.springDemo.myCoolApp.common;

import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practise drag Sweep";
    }
}

