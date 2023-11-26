package org.devbox.devLab1.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.devbox.devLab1.model.Task;
import org.devbox.devLab1.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class TaskService {

    private final TaskRepository taskRepository;
    private final WebClient webClient;

    @Value("${external.service.url}") // Add the URL of the external service in your application.properties
    private String externalServiceUrl;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task getTaskById(Long taskId) {
        return taskRepository.findById(taskId).orElse(null);
    }

    public Task createTask(Task task) {
        taskRepository.save(task);

        log.info("Task {} created", task.getId());
        return task;
    }

    // Other service methods
}