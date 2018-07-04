package com.consciousprogramers.controller;

import com.consciousprogramers.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PropertyInjectedController {


    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingSerivce;

    public String greet() {
        return greetingSerivce.greetMorning();
    }

}
