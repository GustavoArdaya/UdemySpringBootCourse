package com.udemycourse.springBootCourse.IoCandDI.rest;

import com.udemycourse.springBootCourse.IoCandDI.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

// Will comment following code to practice setter injection:
//    @Autowired  // Tells Spring to inject a dependency. Annotation is optional if you only have one constructor
//    public DemoController(Coach theCoach) {
//        myCoach = theCoach;
//    }

    // Setter injection: // uses setMethod instead of constructor
    @Autowired // even though its a setter (it could have any name) autowired allows program to use method
    public void setCoach(Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
