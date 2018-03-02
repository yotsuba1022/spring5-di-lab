package idv.carl.di.lab.spring5dilab.services;

import org.springframework.stereotype.Service;

/**
 * @author Carl Lu
 */
@Service
public class SetterGreetingService implements GreetingService {

    public static final String DEFAULT_GREETING = "Que Pa So from SetterGreetingService!!!";

    @Override
    public String greeting() {
        return DEFAULT_GREETING;
    }

}
