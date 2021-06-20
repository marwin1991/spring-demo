package com.codecool.springdemo.springdemo.controller;

import com.codecool.springdemo.springdemo.dto.TaskDto;
import com.codecool.springdemo.springdemo.service.TasksActions;
import com.codecool.springdemo.springdemo.service.TextProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //scope
public class TaskController {

    private final TextProvider textProvider;
    private final TasksActions tasksActions;

    @Autowired
    public TaskController(@Qualifier("taskService") TextProvider textProvider, TasksActions tasksActions) {
        this.textProvider = textProvider;
        this.tasksActions = tasksActions;
    }


    @GetMapping("/ping")
    public String ping(){
        return "ping" + textProvider.getText(); //pingasfsb
    }

    // Tasks Rest API
    @GetMapping("/tasks")
    public List<TaskDto> getTasks(){
        return tasksActions.getAll();
    }

    @GetMapping("/tasks/{id}")
    public TaskDto getTask(@PathVariable Long id){
        return tasksActions.get(id);
    }

    @PostMapping("/tasks")
    public TaskDto createTask(@RequestBody TaskDto taskDto){
        return tasksActions.create(taskDto);
    }

    @PatchMapping("/tasks/{id}")
    public TaskDto updateTask(@PathVariable Long id, @RequestBody TaskDto taskDto){
        return tasksActions.update(id, taskDto);
    }

    @DeleteMapping("/tasks/{id}")
    public void deleteTask(@PathVariable Long id){
        tasksActions.delete(id);
    }

}
