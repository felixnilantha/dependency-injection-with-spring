package com.consciousprogramers.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    @Override
    public String greetMorning() {
        return "Injected - through setter";
    }
}

