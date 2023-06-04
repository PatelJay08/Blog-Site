package com.jayptl08.microservice.userservice.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jayptl08.microservice.userservice.model.User;
import com.jayptl08.microservice.userservice.service.UserService;

@RestController
@RequestMapping("/user-service")
public class UserController {
    
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/user/new")
    @ResponseStatus(HttpStatus.CREATED)
    public User addNewUser(@RequestBody User user){
        return service.addNewUser(user);
    }    

    @GetMapping("/user/userId/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<User> getUserInfo(@PathVariable String userId){
        return service.getUserInfo(userId);
    }


}
