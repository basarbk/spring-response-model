package com.bafoly.responsemodel.article;

import lombok.Data;

@Data
public class ArticleDTO {
  
  String title;

  String content;

  public ArticleDTO(Article article){
    this.setTitle(article.getTitle());
    this.setContent(article.getContent());
  }
}
