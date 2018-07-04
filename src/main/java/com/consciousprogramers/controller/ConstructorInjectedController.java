package com.consciousprogramers.controller;

import com.consciousprogramers.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectedController {

    @Autowired
    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greet(){
        return greetingService.greetMorning();
    }
}
