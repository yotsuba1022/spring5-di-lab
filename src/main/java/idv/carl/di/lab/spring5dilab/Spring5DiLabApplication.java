package idv.carl.di.lab.spring5dilab;

import idv.carl.di.lab.spring5dilab.controllers.ConstructorInjectedController;
import idv.carl.di.lab.spring5dilab.controllers.FakeController;
import idv.carl.di.lab.spring5dilab.controllers.PropertyInjectedController;
import idv.carl.di.lab.spring5dilab.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5DiLabApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Spring5DiLabApplication.class, args);

        System.out.println(applicationContext.getBean(FakeController.class).greeting());
        System.out.println(applicationContext.getBean(PropertyInjectedController.class).greeting());
        System.out.println(applicationContext.getBean(SetterInjectedController.class).greeting());
        System.out.println(applicationContext.getBean(ConstructorInjectedController.class).greeting());
    }
}
