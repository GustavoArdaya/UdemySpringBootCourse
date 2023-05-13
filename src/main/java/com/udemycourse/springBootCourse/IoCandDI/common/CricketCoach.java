package com.udemycourse.springBootCourse.IoCandDI.common;

import org.springframework.stereotype.Component;

@Component // this annotation marks the class as a Spring Bean for dependency injection
public class CricketCoach implements Coach {

    public CricketCoach () {
        System.out.println("In constructor: " + getClass().getSimpleName()); // Will display name of class in console if injected
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
