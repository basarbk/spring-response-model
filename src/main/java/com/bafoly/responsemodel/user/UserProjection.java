package com.bafoly.responsemodel.user;

import org.springframework.beans.factory.annotation.Value;

public interface UserProjection {

  @Value("#{target.username + ' ' + target.lastname.toUpperCase()}")
  String getFullName();
  
  String getEmail();

  @Value("#{target.articles.size()}")
  int getArticleCount();
  
}
