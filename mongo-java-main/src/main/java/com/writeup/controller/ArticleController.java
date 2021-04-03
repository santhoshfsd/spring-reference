package com.writeup.controller;

import com.writeup.model.Article;
import com.writeup.repository.ArticleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/article")
public class ArticleController {

    private ArticleRepository articleRepository;

    public ArticleController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @GetMapping
    public ResponseEntity getArticles(){
        return null;
    }
    @GetMapping("/{slugId}")
    public ResponseEntity getArticleById(@PathVariable String slugId){
        Optional Article = articleRepository.findBySlug(slugId);
        if(Article.isEmpty()) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(Article.get(),HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteById(@PathVariable String id){
        articleRepository.deleteBySlug(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PostMapping
    public ResponseEntity createArticle(@RequestBody Article article){
        String slug = article.getTitle().replace(" ", "-");
        article.setSlug(slug);
        articleRepository.insert(article);
        return new ResponseEntity(article, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity updateArticle(){
        return null;
    }




}
