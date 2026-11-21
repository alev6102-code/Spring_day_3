package org.example;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class TaskRepository {
private final Map<Integer,Task> tasks = new LinkedHashMap<>();



    public List<Task> findAll() {
     return  new ArrayList<>(tasks.values());
}

public Task  save(Task task) {
    tasks.put(task.getId(), task);
    return task;
}

public Task findById(int id) {
    return tasks.get(id);
}

}
