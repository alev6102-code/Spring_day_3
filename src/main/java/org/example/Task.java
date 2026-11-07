package org.example;

public class Task {
    private final int id;
    private final String title;
    private final String description;
    private final TaskPriority priority;
    private final TaskStatus status;
    public Task(int id,String title, String description, TaskPriority priority, TaskStatus status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.status = status;
    }
    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public String getTitle() {
        return title;
    }
}
