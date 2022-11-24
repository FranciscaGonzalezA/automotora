package com.generation.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.generation.project.model.User;
import com.generation.project.service.UserService;


@CrossOrigin("*")
@RestController
public class UserController {
    private UserService userService;

    public UserController(@Autowired UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Integer id) { //para enviar dato desde la url
        return userService.getUser(id);
    }

    @PostMapping("/user")
    public User newUser(@RequestBody User user) { //para enviar dato desde el cuerpo (postman)
        return userService.save(user);
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user) {
        return userService.save(user);
    }

    @DeleteMapping("/deleteUser/{id}") 
    public void deleteUser(@PathVariable Integer id) {
        userService.delete(id);
        return;
    }
}
