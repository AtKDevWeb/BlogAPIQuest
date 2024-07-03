package org.wildcodeschool.BlogApplication.models;

import jakarta.persistence.*;

@Entity
public class Tag {
    private long id;
    private String name;

    public Tag() {

    }

    public Tag(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setIdTag(long id) {
        this.id = id;
    }

    public String getNameTag() {
        return name;
    }

    public void setNameTag(String name) {
        this.name = name;
    }
}
