package org.wildcodeschool.BlogApplication.models;

import jakarta.persistence.*;

@Entity
public class Article_tag {
    private long article_id;
    private long image_id;

    public Article_tag() {
    }

    public Article_tag(long article_id, long image_id) {
        this.article_id = article_id;
        this.image_id = image_id;
    }
    @Id

    //Construteur


    //Getter & Setter
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public long getImage_id() {
        return image_id;
    }

    public void setImage_id(long image_id) {
        this.image_id = image_id;
    }
}
