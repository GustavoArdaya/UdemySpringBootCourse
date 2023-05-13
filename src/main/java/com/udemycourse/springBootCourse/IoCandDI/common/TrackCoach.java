package com.udemycourse.springBootCourse.IoCandDI.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // This sets this class as the primary to be injected into controller constructor
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }
}
