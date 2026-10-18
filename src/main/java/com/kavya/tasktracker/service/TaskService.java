package com.kavya.tasktracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kavya.tasktracker.exception.InvalidTaskException;
import com.kavya.tasktracker.exception.TaskNotFoundException;
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
            throw new InvalidTaskException();
        }
        return taskRepo.save(task);
    }

    public Task getTaskById(Long id)
    {
        return taskRepo.findById(id)
            .orElseThrow(()-> new TaskNotFoundException(id));
    }

    public void deleteTaskById(Long id)
    {
        getTaskById(id);
        taskRepo.deleteById(id);
    }

    public Task editTask(Long id, Task newTask)
    {
        Task oldTask = getTaskById(id);
        oldTask.setName(newTask.getName());
        oldTask.setDescription(newTask.getDescription());
        if(newTask.getStatus() != null)
        {
            oldTask.setStatus(newTask.getStatus());
        }
        return saveTask(oldTask);
    }
}
