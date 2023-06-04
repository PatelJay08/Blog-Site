package com.jayptl08.microservice.userservice.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jayptl08.microservice.userservice.model.User;
import com.jayptl08.microservice.userservice.repository.UserRepository;

@Service
public class UserService {
    
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User addNewUser(User user){
        return repository.save(user);
    }

    public Optional<User> getUserInfo(String userId){
        return repository.findById(userId);
    }

}
