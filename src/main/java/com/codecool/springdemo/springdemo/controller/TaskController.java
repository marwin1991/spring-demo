package com.codecool.springdemo.springdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @GetMapping("/ping")
    public String ping(){
        return "ping";
    }

}
