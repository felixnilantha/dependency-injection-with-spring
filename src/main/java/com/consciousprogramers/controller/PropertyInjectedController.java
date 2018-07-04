package com.consciousprogramers.controller;

import com.consciousprogramers.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PropertyInjectedController {


    @Autowired
    public GreetingService greetingSerivce;

    public String greet() {
        return greetingSerivce.greetMorning();
    }

}
