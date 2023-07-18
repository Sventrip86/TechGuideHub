package com.techguidehub.model;


import jakarta.persistence.*;


@Entity
@Table(name = "Questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long questionId;
    private String title;
    private String body;

    public Long getQuestionId() {
        return questionId;
    }
    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
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


    @ManyToOne
    @JoinColumn( name = "userId")
    
    private User user;

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    
}
