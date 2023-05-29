package com.jayptl08.microservice.blogservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Blog {

    @Id
    private String id;

    private String autherId;
    private String title;
    @Lob
    private String content;
    private String category;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAutherId() {
        return autherId;
    }

    public void setAutherId(String autherId) {
        this.autherId = autherId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Blog() {
    }

    public Blog(String id, String autherId, String title, String content, String category) {
        this.id = id;
        this.autherId = autherId;
        this.title = title;
        this.content = content;
        this.category = category;
    }

}
