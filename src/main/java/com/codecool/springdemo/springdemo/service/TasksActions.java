package com.codecool.springdemo.springdemo.service;

import com.codecool.springdemo.springdemo.dto.TaskDto;

import java.util.List;

public interface TasksActions {
    List<TaskDto> getAll();
    TaskDto get(Long id);
    TaskDto create(TaskDto taskDto);
    TaskDto update(Long id, TaskDto taskDto);
    void delete(Long id);
}
