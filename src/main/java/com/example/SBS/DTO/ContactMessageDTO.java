package com.example.SBS.DTO;

import java.time.LocalDateTime;

public class ContactMessageDTO {

    private String fullName;
    private String email;
    private String message;
    private String subject;
    private LocalDateTime createdAt;

    // Constructor
    public ContactMessageDTO(String fullName, String email, String message, LocalDateTime createdAt, String subject) {
        this.fullName = fullName;
        this.email = email;
        this.message = message;
        this.createdAt = createdAt;
        this.subject = subject; // Assign the subject parameter
    }

    // Getters and Setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}