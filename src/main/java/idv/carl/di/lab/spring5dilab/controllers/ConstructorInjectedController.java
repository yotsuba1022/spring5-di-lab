package idv.carl.di.lab.spring5dilab.controllers;

import idv.carl.di.lab.spring5dilab.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @author Carl Lu
 */
@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greeting() {
        return greetingService.greeting();
    }
}
