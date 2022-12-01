package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@Slf4j
@SpringBootApplication
public class ApplicationTwo {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationTwo.class, args);
    }

    @PostConstruct
    public void init() {
        log.info("SOURCE:: {}", Constants.SOURCE);
    }
}
