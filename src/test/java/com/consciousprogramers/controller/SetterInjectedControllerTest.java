package com.consciousprogramers.controller;

import com.consciousprogramers.service.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {


    private SetterInjectedController setterInjectedController;

    @Before
    public void runBefore(){
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {

        assertEquals(GreetingServiceImpl.GOOD_MORNING, setterInjectedController.greet());
    }
}
