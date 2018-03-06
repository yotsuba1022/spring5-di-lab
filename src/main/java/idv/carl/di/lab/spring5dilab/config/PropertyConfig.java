package idv.carl.di.lab.spring5dilab.config;

import idv.carl.di.lab.spring5dilab.DummyDataSource;
import idv.carl.di.lab.spring5dilab.DummyJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * @author Carl Lu
 */
@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
@PropertySources({@PropertySource("classpath:datasource.properties"), @PropertySource("classpath:jms.properties")})
public class PropertyConfig {

    private final Environment env;

    @Value("${yahoo.user}")
    String user;

    @Value("${yahoo.password}")
    String password;

    @Value("${yahoo.dburl}")
    String dbUrl;

    @Value("${yahoo.jms.username}")
    String jmsUserName;

    @Value("${yahoo.jms.password}")
    String jmsPassword;

    @Value("${yahoo.jms.url}")
    String jmsUrl;

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

    @Bean
    public DummyJmsBroker dummyJmsBroker() {
        DummyJmsBroker dummyJmsBroker = new DummyJmsBroker();
        dummyJmsBroker.setUserName(jmsUserName);
        dummyJmsBroker.setPassword(jmsPassword);
        dummyJmsBroker.setUrl(jmsUrl);

        return dummyJmsBroker;
    }

}
