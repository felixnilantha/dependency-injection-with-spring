package com.consciousprogramers.controller;


import com.consciousprogramers.service.GreetingService;
import com.consciousprogramers.service.PrimaryGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {


    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String primaryGreet(){


        return  greetingService.greetMorning();
    }


}
