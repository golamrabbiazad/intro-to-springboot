package com.vscode.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class IntroToSpringbootApplication {

    @GetMapping
    public List<String> hello() {
        return List.of("Hello", "world");
    }

    public static void main(String[] args) {
        SpringApplication.run(IntroToSpringbootApplication.class, args);
    }

}
