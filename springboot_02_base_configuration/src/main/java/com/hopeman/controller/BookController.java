package com.hopeman.controller;

import com.hopeman.MyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Rest模式
@RestController
@RequestMapping("/books")
public class BookController {

    @Value("${tempdir}")
    private String country1;

    @Autowired
    private Environment env;

    @Autowired
    private MyDataSource myDataSource;

    @GetMapping
    public String getById(){
        System.out.println("springboot2 is running...");
        System.out.println("country1===>"+country1);
        System.out.println(env.getProperty("tempdir2"));
        System.out.println("datasource"+myDataSource);
        return "springboot2 is running...";
    }
}
