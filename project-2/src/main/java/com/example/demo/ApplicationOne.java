package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ApplicationOne {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationOne.class, args);
    }

    @PostConstruct
    public void init() {
        System.out.println(Constants.SOURCE);
    }
}
