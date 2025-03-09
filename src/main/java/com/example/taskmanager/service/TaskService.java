package com.example.taskmanager.service;

import java.util.List;
import java.util.Optional;

import com.example.taskmanager.model.Task;

public interface TaskService {

    Task createTask(Task task);
    List<Task> getAllTasks();
    Optional<Task> getTaskByIdOptional(Long id);
    Task updateTask(Long id, Task updatedTask);
    void deleteTask(Long id);
    List<Task> getCompletedTasks();
}
