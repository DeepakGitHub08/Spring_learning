package com.deepak.springDemo.myCoolApp.rest;

import com.deepak.springDemo.myCoolApp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoCoachController {
    private Coach myCoach;

//   @Autowired
//   public void setMyCoach(Coach myCoach){
//       this.myCoach = myCoach;
//   }

   @Autowired
   public void doSomeStuff(Coach theCoach){
       myCoach = theCoach;
   }

    @GetMapping("/getDW")
    public String getWorkout(){
        return this.myCoach.getDailyWorkout();
    }
}
