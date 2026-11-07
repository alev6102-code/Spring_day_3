package org.example;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class TaskService {
    private final TaskRepository taskRepository;
    private int nextId = 0;

    public TaskService(TaskRepository taskRepository) {

        this.taskRepository = taskRepository;

    }

    public List<TaskResponse> findAll(TaskStatus status) {
        return taskRepository.findAll().stream()
                .filter(task -> status == null || task.getStatus() == status)
                .map(task -> new TaskResponse(
                        task.getId(),
                        task.getTitle(),
                        task.getDescription(),
                        task.getPriority(),
                        task.getStatus()
                ))
                .toList();

    }


    public TaskResponse findById(int id) {
        Task task = taskRepository.findById(id);
       return new TaskResponse(task.getId(), task.getTitle(), task.getDescription(), task.getPriority(), task.getStatus());
    }

    public TaskResponse create(CreateTaskRequest taskRequest) {
        taskRepository.save(new Task(nextId++, taskRequest.getTitle(), taskRequest.getDescription(), taskRequest.getPriority(), TaskStatus.NEW));
        return new TaskResponse(nextId, taskRequest.getTitle(), taskRequest.getDescription(), taskRequest.getPriority(), TaskStatus.NEW);
    }
}

