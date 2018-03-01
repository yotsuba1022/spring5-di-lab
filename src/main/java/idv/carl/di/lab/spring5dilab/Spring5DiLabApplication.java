package idv.carl.di.lab.spring5dilab;

import idv.carl.di.lab.spring5dilab.controllers.FakeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5DiLabApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Spring5DiLabApplication.class, args);
        FakeController fakeController = (FakeController) applicationContext.getBean("fakeController");
        fakeController.greeting();
    }
}
