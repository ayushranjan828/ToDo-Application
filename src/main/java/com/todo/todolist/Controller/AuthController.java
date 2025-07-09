package com.todo.todolist.Controller;

import com.todo.todolist.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {
    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String showRegister() {
        return "register";
    }

    @PostMapping("/register")
    public String register(@RequestParam String username, @RequestParam String password) {
        userService.registerUser(username, password);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String showLogin() {
        return "login";
    }
}