package idv.carl.di.lab.spring5dilab.controllers;

import external.component.FooComponent;
import idv.carl.di.lab.spring5dilab.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @author Carl Lu
 */
@Controller
public class FakeController {

    private final GreetingService greetingService;
    private final FooComponent fooComponent;

    public FakeController(GreetingService greetingService, FooComponent fooComponent) {
        this.greetingService = greetingService;
        this.fooComponent = fooComponent;
    }

    public void foo() {
        fooComponent.greetingFoo();
    }

    public String greeting() {
        return greetingService.greeting();
    }

}
