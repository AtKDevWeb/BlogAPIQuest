package org.wildcodeschool.BlogApplication.models;

import jakarta.persistence.*;

@Entity
public class Tag {
    private long idTag;
    private String nameTag;

    public Tag() {

    }

    public Tag(long idTag, String nameTag) {
        this.idTag = idTag;
        this.nameTag = nameTag;
    }

    public long getIdTag() {
        return idTag;
    }

    public void setIdTag(long idTag) {
        this.idTag = idTag;
    }

    public String getNameTag() {
        return nameTag;
    }

    public void setNameTag(String nameTag) {
        this.nameTag = nameTag;
    }
}
