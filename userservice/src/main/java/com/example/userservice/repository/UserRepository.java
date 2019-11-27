package com.example.userservice.repository;
import com.example.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByClientEmail(String email);
    Optional<User> findById(UUID id);
    List<User> findAll();
}
