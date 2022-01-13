package de.provadis.microservicetemplate.adapters.out.persistence;

import de.provadis.microservicetemplate.domain.Task;
import de.provadis.microservicetemplate.domain.TodoList;
import org.springframework.data.annotation.Id;

import java.util.List;

public class TodoListEntity {
    @Id
    public String id;

    public List<String> tasks;

    public TodoList toDomain() {
        TodoList todos = new TodoList();

        tasks.forEach(t -> todos.add(new Task(t)));
        return todos;
    }
}
