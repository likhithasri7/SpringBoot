package com.ankitrj3.roggers.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController

public class HelloController {
    @GetMapping("/")
    public String hello(HttpServletRequest request) {
        return "Hello Roggers "+request.getSession().getId();
    }
}
