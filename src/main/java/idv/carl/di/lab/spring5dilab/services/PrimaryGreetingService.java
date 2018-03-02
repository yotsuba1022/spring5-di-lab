package idv.carl.di.lab.spring5dilab.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author Carl Lu
 */
@Service
@Primary
public class PrimaryGreetingService implements GreetingService {

    public static final String DEFAULT_GREETING = "Que Pa So from PrimaryGreetingService!!!";

    @Override
    public String greeting() {
        return DEFAULT_GREETING;
    }

}
