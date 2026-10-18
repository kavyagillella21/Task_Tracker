package com.kavya.tasktracker.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidTaskException extends RuntimeException{

    public InvalidTaskException()
    {
        super("Enter name for task.");
    }
    
}
