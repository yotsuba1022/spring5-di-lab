package idv.carl.di.lab.spring5dilab.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Carl Lu
 */
@Service
@Primary
@Profile({"tw", "default"})
public class PrimaryChineseGreetingService implements GreetingService {

    public static final String DEFAULT_GREETING = "安安你好 from PrimaryChineseGreetingService!!!";

    @Override
    public String greeting() {
        return DEFAULT_GREETING;
    }

}
