package org.devbox.devLab1.model;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;

    public User(long l, String user1) {
    }

    public String getUsername() {
        return username;
    }
    // Other fields, getters, and setters
}