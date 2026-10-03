package com.kavya.tasktracker.service;

import org.springframework.stereotype.Service;

import com.kavya.tasktracker.repository.TaskRepository;

@Service 
public class TaskService {
    private final TaskRepository taskRepo; 

    public TaskService(TaskRepository taskRepo)
    {
        this.taskRepo = taskRepo;
    }
}
