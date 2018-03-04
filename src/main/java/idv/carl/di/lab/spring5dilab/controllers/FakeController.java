package idv.carl.di.lab.spring5dilab.controllers;

import external.component.BarComponent;
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
    private final BarComponent barComponent;

    public FakeController(GreetingService greetingService, FooComponent fooComponent, BarComponent barComponent) {
        this.greetingService = greetingService;
        this.fooComponent = fooComponent;
        this.barComponent = barComponent;
    }

    public void foo() {
        fooComponent.greetingFoo();
    }

    public void bar() {
        barComponent.greetingBar();
    }

    public String greeting() {
        return greetingService.greeting();
    }

}
