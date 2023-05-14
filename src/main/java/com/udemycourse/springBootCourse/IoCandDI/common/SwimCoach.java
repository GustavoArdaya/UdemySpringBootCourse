package com.udemycourse.springBootCourse.IoCandDI.common;

//not using @Component!
public class SwimCoach implements Coach{

    public SwimCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName()); // Will display name of class in console if injected
    }
    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meteres as a warm up";
    }
}
