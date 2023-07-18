package com.techguidehub.model;

import jakarta.persistence.*;


@Entity
@Table( name = "Posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;
    private String title;
    private String body;
    private String type;

    public Long getPostId() {
        return postId;
    }
    public void setPostId(Long postId) {
        this.postId = postId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }


    @ManyToOne
    @JoinColumn( name = "userId")
    private User user;

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }



    @ManyToOne
    @JoinColumn( name = "categoryId")
    private Category category;

    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }

    




}
