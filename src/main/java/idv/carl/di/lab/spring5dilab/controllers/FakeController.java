package idv.carl.di.lab.spring5dilab.controllers;

import idv.carl.di.lab.spring5dilab.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @author Carl Lu
 */
@Controller
public class FakeController {

    private GreetingService greetingService;

    public FakeController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greeting() {
        return greetingService.greeting();
    }

}
