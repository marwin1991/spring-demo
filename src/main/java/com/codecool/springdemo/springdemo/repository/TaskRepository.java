package com.codecool.springdemo.springdemo.repository;

import com.codecool.springdemo.springdemo.model.Task;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class TaskRepository {

    private static Map<Long, Task> tasks = new HashMap<>();

    static {
        tasks.put(1L, new Task(1L, "Title1"));
        tasks.put(2L, new Task(2L, "Title2"));
    }

    public List<Task> getAll(){
        return new ArrayList<>(tasks.values());
    }
}
