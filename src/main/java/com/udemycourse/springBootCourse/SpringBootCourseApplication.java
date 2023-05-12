package com.udemycourse.springBootCourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCourseApplication.class, args);
	}

}


// This should follow @SpringBootApplication in parentheses to specify dependencies location :
/*(
		scanBasePackages = {	"com.example.util",
		"com.udemycourse.springBootCourse.IoCandDI"}
		)*/