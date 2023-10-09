package com.hopeman.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/study")
public class StudyController {
    @GetMapping
    public String getById() {
        String name = "张志立";
        int a = 1;
        System.out.println(name);
        System.out.println(a);
        System.out.println("git is running...");
        return "git is running...";
    }
}
