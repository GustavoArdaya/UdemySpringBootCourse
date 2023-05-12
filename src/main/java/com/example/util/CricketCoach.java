package com.example.util;

import org.springframework.stereotype.Component;

@Component // this annotation marks the class as a Spring Bean for dependency injection
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
