package idv.carl.di.lab.spring5dilab;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Carl Lu
 */
@Component
public class LifeCycleDemoBean
        implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("*** Constructor of " + this.getClass());
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("*** BeanFactory has been set: " + beanFactory.getClass());
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("*** Set bean name: " + name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("*** Destroy bean.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("*** After properties set.");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("*** Set application context: " + applicationContext.getClass());
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("*** Post construct method.");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("*** Pre-destroy method.");
    }

    public void beforeInit() {
        System.out.println("*** Before init.");
    }

    public void afterInit() {
        System.out.println("*** After init.");
    }

}
