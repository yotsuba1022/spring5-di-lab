package idv.carl.di.lab.spring5dilab.controllers;

import idv.carl.di.lab.spring5dilab.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Carl Lu
 */
public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.DEFAULT_GREETING, propertyInjectedController.greeting());
    }

}
