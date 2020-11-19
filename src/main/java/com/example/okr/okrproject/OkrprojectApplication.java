package com.example.okr.okrproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class OkrprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(OkrprojectApplication.class, args);
    }

}
