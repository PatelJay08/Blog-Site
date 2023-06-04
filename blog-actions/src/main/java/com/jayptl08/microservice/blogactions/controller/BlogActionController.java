package com.jayptl08.microservice.blogactions.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jayptl08.microservice.blogactions.model.Comment;
import com.jayptl08.microservice.blogactions.service.CommentService;

@RestController
@RequestMapping("/blog-actions")
public class BlogActionController {

    private final CommentService service;

    public BlogActionController(CommentService service) {
        this.service = service;
    }

    @PostMapping("/comment/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Comment addNewComment(@RequestBody Comment comment) {
        comment.setCommentId(UUID.randomUUID().toString());
        return service.addNewComment(comment);
    }

    @GetMapping("/comment/commentid/{commentId}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Comment> getAComment(@PathVariable String commentId) {
        return service.getAComment(commentId);
    }

    @GetMapping("/comment/blogid/{blogId}")
    @ResponseStatus(HttpStatus.OK)
    public List<Comment> getCommentsByBlogId(@PathVariable String blogId) {
        return service.getCommentsByBlogId(blogId);
    }

    @GetMapping("/comment/userid/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public List<Comment> getCommentsByUserId(@PathVariable String userId) {
        return service.getCommentsByUserId(userId);
    }

    @DeleteMapping("/comment/commentid/{commentId}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteComment(@PathVariable String commentId) {
        service.deleteComment(commentId);
    }
}
