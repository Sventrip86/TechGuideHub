package com.techguidehub.techguidehub.model;
import jakarta.persistence.*;

@Entity
@Table(name = "PostTags")
public class PostTag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "postId")
    private Post post;

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @ManyToOne
    @JoinColumn(name = "tagId")
    private Tag tag;

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    // Constructors, Getters and Setters

    // postId and tagId are the names of the columns in the PostTag table.
    // They serve as foreign keys referencing the primary keys of the Post and Tag tables.
    // @ManyToOne annotation indicates that each PostTag can be associated with one Post and one Tag.
    // @JoinColumn annotation specifies the foreign key.
}

