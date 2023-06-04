package com.jayptl08.microservice.userservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jayptl08.microservice.userservice.model.User;

public interface UserRepository extends MongoRepository<User,String> {
    
}
