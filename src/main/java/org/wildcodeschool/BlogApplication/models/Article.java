package org.wildcodeschool.BlogApplication.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private int category_id;

    //Constructeur

    public Article() {
    }

    public Article(int category_id, String content, LocalDateTime createdAt, Long id, String title, LocalDateTime updatedAt) {
        this.category_id = category_id;
        this.content = content;
        this.createdAt = createdAt;
        this.id = id;
        this.title = title;
        this.updatedAt = updatedAt;
    }

    // Getters et setters

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

    public int getCategory_id() {
        return category_id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }
}