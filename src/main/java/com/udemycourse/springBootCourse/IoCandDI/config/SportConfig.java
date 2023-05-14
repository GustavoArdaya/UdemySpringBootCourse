package com.udemycourse.springBootCourse.IoCandDI.config;

import com.udemycourse.springBootCourse.IoCandDI.common.Coach;
import com.udemycourse.springBootCourse.IoCandDI.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean // this could allow third party apps to be injected into app. Returns class as bean.
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
