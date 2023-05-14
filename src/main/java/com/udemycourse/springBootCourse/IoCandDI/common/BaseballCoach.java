package com.udemycourse.springBootCourse.IoCandDI.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component  //Don't forget to add annotation!
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) //"Prototype" will create new instances each time the bean is injected
public class BaseballCoach implements Coach{

    public BaseballCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName()); // Will display name of class in console if injected
    }

    // init method
    @PostConstruct
    public void atStartup() {
        System.out.println("This code executes during " + getClass().getSimpleName() + " initialization");
    }

    @PreDestroy // will not be called if scope is set to prototype!
    public void atDestroy() {
        System.out.println("This code executes during " + getClass().getSimpleName() + " destruction");
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practice";
    }
}
