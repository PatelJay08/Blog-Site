package com.jayptl08.microservice.userservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "User")
public class User {

    @Id
    private String userId;

    private String userName;
    private String email;
    private String photoURL;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    public User() {
    }

    public User(String userId, String userName, String email, String photoURL) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.photoURL = photoURL;
    }

}
