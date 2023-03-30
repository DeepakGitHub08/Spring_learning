package com.deepak.springDemo.myCoolApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoCoachController {
    private Coach myCoach;

    @Autowired
    public DemoCoachController(Coach myCoach){
        this.myCoach = myCoach;
    }

    @GetMapping("/getDW")
    public String getWorkout(){
        return this.myCoach.getDailyWorkout();
    }
}
