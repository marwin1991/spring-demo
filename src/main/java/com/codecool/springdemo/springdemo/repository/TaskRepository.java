package com.codecool.springdemo.springdemo.repository;

import com.codecool.springdemo.springdemo.model.Task;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class TaskRepository {

    private static final Map<Long, Task> tasks = new HashMap<>();

    static {
        tasks.put(1L, new Task(1L, "Title1"));
        tasks.put(2L, new Task(2L, "Title2"));
    }

    public List<Task> getAll(){
        return new ArrayList<>(tasks.values());
    }

    public Optional<Task> get(Long id){
        return Optional.ofNullable(tasks.get(id));
    }

    public Task save(Task task){
        Long newId = (long) tasks.size()2
        task.setId(newId);
        tasks.put(newId, task);
        return task;
    }
}
