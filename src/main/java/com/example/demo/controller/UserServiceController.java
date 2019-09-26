package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserServiceController {

    @Autowired
    private UserService userService;

    @GetMapping("/service/user")
    public List<User> getUsers() {
        return userService.getUsers();
    }

}
