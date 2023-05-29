package com.jayptl08.microservice.blogservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jayptl08.microservice.blogservice.model.Blog;


public interface BlogRepository extends JpaRepository<Blog,String> {
    List<Blog> findByAutherId(String autherId);
    List<Blog> findByCategory(String category);
    List<Blog> findByAutherIdAndCategory(String autherId,String category);
}
