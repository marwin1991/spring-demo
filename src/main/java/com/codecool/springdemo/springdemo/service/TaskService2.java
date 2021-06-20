package com.codecool.springdemo.springdemo.service;

import org.springframework.stereotype.Service;

// Żeby kalsa była zarządzana przez springa, trzeba dodać adnotacje:
// @Component, @Repository, @Service, @RestController (@Controller)
@Service
public class TaskService2 implements TextProvider {

    @Override
    public String getText(){
        return "asfsb22";
    }

}
