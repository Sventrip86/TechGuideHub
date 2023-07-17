package com.techguidehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.techguidehub.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
}
