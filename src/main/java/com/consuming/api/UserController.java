package com.consuming.api;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private UserService userService =new UserService();
    @PostMapping("/users")
    public void postUser(@RequestBody User user){
        userService.addUser(user);
    }
    @GetMapping("/users")
    public List<User> getUser(){
        return userService.getUser();
    }
}
