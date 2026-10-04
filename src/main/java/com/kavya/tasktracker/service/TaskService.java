package com.kavya.tasktracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kavya.tasktracker.model.Task;
import com.kavya.tasktracker.repository.TaskRepository;

@Service 
public class TaskService {
    private final TaskRepository taskRepo; 

    public TaskService(TaskRepository taskRepo)
    {
        this.taskRepo = taskRepo;
    }

    public List<Task> getAllTasks()
    {
        return taskRepo.findAll();
    }

    public Task saveTask(Task task)
    {
        if(task.getName() == null || task.getName().isBlank()) 
        {
            throw new IllegalArgumentException("Enter a Name for task");
        }
        return taskRepo.save(task);
    }
}
