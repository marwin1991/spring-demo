package com.codecool.springdemo.springdemo.service;

import com.codecool.springdemo.springdemo.dto.TaskDto;
import com.codecool.springdemo.springdemo.mapper.TaskMapper;
import com.codecool.springdemo.springdemo.model.Task;
import com.codecool.springdemo.springdemo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

// Żeby kalsa była zarządzana przez springa, trzeba dodać adnotacje:
// @Component, @Repository, @Service, @RestController (@Controller)
@Service
public class TaskService implements TextProvider, TasksActions {

    private final TaskRepository taskRepository;
    private final TaskMapper taskMapper;

    @Autowired
    public TaskService(TaskRepository taskRepository, TaskMapper taskMapper) {
        this.taskRepository = taskRepository;
        this.taskMapper = taskMapper;
    }

    @Override
    public String getText(){
        return "asfsb";
    }

    @Override
    public List<TaskDto> getAll() {
        return taskRepository.getAll().stream().map(taskMapper::map).collect(Collectors.toList());
    }

    @Override
    public TaskDto get(Long id) {
        return taskMapper.map(taskRepository.get(id).orElseThrow());
    }

    @Override
    public TaskDto create(TaskDto taskDto) {
        Task taskToSave = taskMapper.map(taskDto);
        Task savedTask = taskRepository.save(taskToSave);
        return taskMapper.map(savedTask);
    }

    @Override
    public TaskDto update(Long id, TaskDto taskDto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
