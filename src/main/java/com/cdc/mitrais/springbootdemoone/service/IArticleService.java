package com.cdc.mitrais.springbootdemoone.service;

import java.util.List;

import com.cdc.mitrais.springbootdemoone.model.Article;



public interface IArticleService {
     List<Article> getAllArticles();
     Article getArticleById(int articleId);
     boolean addArticle(Article article);
     void updateArticle(Article article);
     void deleteArticle(int articleId);
}
