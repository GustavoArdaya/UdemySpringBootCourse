package com.crudDemoApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

public class CrudDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(String[] args) { // This is executed after the Spring Beans have been loaded
        return runner -> { // (Lambda expression
            System.out.println("Hello World!");
        };
    }
}
