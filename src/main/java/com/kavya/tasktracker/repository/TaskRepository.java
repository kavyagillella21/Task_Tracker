package com.kavya.tasktracker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kavya.tasktracker.model.Status;
import com.kavya.tasktracker.model.Task;

public interface TaskRepository extends JpaRepository< Task, Long>
{

    List<Task> findByStatus (Status status);

    List<Task> findByName(String name);
}
