package com.jayptl08.microservice.blogactions.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "comment")
public class Comment {

    @Id
    private String commentId;

    private String blogId;
    private String userId;
    private String comment;

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Comment() {
    }

    public Comment(String commentId, String blogId, String userId, String comment) {
        this.commentId = commentId;
        this.blogId = blogId;
        this.userId = userId;
        this.comment = comment;
    }

}
