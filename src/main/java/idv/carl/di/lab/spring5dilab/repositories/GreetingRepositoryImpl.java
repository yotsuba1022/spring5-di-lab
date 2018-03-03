package idv.carl.di.lab.spring5dilab.repositories;

import org.springframework.stereotype.Component;

/**
 * @author Carl Lu
 */
@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    private static final String ENGLISH_GREETING = "Hello!";
    private static final String SPANISH_GREETING = "Que Paso Despacito!";
    private static final String CHINESE_GREETING = "安安你好!";

    @Override
    public String getEnglishGreeting() {
        return ENGLISH_GREETING;
    }

    @Override
    public String getSpanishGreeting() {
        return SPANISH_GREETING;
    }

    @Override
    public String getChineseGreeting() {
        return CHINESE_GREETING;
    }

}
