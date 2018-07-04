package com.consciousprogramers.controller;

import com.consciousprogramers.service.GreetingService;
import com.consciousprogramers.service.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {


    private ConstructorInjectedController constructorInjectedController;


    @Before
    public void runBefore(){
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl() );

    }

    @Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.GOOD_MORNING,constructorInjectedController.greet());
    }

}
