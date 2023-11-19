package org.devbox.devLab1.repository;

import org.devbox.devLab1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Additional methods if needed
}