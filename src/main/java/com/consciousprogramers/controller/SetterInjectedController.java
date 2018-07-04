package com.consciousprogramers.controller;

import com.consciousprogramers.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterInjectedController {



    @Autowired
    private GreetingService greetingService;


    public String greet(){
        return greetingService.greetMorning();
    }


    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
