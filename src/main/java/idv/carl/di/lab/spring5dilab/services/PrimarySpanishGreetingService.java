package idv.carl.di.lab.spring5dilab.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Carl Lu
 */
@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingService implements GreetingService {

    public static final String DEFAULT_GREETING = "Que Paso Despacito from PrimarySpanishGreetingService!!!";

    @Override
    public String greeting() {
        return DEFAULT_GREETING;
    }

}
