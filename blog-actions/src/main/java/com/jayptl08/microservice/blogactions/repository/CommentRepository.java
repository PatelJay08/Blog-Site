package com.jayptl08.microservice.blogactions.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jayptl08.microservice.blogactions.model.Comment;

public interface CommentRepository extends MongoRepository<Comment, String> {
    List<Comment> findAllByBlogId(String blogId);
    List<Comment> findAllByUserId(String userId);
}
