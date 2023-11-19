package org.devbox.devLab1.repository;

import org.devbox.devLab1.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // Additional methods if needed
}