package com.example.__k8s_githubaction_practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello from EC2! \uD83D\uDE80";
    }
    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
