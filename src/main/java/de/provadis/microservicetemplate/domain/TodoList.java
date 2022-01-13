package de.provadis.microservicetemplate.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TodoList {

    List<Task> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void add(Task todo) {
        if (todo == null) {
            throw new IllegalArgumentException("todo must not be null");
        }
        tasks.add(todo);
    }

    public List<Task> getOpenTasks() {
        return tasks.stream().filter(t -> !t.finished).collect(Collectors.toList());
    }
}
