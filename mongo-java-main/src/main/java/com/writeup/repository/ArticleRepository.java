package com.writeup.repository;

import com.writeup.model.Article;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ArticleRepository extends MongoRepository<Article, String> {

    Optional<Article> findBySlug(String slug);
    Long deleteBySlug(String s);
}
