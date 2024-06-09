package com.example.proyekt.entities;

import com.example.proyekt.enums.PointEnum;
import com.example.proyekt.enums.TaskPriorityEnum;
import com.example.proyekt.enums.TaskStatusEnum;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Table(name="tasks")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Task {
    @Id
    @SequenceGenerator(name = "task_id", sequenceName = "task_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "task_id")
    private Integer id;
    private String descriptiom;
    private LocalDateTime deadline;
    private PointEnum point;
    private TaskPriorityEnum taskPriority;
    private TaskStatusEnum taskStatus;

    @ManyToMany(mappedBy = "userTasks")
    @JsonBackReference
    private List<User> taskUsers;
}

