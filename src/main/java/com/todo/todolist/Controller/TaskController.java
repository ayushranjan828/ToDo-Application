package com.todo.todolist.Controller;

import com.todo.todolist.Model.Task;
import com.todo.todolist.Security.CustomUserDetails;
import com.todo.todolist.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping
    public String taskList(Model model, @AuthenticationPrincipal CustomUserDetails userDetails) {
        model.addAttribute("tasks", taskService.getTasks(userDetails.getUser()));
        return "index";
    }

    @PostMapping("/add")
    public String addTask(@RequestParam String title, @RequestParam String description, @AuthenticationPrincipal CustomUserDetails userDetails) {
        Task task = new Task();
        task.setTitle(title);
        task.setDescription(description);
        task.setCompleted(false);
        task.setUser(userDetails.getUser());
        taskService.saveTask(task);
        return "redirect:/tasks";
    }

    @GetMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "redirect:/tasks";
    }
}