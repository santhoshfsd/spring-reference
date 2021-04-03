package com.mcb.administration.controller;

import com.mcb.administration.Entity.ArticleEntity;
import com.mcb.administration.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/articles")
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @GetMapping
    public ResponseEntity<List<ArticleEntity>> getAllArticles(){
        List<ArticleEntity> list = articleService.getAllArticles();
        return new ResponseEntity<List<ArticleEntity>>(list,new HttpHeaders(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ArticleEntity> createOrUpdateArticle(@RequestBody ArticleEntity articleEntity){
        ArticleEntity updated = articleService.createOrUpdateArticle(articleEntity);
        return  new ResponseEntity<ArticleEntity>(articleEntity,new HttpHeaders(),HttpStatus.OK);
    }

  /*  @GetMapping("/{id}")
    public ResponseEntity<ArticleEntity> getArticleById(@PathVariable("slug")String slug){
        ArticleEntity articleEntity = articleService.getArtileBySlug(slug);
        return new ResponseEntity<ArticleEntity>(articleEntity,new HttpHeaders(),HttpStatus.OK);
    }

    @DeleteMapping
    public HttpStatus deleteArticleBySlug(@PathVariable("slug")String slug){
        articleService.deleteArticleBySlug(slug);
        return HttpStatus.FORBIDDEN;
    }*/
}
