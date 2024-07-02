package org.wildcodeschool.BlogApplication.models;

import jakarta.persistence.*;

@Entity
public class Category {
    @Id
    private long id;
    private String name;

        //Getter & Setter

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
