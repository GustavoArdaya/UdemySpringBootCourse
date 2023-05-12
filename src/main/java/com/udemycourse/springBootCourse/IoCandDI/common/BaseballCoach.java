package com.udemycourse.springBootCourse.IoCandDI.common;

import org.springframework.stereotype.Component;

@Component  //Don't forget to add annotation!
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practice";
    }
}
