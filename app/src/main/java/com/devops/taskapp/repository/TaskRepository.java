package com.devops.taskapp.repository;

import com.devops.taskapp.entity.Task;
import com.devops.taskapp.enums.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(TaskStatus status);
}