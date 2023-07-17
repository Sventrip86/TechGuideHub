package com.techguidehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techguidehub.model.Post;


public interface PostRepository extends JpaRepository<Post, Long> {
}
