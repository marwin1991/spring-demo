package com.codecool.springdemo.springdemo.mapper;

import com.codecool.springdemo.springdemo.dto.TaskDto;
import com.codecool.springdemo.springdemo.model.Task;
import org.springframework.stereotype.Component;

@Component
public class TaskMapper {

    public TaskDto map(Task task){
        return new TaskDto(task.getId(), task.getTitle());
    }

    public Task map(TaskDto taskDto) {
        return new Task(taskDto.getId(), taskDto.getTitle());
    }
}
