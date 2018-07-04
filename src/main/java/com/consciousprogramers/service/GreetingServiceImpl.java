package com.consciousprogramers.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String GOOD_MORNING="Good Morning, Welcome  Spring !!!";


    @Override
    public String greetMorning() {
        return GOOD_MORNING;
    }
}
