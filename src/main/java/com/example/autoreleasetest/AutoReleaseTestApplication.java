package com.example.autoreleasetest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutoReleaseTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoReleaseTestApplication.class, args);
        System.out.println("hello world");
    }
}
