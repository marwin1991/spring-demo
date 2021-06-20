package com.codecool.springdemo.springdemo.mapper;

import com.codecool.springdemo.springdemo.dto.TaskDto;
import com.codecool.springdemo.springdemo.model.Task;

public class TaskMapper {

    public static TaskDto map(Task task){
        return new TaskDto(task.getId(), task.getTitle());
    }

}
