package com.bafoly.responsemodel.user;

import java.util.List;

import com.bafoly.responsemodel.article.ArticleProjection;

import org.springframework.beans.factory.annotation.Value;

public interface UserProjection {

  @Value("#{target.username + ' ' + target.lastname}")
  String getFullName();
  
  String getEmail();

  List<ArticleProjection> getArticles();
  
}
