package com.example.securenotes.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.Instant;


public class NotesDto {
    public Long id;
    @NotBlank(message = "Title cannot be empty")
    @Size(max = 100, message = "Title cannot exceed 200 characters")
    public String title;
    @NotNull(message = "Content cannot be null")
    @Size(max = 1000, message = "Content cannot exceed 1000 characters")
    public String content;
    public Instant createdAt;
    public Instant updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }
}
