package idv.carl.di.lab.spring5dilab.services;

import idv.carl.di.lab.spring5dilab.repositories.GreetingRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Carl Lu
 */
@Service
@Profile("en")
@Primary
public class PrimaryGreetingService implements GreetingService {

    private final GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String greeting() {
        return greetingRepository.getEnglishGreeting();
    }

}
