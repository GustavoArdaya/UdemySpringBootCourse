package com.udemycourse.springBootCourse.IoCandDI.rest;

import com.udemycourse.springBootCourse.IoCandDI.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
    private Coach anotherCoach;

// Example of constructor injection:
    @Autowired  // Tells Spring to inject a dependency. Annotation is optional if you only have one constructor
    public DemoController(
            @Qualifier("baseballCoach") Coach theCoach,
            @Qualifier("baseballCoach") Coach theAnotherCoach ) { // with @Qualifier annotation I specify which coach to use
        myCoach = theCoach;                                             // note that the name is same as class, but beginning with lower case
        anotherCoach = theAnotherCoach;
    }                                                                   // You can skip this by @Primary annotation in classes. Qualifier has higher priority

    // Setter injection: // uses setMethod instead of constructor
//    @Autowired // even though its a setter (it could have any name) autowired allows program to use method automatically
//    public void setCoach(Coach theCoach) {
//        myCoach = theCoach;
//    }

    // java reflection allows field injection without setters or constructors. It's Legacy code (no longer used).

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/checkscope")
    public String checkScope() {
        return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach) + " \nIf singleton, it will return true. If not, it's creating new instances of the class (Prototype)";
    }
}
