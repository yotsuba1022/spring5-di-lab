package idv.carl.di.lab.spring5dilab.config;

import idv.carl.di.lab.spring5dilab.DummyDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * @author Carl Lu
 */
@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    private final Environment env;

    @Value("${yahoo.user}")
    String user;

    @Value("${yahoo.password}")
    String password;

    @Value("${yahoo.dburl}")
    String dbUrl;

    public PropertyConfig(Environment env) {
        this.env = env;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public DummyDataSource dummyDataSource() {
        DummyDataSource dummyDataSource = new DummyDataSource();
        dummyDataSource.setUser(user);
        dummyDataSource.setPassword(env.getProperty("ENVPASS"));
        dummyDataSource.setDbUrl(dbUrl);

        return dummyDataSource;
    }

}
