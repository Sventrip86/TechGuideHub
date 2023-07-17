package com.techguidehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techguidehub.model.Tag;


public interface TagRepository extends JpaRepository<Tag, Long> {
}
