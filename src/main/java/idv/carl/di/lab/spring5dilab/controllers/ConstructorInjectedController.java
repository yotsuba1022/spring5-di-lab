package idv.carl.di.lab.spring5dilab.controllers;

import idv.carl.di.lab.spring5dilab.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author Carl Lu
 * <p>
 */
@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    /*
     * After about Spring 4.2, it enabled automatic wiring of constructor based components.
     * So you don't need to explicitly add @Autowired annotation on the constructor anymore.
     * */
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greeting() {
        return greetingService.greeting();
    }
}
