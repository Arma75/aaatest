package com.koyeb.examplespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ExampleSpringBootApplication {
    public static void main(String[] args) {
      SpringApplication.run(ExampleSpringBootApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
      return String.format("Hello world!");
    }

    @GetMapping("/jea")
    public String jea() {
      return "오채아";
    }

    @GetMapping("/kevin")
    public String kevin() {
      return "최다빈";
    }
}
