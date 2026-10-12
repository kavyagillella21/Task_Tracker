package com.kavya.tasktracker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kavya.tasktracker.model.Task;
import com.kavya.tasktracker.service.TaskService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController 
@RequestMapping("/api/tasks") 
public class TaskController {
    private final TaskService taskService;
    
    TaskController(TaskService taskService)
    {
        this.taskService = taskService;
    }
    
     @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }
}
