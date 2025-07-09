package com.todo.todolist.Service;

import com.todo.todolist.Model.Task;
import com.todo.todolist.Model.User;
import com.todo.todolist.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getTasks(User user) {
        return taskRepository.findByUser(user);
    }

    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}