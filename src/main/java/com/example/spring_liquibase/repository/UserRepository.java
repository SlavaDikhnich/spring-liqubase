package com.example.spring_liquibase.repository;

import com.example.spring_liquibase.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
