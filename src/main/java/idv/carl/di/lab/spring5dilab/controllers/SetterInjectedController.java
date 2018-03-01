package idv.carl.di.lab.spring5dilab.controllers;

import idv.carl.di.lab.spring5dilab.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @author Carl Lu
 */
@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    public String greeting() {
        return greetingService.greeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

}
