package com.jayptl08.microservice.blogactions.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jayptl08.microservice.blogactions.model.Comment;
import com.jayptl08.microservice.blogactions.repository.CommentRepository;

@Service
public class CommentService {

    private final CommentRepository repository;

    public CommentService(CommentRepository repository) {
        this.repository = repository;
    }

    public Comment addNewComment(Comment comment){
        return repository.save(comment);
    }

    public Optional<Comment> getAComment(String commentId){
        return repository.findById(commentId);
    }

    public List<Comment> getCommentsByBlogId(String blogId){
        return repository.findAllByBlogId(blogId);
    }
    public List<Comment> getCommentsByUserId(String userId){
        return repository.findAllByUserId(userId);
    }

}
