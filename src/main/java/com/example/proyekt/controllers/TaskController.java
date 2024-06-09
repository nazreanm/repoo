package com.example.proyekt.controllers;

import com.example.proyekt.dao.requests.TaskRequest;
import com.example.proyekt.entities.Task;
import com.example.proyekt.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/tasks")
public class TaskController {
    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/")
    public List<Task> list(){
        return taskService.list();
    }

    @PostMapping("/{id")
    public void create(TaskRequest taskRequest){
        taskService.create(taskRequest);
    }
}

