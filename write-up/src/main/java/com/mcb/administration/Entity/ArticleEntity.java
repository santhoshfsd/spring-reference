package com.mcb.administration.Entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "TBL_ARTICLES")
public class ArticleEntity {

    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="slug")
    private String slug;

    @Column(name="title")
    private String title;

    @Column(name="description")
    private String description;

    @Column(name="body")
    private String body;

    @Column(name="tag")
    private String tag;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "ArticleEntity [" +
                "id=" + id + "," +
                "slug=" + slug +"," +
                "title =" + title + ", " +
                "description =" + description  + "," +
                "body =" + body   + "," +
                "tag =" + tag  + "" +
                "]";
    }

}
