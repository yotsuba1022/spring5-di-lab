package idv.carl.di.lab.spring5dilab.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author Carl Lu
 */
@Controller
public class FakeController {

    public String greeting() {
        System.out.println("Greeting.");
        return "greeting.";
    }

}
