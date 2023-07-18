package com.techguidehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techguidehub.model.Question;


public interface QuestionRepository extends JpaRepository<Question, Long> {
}
