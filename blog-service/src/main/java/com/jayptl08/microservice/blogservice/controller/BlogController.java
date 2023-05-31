package com.jayptl08.microservice.blogservice.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jayptl08.microservice.blogservice.model.Blog;
import com.jayptl08.microservice.blogservice.service.BlogService;

@RestController
@RequestMapping("/blog-service")
public class BlogController {

    private final BlogService service;

    public BlogController(BlogService service) {
        this.service = service;
    }

    // New Blog
    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public void createBlog(@RequestBody Blog blog) {
        System.out.println(blog.getContent());
        blog.setId(UUID.randomUUID().toString());
        service.createBlog(blog);
    }

    // Get All Blogs
    @GetMapping("/blog/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Blog> getAllBlogs(){
        return service.getAllBlogs();
    }

    //  Get a blog by it's id
    @GetMapping("/blog/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Blog> getBlogById(@PathVariable String id){
        return service.findBlogById(id);
    }

    @PutMapping("/blog/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateBlog(@PathVariable String id,@RequestBody Blog blog){
        service.updateBlog(id, blog);
    }

    // Get all blogs by user id
    @GetMapping("/blog/user/{userId}/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Blog> getAllBlogsOfuser(@PathVariable String userId){
        return service.getBlogOfuser(userId);
    }

    // Get all blogs by category 
    @GetMapping("/blog/category/{category}")
    @ResponseStatus(HttpStatus.OK)
    public List<Blog> getAllBlogByCategory(@PathVariable String category){
        return service.getAllBlogsByCategory(category);
    }

    // Get all blogs by a user and category
    @GetMapping("/blog/user/{userId}/category/{category}")
    @ResponseStatus(HttpStatus.OK)
    public List<Blog> getAllBlogsByuserAndCategory(@PathVariable String userId, @PathVariable String category ){
        return service.getAllBlogsByuserAndCategory(userId, category);
    }

    // Delete blog by it's id
    @DeleteMapping("/blog/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteBlogById(@PathVariable String id){
        service.deleteBlogById(id);
    }

}
