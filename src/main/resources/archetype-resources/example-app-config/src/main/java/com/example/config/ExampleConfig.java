package com.example.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example")
public class ExampleConfig {

    public static void main(String[] args) {
        SpringApplication.run(ExampleConfig.class, args);
    }
}