package com.hopeman.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/study")
public class StudyController {
    @GetMapping
    public String getById() {
        System.out.println("git is running...");
        return "git is running...";
    }
}
