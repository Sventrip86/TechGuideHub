package com.techguidehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techguidehub.model.Comment;


public interface CommentRepository extends JpaRepository<Comment, Long> {
}
