package com.example.proyekt.services.impl;

import com.example.proyekt.dao.requests.TaskRequest;
import com.example.proyekt.entities.Task;
import com.example.proyekt.entities.User;
import com.example.proyekt.repositories.TaskRepository;
import com.example.proyekt.repositories.UserRepository;
import com.example.proyekt.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;
    private final UserRepository userRepository;

    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository, UserRepository userRepository) {
        this.taskRepository = taskRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<Task> list() {
        return taskRepository.findAll();
    }

    @Override
    public void create(TaskRequest taskRequest) {
        Task task = Task.builder()
                .descriptiom(taskRequest.getDescriptiom())
                .taskStatus(taskRequest.getTaskStatus())
                .taskPriority(taskRequest.getTaskPriority())
                .deadline(taskRequest.getDeadline())
                .build();
        taskRepository.save(task);
    }

    @Override
    public List<Task> update() {
        return null;
    }
}
