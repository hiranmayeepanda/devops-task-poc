package com.devops.taskapp.service;

import com.devops.taskapp.dto.TaskRequestDTO;
import com.devops.taskapp.dto.TaskResponseDTO;
import com.devops.taskapp.enums.TaskStatus;
import java.util.List;

public interface TaskService {

    TaskResponseDTO createTask(TaskRequestDTO dto);

    List<TaskResponseDTO> getAllTasks();

    TaskResponseDTO updateTask(Long id, TaskRequestDTO dto);

    void deleteTask(Long id);

    List<TaskResponseDTO> getTasksByStatus(TaskStatus status);
}