package com.rkaaya.cat.presentation.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hero")
public class HeroesController {

    @Value("${test.name:not working}")
    private String testName;

    @GetMapping("/test")
    public String findById() {
        return testName;
    }
}
