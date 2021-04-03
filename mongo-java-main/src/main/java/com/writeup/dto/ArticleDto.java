package com.writeup.dto;

import java.util.ArrayList;

public class ArticleDto {
    private  String title;
    private  String description;
    private  String body;
    private ArrayList<String> tag;


    public ArticleDto(String title, String description, String body, ArrayList<String> tag) {
        this.title = title;
        this.description = description;
        this.body = body;
        this.tag = tag;
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

    public ArrayList<String> getTag() {
        return tag;
    }

    public void setTag(ArrayList<String> tag) {
        this.tag = tag;
    }
}
