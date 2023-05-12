package com.udemycourse.springBootCourse.IoCandDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    @Autowired  // Tells Spring to inject a dependency. Annotation is optional if you only have one constructor
    public DemoController(Coach theCoach) {
        myCoach = theCoach;
    }
}