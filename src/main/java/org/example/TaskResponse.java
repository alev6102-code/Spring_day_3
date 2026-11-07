package org.example;

public class TaskResponse {
    private final int id;
    private final String description;
    private final String title;
    private final TaskStatus status;
    private final TaskPriority priority;

    public TaskResponse(int id, String title, String description,TaskPriority priority, TaskStatus status) {
        this.id = id;
        this.description = description;
        this.title = title;
        this.priority = priority;
        this.status = status;
    }
    public int getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }
    public String getTitle() {
        return title;
    }
    public TaskStatus getStatus() {
        return status;
    }
    }

