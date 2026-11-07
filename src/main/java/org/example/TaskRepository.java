package org.example;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class TaskRepository {
private final List<Task> tasks = new LinkedList<>();

    public List<Task> getTasks() {
        return tasks;
    }

    public List<Task> findAll() {
     return  this.tasks;
}

public void  save(Task task) {
    tasks.add(task);

}

public Task findById(int id) {
    return tasks.get(id);
}

}
