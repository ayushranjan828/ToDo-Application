package com.todo.todolist.Repository;

import com.todo.todolist.Model.Task;
import com.todo.todolist.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByUser(User user);
}