package com.techguidehub.techguidehub.model;




import jakarta.persistence.*;


@Entity
@Table(name = "Answers")
public class Answer {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long answerId;
    private String body;


    @ManyToOne
    @JoinColumn( name = "questionId")

    private Question question;

    public Question getQuestion() {
        return question;
    }


    public void setQuestion(Question question) {
        this.question = question;
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
