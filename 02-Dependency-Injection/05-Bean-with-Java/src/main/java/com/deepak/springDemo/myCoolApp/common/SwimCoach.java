package com.deepak.springDemo.myCoolApp.common;

import org.springframework.stereotype.Component;


public class SwimCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Swim for 20 minutes on your back";
    }
}

