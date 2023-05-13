package com.udemycourse.springBootCourse.IoCandDI.common;

import org.springframework.stereotype.Component;

@Component  //Don't forget to add annotation!
public class BaseballCoach implements Coach{

    public BaseballCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName()); // Will display name of class in console if injected
    }
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practice";
    }
}
