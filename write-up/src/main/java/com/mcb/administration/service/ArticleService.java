package com.mcb.administration.service;

import com.mcb.administration.Entity.ArticleEntity;
import com.mcb.administration.Repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {

    @Autowired
    ArticleRepository articleRepository;

    public List<ArticleEntity> getAllArticles(){
        List<ArticleEntity> articleEntities = articleRepository.findAll();
        if (articleEntities.size()>0){
            return articleEntities;
        }else {
            return new ArrayList<ArticleEntity>();
        }
    }

    public ArticleEntity createOrUpdateArticle(ArticleEntity articleEntity){
        Optional<ArticleEntity> entity = articleRepository.findById(articleEntity.getId());
        if (entity.isPresent()){
            articleEntity = entity.get();
        }else {
            articleEntity = articleRepository.save(articleEntity);
        }
        return articleEntity;
    }
}
