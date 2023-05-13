package com.udemycourse.springBootCourse.IoCandDI.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    public TennisCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName()); // Will display name of class in console if injected
    }
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
