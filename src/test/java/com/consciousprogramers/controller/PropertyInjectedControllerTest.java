package com.consciousprogramers.controller;

import com.consciousprogramers.service.GreetingService;
import com.consciousprogramers.service.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class PropertyInjectedControllerTest {


    private PropertyInjectedController propertyInjectedController;

    @Before
    public void runBefore(){
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingSerivce = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.GOOD_MORNING,propertyInjectedController.greet());
    }
}
