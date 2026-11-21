package org.example;

public class CreateTaskRequest {
    private final String title;
    private  final String description;
    private final TaskPriority priority;
    public CreateTaskRequest(String title, String description, TaskPriority priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
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

}
