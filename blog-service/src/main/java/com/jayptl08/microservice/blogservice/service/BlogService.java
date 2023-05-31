package com.jayptl08.microservice.blogservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jayptl08.microservice.blogservice.model.Blog;
import com.jayptl08.microservice.blogservice.repository.BlogRepository;

@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public BlogService(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    public void createBlog(Blog blog) {
        blogRepository.save(blog);
    }

    public List<Blog> getAllBlogs() {
        return blogRepository.findAll();
    }


    public Optional<Blog> findBlogById(String Id){
        return blogRepository.findById(Id);
    }

    public void deleteBlogById(String id) {
        blogRepository.deleteById(id);
    }

    public void updateBlog(String id,Blog blog){
        blogRepository.save(blog);
    }

    public List<Blog> getBlogOfuser(String userId) {
        return blogRepository.findByuserId(userId);
    }

    public List<Blog> getAllBlogsByCategory(String category){
        return blogRepository.findByCategory(category);
    }

    public List<Blog> getAllBlogsByuserAndCategory(String userId,String category){
        return blogRepository.findByuserIdAndCategory(userId, category);
    }

}
