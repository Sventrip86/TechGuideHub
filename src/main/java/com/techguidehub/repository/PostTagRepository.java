package com.techguidehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.techguidehub.model.PostTag;

public interface PostTagRepository extends JpaRepository<PostTag, Long> {
}
