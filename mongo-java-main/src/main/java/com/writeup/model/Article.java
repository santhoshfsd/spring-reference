package com.writeup.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Article {
    @Id
    private String id;

    private String slug;

    private String title;

    private String description;

    private String[] tag;


}
