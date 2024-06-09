package com.example.proyekt.dao.requests;

import com.example.proyekt.enums.PointEnum;
import com.example.proyekt.enums.TaskPriorityEnum;
import com.example.proyekt.enums.TaskStatusEnum;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class TaskRequest {
    @NotBlank(message = "Description is required")
    @Min(value=3, message="Description should be at least 3 character")
    private String descriptiom;
    private LocalDateTime deadline;
    private PointEnum point;
    private TaskPriorityEnum taskPriority;
    private TaskStatusEnum taskStatus;
    private Integer userId;
}
