package com.example.proyekt.services;

import com.example.proyekt.dao.requests.TaskRequest;
import com.example.proyekt.entities.Task;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface TaskService {
    List<Task> list();
    void create(TaskRequest taskRequest);
    List<Task> update();
}
