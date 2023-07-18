package com.techguidehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.techguidehub.model.Answer;


public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
