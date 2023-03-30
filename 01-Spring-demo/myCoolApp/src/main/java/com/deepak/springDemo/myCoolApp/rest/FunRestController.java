package com.deepak.springDemo.myCoolApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;




    // expose "/" that return "Hello world"
    @GetMapping("/")
    public String sayHello() {
        return this.coachName;
    }
    @GetMapping("exit")
    public String sayExit() {
        return "See You again";
    }
}
