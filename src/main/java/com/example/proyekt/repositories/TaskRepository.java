package com.example.proyekt.repositories;

import com.example.proyekt.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task,Integer> {
    List<Task> findAllByDeadlineAfter(LocalDateTime deadline);
    List<Task> findAllByDeadlineEquals(LocalDateTime deadline);
    List<Task> findAllByDeadlineBetween(LocalDateTime startAt, LocalDateTime endAt);
}
