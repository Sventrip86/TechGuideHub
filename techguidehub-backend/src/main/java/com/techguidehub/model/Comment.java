package com.techguidehub.model;


import jakarta.persistence.*;


@Entity
@Table(name = "Comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;
    private String body;
    private String type;

    public Long getCommentId() {
        return commentId;
    }
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
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
