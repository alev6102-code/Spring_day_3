package org.example;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    private final TaskService taskService;
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @PostMapping
public TaskResponse create(@RequestBody(required = false) CreateTaskRequest createTaskRequest){
       return taskService.create(createTaskRequest);
}
@GetMapping
public List<TaskResponse> getTasks(TaskStatus taskStatus) {
        return taskService.findAll(taskStatus);
}

@GetMapping("/{id}")
    public TaskResponse getById(@PathVariable int id) {
        return taskService.findById(id);
    }
}
