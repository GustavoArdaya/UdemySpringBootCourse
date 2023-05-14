package com.udemycourse.springBootCourse.IoCandDI.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy // will only initialize class if needed. Prototype beans are lazy by default
public class TennisCoach implements Coach{

    public TennisCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName()); // Will display name of class in console if injected
    }
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
