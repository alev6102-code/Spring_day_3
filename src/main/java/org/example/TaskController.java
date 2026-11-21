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
public TaskResponse create(@RequestBody CreateTaskRequest createTaskRequest){
       return taskService.create(createTaskRequest);
}
@GetMapping
public List<TaskResponse> getAll(@RequestParam(required = false ) TaskStatus status) {
        return taskService.findAll(status);
}

@GetMapping("/{id}")
    public TaskResponse getById(@PathVariable int id) {
        return taskService.findById(id);
    }
}
