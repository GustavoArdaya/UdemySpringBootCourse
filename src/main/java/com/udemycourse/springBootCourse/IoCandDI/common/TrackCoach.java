package com.udemycourse.springBootCourse.IoCandDI.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // This sets this class as the first choice to be injected into controller constructor
public class TrackCoach implements Coach{

    public TrackCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName()); // Will display name of class in console if injected
    }
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }
}
