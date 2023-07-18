package com.techguidehub.controller;

import com.techguidehub.model.Comment;
import com.techguidehub.service.CommentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {
     
    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping
    public List<Comment> getAllComments(){
        return commentService.getAllComments();
    }

    @GetMapping("/{id}")
    public Comment getComment(@PathVariable Long id) {
        return commentService.getCommentById(id);
    }

    @PostMapping
    public Comment createComment(@RequestBody Comment comment) {
        return commentService.createComment(comment);
    }

    @PutMapping("/{id}")
    public Comment updateComment(@PathVariable Long id, @RequestBody Comment comment) {
        comment.setCommentId(id);
        return commentService.updateComment(comment);
    }

    @DeleteMapping("/{id}")
    public void deleteComment(@PathVariable Long id) {
        commentService.deleteComment(id);
    }


}
