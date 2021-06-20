package com.codecool.springdemo.springdemo.controller;

import com.codecool.springdemo.springdemo.service.TextProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController //scope
public class TaskController {

    private final TextProvider textProvider;

    @Autowired
    public TaskController(@Qualifier("taskService") TextProvider textProvider) {
        this.textProvider = textProvider;
    }


    @GetMapping("/ping")
    public String ping(){
        return "ping" + textProvider.getText(); //pingasfsb
    }

    // Tasks Rest API

    @GetMapping("/tasks")
    public String getTasks(){
        return "t";
    }

    @GetMapping("/tasks/{id}")
    public String getTask(@PathVariable Long id){
        return "t";
    }

    @PostMapping("/tasks")
    public String createTask(){
        return "t";
    }

    @PatchMapping("/tasks/{id}")
    public String updateTask(@PathVariable Long id){
        return "t";
    }

    @DeleteMapping("/tasks/{id}")
    public void deleteTask(@PathVariable Long id){

    }

}
