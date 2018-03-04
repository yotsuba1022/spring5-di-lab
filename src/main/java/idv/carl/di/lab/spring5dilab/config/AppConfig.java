package idv.carl.di.lab.spring5dilab.config;

import external.component.FooComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Carl Lu
 */
@Configuration
public class AppConfig {

    @Bean
    public FooComponent fooComponent() {
        System.out.println("Create FooComponent instance with configuration.");
        return new FooComponent();
    }

}
