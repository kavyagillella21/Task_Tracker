package com.kavya.tasktracker.model;

public class Task {
    private Long id;

    private String name;
    private String description;
    private Status status;

    public String getName()
    {
        return this.name;
    }
    public Status getStatus()
    {
        return this.status;
    }
    public String getDescription()
    {
        return this.description;
    }
    public Long getId()
    {
        return this.id;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setStatus(Status status)
    {
        this.status = status;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    /*setId should not be used as the database assigns id but it is 
    expected so it exists. */
    public void setId(Long id)
    {
        this.id = id;
    }

    public Task()
    {
        status = Status.TO_DO;
    }

    public Task(String name, String description)
    {
        status = Status.TO_DO;
        this.name = name;
        this.description = description;
    }
    
}
