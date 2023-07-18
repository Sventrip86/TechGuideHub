package com.techguidehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techguidehub.model.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {
}
