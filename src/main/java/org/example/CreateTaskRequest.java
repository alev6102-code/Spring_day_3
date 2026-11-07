package org.example;

public class CreateTaskRequest {
    private final String title;
    private  final String description;
    private final TaskPriority priority;
    private final TaskStatus status;
    public CreateTaskRequest(String title, String description, TaskPriority priority, TaskStatus status) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }
    public TaskStatus getStatus() {
        return status;
    }
}
